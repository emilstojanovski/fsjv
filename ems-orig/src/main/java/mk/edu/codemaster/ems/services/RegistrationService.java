package mk.edu.codemaster.ems.services;

import mk.edu.codemaster.ems.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired private RegistrationRepository registrationRepository;

}