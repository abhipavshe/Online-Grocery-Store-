package com.abhi.OnlineGroceryStore.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.OnlineGroceryStore.model.User;

import java.util.Optional;

@Repository
@Qualifier("userRepo")
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

