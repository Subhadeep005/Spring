package com.codingraja.sunelectronics.core.service;

import com.codingraja.sunelectronics.core.domain.User;

public interface UserService {
	public Long saveUser(User user);

	public void updateUser(User user);

	public User findUserByUserName(String username);
}
