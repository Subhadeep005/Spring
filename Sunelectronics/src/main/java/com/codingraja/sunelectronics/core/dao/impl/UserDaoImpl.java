package com.codingraja.sunelectronics.core.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.dao.UserDao;
import com.codingraja.sunelectronics.core.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long saveUser(User user) {
		return (Long) this.sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		this.sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public User findUserByUserName(String username) {
		logger.info("Calling find User By Username");
		return (User) this.sessionFactory.getCurrentSession().createCriteria(User.class)
				.add(Restrictions.eq("username", username)).list().get(0);
	}

}
