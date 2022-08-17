package org.fkit.jpatest.service.impl;

import org.fkit.jpatest.domain.User;
import org.fkit.jpatest.repository.UserRepository;
import org.fkit.jpatest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> getUserListByName(String name) {
		
		return userRepository.findByName(name);
	}

}
