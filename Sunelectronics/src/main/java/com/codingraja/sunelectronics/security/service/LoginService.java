package com.codingraja.sunelectronics.security.service;

public interface LoginService {
	public String findLoggedInUsername();

	public void autologin(String username, String password);
}
