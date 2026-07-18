package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Actor;

public interface ActorRepository extends JpaRepository<Actor,Integer>{
       
}
