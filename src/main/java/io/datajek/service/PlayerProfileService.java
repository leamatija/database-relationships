package io.datajek.service;

import io.datajek.onetoone.PlayerProfile;
import io.datajek.repository.PlayerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerProfileService {

    @Autowired
    PlayerProfileRepository profileRepository;

    public List<PlayerProfile> allPlayerProfiles(){
        return profileRepository.findAll();
    }

    public PlayerProfile getPlayerProfileById(Integer id){
        return profileRepository.findById(id).get();
    }

    public PlayerProfile addPLayerProfile(PlayerProfile playerProfile){
        playerProfile.setId(0);
        return profileRepository.save(playerProfile);
    }

    public void deletePlayerProfile(Integer id){
        PlayerProfile temporaryProfile =profileRepository.findById(id).get();
        temporaryProfile.getPlayer().setPlayerProfile(null);
        temporaryProfile.setPlayer(null);
        profileRepository.save(temporaryProfile);
        profileRepository.delete(temporaryProfile);
    }
}
