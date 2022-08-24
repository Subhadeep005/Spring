package com.codingraja.sunelectronics.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.core.dao.UserDao;
import com.codingraja.sunelectronics.core.domain.User;
import com.codingraja.sunelectronics.core.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Transactional
	public Long saveUser(User user) {
		return this.userDao.saveUser(user);
	}

	@Transactional
	public void updateUser(User user) {
		this.userDao.updateUser(user);
	}

	@Transactional
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		return this.userDao.findUserByUserName(username);
	}

}
