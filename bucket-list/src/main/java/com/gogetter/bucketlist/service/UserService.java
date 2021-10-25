package com.gogetter.bucketlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gogetter.bucketlist.model.User;
import com.gogetter.bucketlist.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User addUser() {

		User user = new User();
		user.setFirstName("test");
		user.setLastName("user");
		user.setUserId("testuser");
		user.setPassword("pass@123");
		userRepository.save(user);
		return user;
	}
}
