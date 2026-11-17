package com.klu;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class service {

    public String signIn(model model) {

        String token = UUID.randomUUID().toString();

        return token;
    }
}
