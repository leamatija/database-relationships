package io.datajek.service;

import io.datajek.onetomany.Registration;
import io.datajek.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.registry.RegistryHandler;
import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    public List<Registration> allRegistrations(){
        return registrationRepository.findAll();
    }

    public Registration getRegistration(Integer id){
        return registrationRepository.findById(id).get();
    }

    public Registration addRegistration (Registration rg){
        rg.setId(0);
        return registrationRepository.save(rg);
    }
    public void deleteRegistration (Integer id){
        registrationRepository.deleteById(id);
    }
}
