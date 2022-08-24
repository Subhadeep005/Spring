package com.codingraja.spring.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.spring.dao.UserDao;
import com.codingraja.spring.domain.User;
import com.codingraja.spring.domain.UserRole;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	public UserDetailsServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = this.userDao.findUserByUsername(username);

		Set<GrantedAuthority> authorities = loadUserRoleByUsername(user.getUserRoles());

		return convertUserToSpringSecurityUser(user, authorities);
	}

	// This Method is used to convert Set<userRole> to Set<GrantedAuthority>

	private Set<GrantedAuthority> loadUserRoleByUsername(Set<UserRole> userRoles) {
		System.out.println("loadUserRoleByUsername");
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

		for (UserRole userRole : userRoles) {
			authorities.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		return authorities;
	}

	// This Method is used to convert User to Spring Security User Object

	private UserDetails convertUserToSpringSecurityUser(final User user, final Set<GrantedAuthority> authorities) {
		System.out.println("convertUserToSpringSecurityUser");
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				user.isEnabled(), true, // accountNonExpired
				true, // credentialsNonExpired
				true, // accountNonLocked
				authorities);
	}

}
