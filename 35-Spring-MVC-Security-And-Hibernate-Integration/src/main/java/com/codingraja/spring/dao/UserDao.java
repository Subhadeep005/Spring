package com.codingraja.spring.dao;

import com.codingraja.spring.domain.User;

public interface UserDao {
	User findUserByUsername(String username);
}
