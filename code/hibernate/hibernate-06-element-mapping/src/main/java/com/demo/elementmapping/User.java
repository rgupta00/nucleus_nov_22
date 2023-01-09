package com.demo.elementmapping;

import java.util.*;

import javax.persistence.*;

//Element collection? what is the need?
@Entity
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="profile_table")
	private List<String> profiles = new ArrayList<String>();

	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name="email_table")
	private List<String> emails = new ArrayList<String>();

	public User() {
	}

	public void addEmail(String email) {
		emails.add(email);
	}

	public void addProfile(String profile) {
		profiles.add(profile);
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<String> profiles) {
		this.profiles = profiles;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

}
