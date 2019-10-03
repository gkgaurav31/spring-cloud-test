package com.appsdeveloperblog.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

	@NotNull(message="first name cannot be null")
	@Size(min=2,message="first name must be at least 2 characters")
	private String firstName;
	
	@NotNull(message="last name cannot be null")
	@Size(min=2,message="last name must be at least 2 characters")
	private String lastName;
	
	@NotNull
	@Size(min=6,message="min 6 characters password required")
	private String password;
	
	@NotNull(message="email cannot be null")
	@Email
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
