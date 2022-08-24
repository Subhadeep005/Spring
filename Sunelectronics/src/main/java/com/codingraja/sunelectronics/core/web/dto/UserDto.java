package com.codingraja.sunelectronics.core.web.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class UserDto {
	@NotEmpty(message = "Username can't be Empty !")
	private String username;
	@NotEmpty(message = "Password can't be Empty !")
	private String password;

	public UserDto() {
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

}
