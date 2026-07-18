package com.model;

import org.hibernate.engine.profile.Fetch;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Contact {
	
	@Id
	private String id;
	
	private String email;
	
	private String phoneNumber;
	
	private String address;
	
	private String picture;
	
	@Lob
	private String description;
	
	private boolean favorite = false;
	
	private String websiteLink;
	private String LinkedInLink;
	private String instagramLink;
	
	private String cloudinaryImagePulicId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private User user;
	
}
