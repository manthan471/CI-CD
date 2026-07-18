package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface userRepository extends JpaRepository<User,Integer>{

}
