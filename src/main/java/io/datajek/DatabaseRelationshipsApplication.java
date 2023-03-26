package io.datajek;

import io.datajek.onetomany.Registration;
import io.datajek.onetomany.Tournament;
import io.datajek.onetoone.Player;
import io.datajek.onetoone.PlayerProfile;
import io.datajek.repository.PlayerRepository;
import io.datajek.repository.RegistrationRepository;
import io.datajek.repository.TournamentRepository;
import io.datajek.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class DatabaseRelationshipsApplication implements CommandLineRunner {
	@Autowired
	PlayerService playerService;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseRelationshipsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Player p1=new Player("PLayer1");
//		Player p2=new Player("PLayer2");
//		Player p3=new Player("PLayer3");
//		Player p4=new Player("PLayer4");
//
//		//Adding players to table player
//		playerService.addPLayer(p1);
//		playerService.addPLayer(p2);
//		playerService.addPLayer(p3);
//		playerService.addPLayer(p4);
//
//		//Print player with id 3
//		System.err.println(playerService.getPlayerById(3));
//
//		//adding twitter profiles
//		PlayerProfile pp1= new PlayerProfile("@player1");
//		PlayerProfile pp2= new PlayerProfile("@player2");
//		PlayerProfile pp3= new PlayerProfile("@player3");
//		PlayerProfile pp4= new PlayerProfile("@player4");
//
//		//adding twitter profiles to players
//		playerService.addProfileToPlayer(1,pp1);
//		playerService.addProfileToPlayer(2,pp2);
//		playerService.addProfileToPlayer(3,pp3);
//		playerService.addProfileToPlayer(4,pp4);




	}
}
