package io.datajek.service;

import ch.qos.logback.core.util.DatePatternToRegexUtil;
import io.datajek.onetomany.Registration;
import io.datajek.onetomany.Tournament;
import io.datajek.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {
    @Autowired
    TournamentRepository tournamentRepository;

    public List<Tournament> allTournaments(){
      return tournamentRepository.findAll();
    }

    public Tournament getTournament(Integer id){
        return tournamentRepository.findById(id).get();
    }

    public Tournament addTournament (Tournament t){
        t.setId(0);
        return tournamentRepository.save(t);
    }

    public  void deleteTournament(int id){
        tournamentRepository.deleteById(id);
    }

    public Tournament addRegistration (Integer id,Registration rg){
        Tournament tournament= getTournament(id);
        tournament.addRegistration(rg);
        return tournamentRepository.save(tournament);
    }
}
