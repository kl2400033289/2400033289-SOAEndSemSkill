package com.klu;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class controller {

    @Autowired
    private service service;

    @PostMapping("/signin")
    public Map<String, String> signIn(@RequestBody model model) {

        String token = service.signIn(model);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }
}