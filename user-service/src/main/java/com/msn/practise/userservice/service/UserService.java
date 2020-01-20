package com.msn.practise.userservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msn.practise.userservice.dao.jdbc.UserJdbcDAO;
import com.msn.practise.userservice.model.User;

@Service
public class UserService {
	private static List<User> users = new ArrayList<User>();
	private static int counter = 0;
	
	@Autowired
	public UserJdbcDAO userJdbcDao;
	
	static
	{
		users.add(new User(++counter, "Senthil", 38, "Java", new Date()));
		users.add(new User(++counter, "Nachi", 27, "Testing", new Date()));
		users.add(new User(++counter, "Yogesh", 29, "Testing", new Date()));
		users.add(new User(++counter, "Muthu", 30, "Java", new Date()));
	}
	
	public List<User> findAllUser()
	{
		List<User> users = userJdbcDao.findAllUser();
		
		return users;
	}
	
	public User addUser(User user)
	{
		user.setId(++counter);
		users.add(user);
		return user;
	}
	
	public User findUser(int userId)
	{
		for(User user : users)
		{
			if(user.getId() == userId)
			{
				return user;
			}
		}		
		return null;
	}
	
	
	public User removeUser(int userId)
	{
		for(User user : users)
		{
			if(user.getId() == userId)
			{
				users.remove(user);
				return user;
			}
		}		
		return null;
	}
	
	
	
}
