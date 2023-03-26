package io.datajek.dto.mappers;

import io.datajek.dto.PlayerDTO;
import io.datajek.onetoone.Player;
import io.datajek.onetoone.PlayerProfile;

public class PlayerMapper {

    public static PlayerDTO toDto(Player p){
        return PlayerDTO.builder()
                .id(p.getId())
                .name(p.getName())
                .profile(p.getPlayerProfile()!=null?p.getPlayerProfile().getTwitter():null)
                .build();
    }

    public static Player toEntity(PlayerDTO p){
        return Player.builder()
                .id(p.getId())
                .name(p.getName())
                .playerProfile(PlayerProfile.builder()
                        .id(p.getProfileId())
                        .twitter(p.getProfile())
                        .build())
                .build();
    }
}
