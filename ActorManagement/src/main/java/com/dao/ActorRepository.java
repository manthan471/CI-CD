package com.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

    public Actor findByEmail(String email);
    public Actor findByName(String name);

    @Query("select a from Actor a where a.salary > 55000")
    public List<Actor> findBySalary();
    
    @Query("SELECT a FROM Actor a WHERE a.salary = (SELECT MIN(a2.salary) FROM Actor a2)")
    public List<Actor> findminimumSalary();
    
}