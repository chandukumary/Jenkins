package com.userservice1.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.userservice1.userservice.model.User;
import com.userservice1.userservice.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService std;
	@PostMapping("/post")
public void add(@RequestBody User user)
{
     std.add(user);
}
}