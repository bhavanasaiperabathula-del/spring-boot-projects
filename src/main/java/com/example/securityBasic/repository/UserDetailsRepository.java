package com.example.securityBasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.securityBasic.entity.User;

import java.util.Optional;


@Repository
public interface UserDetailsRepository extends JpaRepository<User, Long>{

    Optional<User> findByUsername(String username);

    
}
