package com.example.polls.repository;

import com.example.polls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long>{
    Optional<User> findByEmail(String email);

    Optional<User> findByUserNameOrEmail(String username, String  email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);
}
