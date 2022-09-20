package com.zoho.attendance.service;

import java.util.ArrayList;

import com.zoho.attendance.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	UserAccountRepository repo;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		if (repo.countByEmployeeId(id)>=1) {
			return new User(id, repo.findByEmployeeId(id).getPassword(),
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + id);
		}
	}
}