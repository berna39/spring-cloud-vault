package com.terminator.springcloudvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FooController {

    @Autowired
    private Credential credential;

    @GetMapping
    public String index()
    {
        return "Welcome to the application";
    }

    @GetMapping("credentials")
    public ResponseEntity credentials(){
        Map<String, String> body = new HashMap<>();
        body.put("username", credential.getUsername());
        body.put("password", credential.getPassword());
        return ResponseEntity.ok(body);
    }
}
