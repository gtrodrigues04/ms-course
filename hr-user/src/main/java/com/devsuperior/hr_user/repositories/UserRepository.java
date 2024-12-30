package com.devsuperior.hr_user.repositories;

import com.devsuperior.hr_user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);

    User findByEmail(String email);
}
