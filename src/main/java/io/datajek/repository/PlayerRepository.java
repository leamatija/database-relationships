package io.datajek.repository;

import io.datajek.onetoone.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {

//    List<Player> findAllByNameAndId (String name, Integer id);


}
