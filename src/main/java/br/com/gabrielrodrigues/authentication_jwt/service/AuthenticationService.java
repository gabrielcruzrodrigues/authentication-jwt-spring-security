package br.com.gabrielrodrigues.authentication_jwt.service;

import br.com.gabrielrodrigues.authentication_jwt.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String authenticate() {
        return "token";
    }
}
