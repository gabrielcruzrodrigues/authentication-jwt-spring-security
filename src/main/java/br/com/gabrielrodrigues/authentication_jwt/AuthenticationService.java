package br.com.gabrielrodrigues.authentication_jwt;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public String authenticate() {
        return "token";
    }
}
