package com.devsuperior.hr_oauth.services;

import com.devsuperior.hr_oauth.entities.User;
import com.devsuperior.hr_oauth.feingclients.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        return userFeignClient.findByEmail(email).getBody();
    }
}
