package com.codingraja.sunelectronics.core.dao;

import com.codingraja.sunelectronics.core.domain.User;

public interface UserDao {
	public Long saveUser(User user);

	public void updateUser(User user);

	public User findUserByUserName(String username);
}
