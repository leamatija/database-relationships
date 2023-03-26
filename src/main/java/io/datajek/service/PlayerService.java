package io.datajek.service;

import io.datajek.onetomany.Registration;
import io.datajek.onetoone.Player;
import io.datajek.onetoone.PlayerProfile;
import io.datajek.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;


    public List<Player> allPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerById(Integer id){
        return playerRepository.findById(id).get();
    }

    public Player addPLayer(Player player){
        player.setId(0);
        return playerRepository.save(player);
    }

    public void deletePlayer (Integer id){
        playerRepository.deleteById(id);
    }


    public Player addProfileToPlayer (Integer id, PlayerProfile playerProfile){
        Player player=playerRepository.findById(id).get();
        player.setPlayerProfile(playerProfile);
        return playerRepository.save(player);
    }

    public Player addRegistrationToPLayer (Integer id, Registration rg){
        Player player =playerRepository.findById(id).get();
        player.registerPLayer(rg);
        return playerRepository.save(player);
    }


}
