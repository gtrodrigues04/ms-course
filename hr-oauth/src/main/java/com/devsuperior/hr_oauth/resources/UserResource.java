package com.devsuperior.hr_oauth.resources;

import com.devsuperior.hr_oauth.entities.User;
import com.devsuperior.hr_oauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping("/search")
    public ResponseEntity<UserDetails> findByEmail(@RequestParam String email) {
        return ResponseEntity.ok(service.loadUserByUsername(email));
    }
}
