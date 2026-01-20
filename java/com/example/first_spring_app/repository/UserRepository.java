package com.example.first_spring_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.first_spring_app.Domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // CRUD já vem pronto
}
