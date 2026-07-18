package com.manthan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manthan.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}