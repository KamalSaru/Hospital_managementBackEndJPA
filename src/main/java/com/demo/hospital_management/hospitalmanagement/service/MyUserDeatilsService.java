package com.demo.hospital_management.hospitalmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.hospital_management.hospitalmanagement.dao.UserDao;
import com.demo.hospital_management.hospitalmanagement.enums.ERole;
import com.demo.hospital_management.hospitalmanagement.model.Users;

@Service
public class MyUserDeatilsService implements UserDetailsService {
	
	@Autowired
	UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userDao.findByUsername(username);
		List<GrantedAuthority> grantedAuths = new ArrayList<>();
		if (user.getUsername().equals(username)) {
			grantedAuths.add(new SimpleGrantedAuthority(user.getRole()));
			return  new User(user.getUsername(), user.getPassword(), grantedAuths);
		}
		 else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}