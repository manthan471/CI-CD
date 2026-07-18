package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dao.userRepository;
import com.model.User;

@RestController
public class TestUser {
	
	
	@Autowired
	private userRepository repo;
	
	
    @PostMapping("/user/add")
    public void addData(@RequestParam int id,
    		           @RequestParam String name,
    		           @RequestParam String adress,
    		           @RequestParam String contact,
    		           @RequestParam MultipartFile image) throws IOException {
    	
    	User user = new User();
    	user.setUser_id(id);
    	user.setUser_name(name);
    	user.setUser_adress(adress);
    	user.setUser_contact(contact);
    	user.setUser_image_data(image.getBytes());
    	
    	repo.save(user);
    	
    }
    
    @GetMapping("/user")
    public List<User> getUserDetails(){
    	
    	List<User> list =repo.findAll();
    	
    	return list;
    	
    }
    
    @GetMapping("/user/{id}")
    public User getUsers(@PathVariable int id) {
    	User user=repo.findById(id).get();
    	
    	return user;
    	
    }
    
    @DeleteMapping("/user/delete/{id}")
    public void deleteUser(@PathVariable int id) {
    	User u=repo.findById(id).get();
    	repo.delete(u);
    	
    }
    
    @PutMapping("/user/update/{id}")
    public User updateUser(@PathVariable int id) {
    	User u1=repo.findById(id).get();
    	u1.setUser_contact("7841935105");
    	repo.save(u1);
    	
    	return u1;
    	
    }
	

}
