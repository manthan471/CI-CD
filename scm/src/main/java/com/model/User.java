package com.model;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	private String id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false,unique=true)
	private String email;
	
	private String password;
	
	@Lob
	private String about;
	
	@Column(length=1000)
	private String profilePicture;
	
	private String phoneNumber;
	
	private boolean enabled=false;      //user cant use the app
	private boolean emailVerified=false; //email is not verifired yet
	private boolean phoneVerified=false; //phone number is also not verified yet
	
	@Enumerated(value=EnumType.STRING)
    private Providers provider = Providers.SELF;
    
	private String emailToken;
	
	
	//Many side always has foreign key
	@OneToMany(mappedBy="user")
	Set<Contact> contacts=new LinkedHashSet<>();


	public User() {
		super();
	}


	public User(String id, String name, String email, String password, String about, String profilePicture,
			String phoneNumber, boolean enabled, boolean emailVerified, boolean phoneVerified, Providers provider,
			String emailToken, Set<Contact> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.about = about;
		this.profilePicture = profilePicture;
		this.phoneNumber = phoneNumber;
		this.enabled = enabled;
		this.emailVerified = emailVerified;
		this.phoneVerified = phoneVerified;
		this.provider = provider;
		this.emailToken = emailToken;
		this.contacts = contacts;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAbout() {
		return about;
	}


	public void setAbout(String about) {
		this.about = about;
	}


	public String getProfilePicture() {
		return profilePicture;
	}


	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public boolean isEmailVerified() {
		return emailVerified;
	}


	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}


	public boolean isPhoneVerified() {
		return phoneVerified;
	}


	public void setPhoneVerified(boolean phoneVerified) {
		this.phoneVerified = phoneVerified;
	}


	public Providers getProvider() {
		return provider;
	}


	public void setProvider(Providers provider) {
		this.provider = provider;
	}


	public String getEmailToken() {
		return emailToken;
	}


	public void setEmailToken(String emailToken) {
		this.emailToken = emailToken;
	}


	public Set<Contact> getContacts() {
		return contacts;
	}


	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
	

}
