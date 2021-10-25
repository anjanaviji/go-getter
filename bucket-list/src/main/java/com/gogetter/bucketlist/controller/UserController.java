package com.gogetter.bucketlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gogetter.bucketlist.model.User;
import com.gogetter.bucketlist.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/create-user")
	public User createUser() {
		User user = userService.addUser();
		return user;
	}

}
