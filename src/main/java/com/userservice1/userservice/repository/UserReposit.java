package com.userservice1.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userservice1.userservice.model.User;
@Repository
public interface UserReposit extends JpaRepository<User , Integer> {

}

