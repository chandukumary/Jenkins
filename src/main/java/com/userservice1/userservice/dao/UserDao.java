package com.userservice1.userservice.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.userservice1.userservice.model.User;
import com.userservice1.userservice.repository.UserReposit;

@Component
	public class UserDao 
	{
		@Autowired
		UserReposit ur;
			public void add(User user) 
			{
				ur.save(user);
			}
}