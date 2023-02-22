package com.userservice1.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice1.userservice.dao.UserDao;
import com.userservice1.userservice.model.User;

@Service
public class UserService {
@Autowired
UserDao ud;
public void add(User user)
{
     ud.add(user);
}
}