package com.msn.practise.userservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msn.practise.userservice.configuration.TodoConfiguration;
import com.msn.practise.userservice.exception.UserNotFoundException;
import com.msn.practise.userservice.model.User;
import com.msn.practise.userservice.service.UserService;



@RestController
@RequestMapping(path = "rest")
public class UserController {

	@Autowired
	public UserService userService;
	
	@Autowired
	public TodoConfiguration config;
	
	
	@GetMapping(path = "test")
	public String testUser()
	{
		return "Hi User";
	}
		
	
	
	
	
	
	
	/*
	 * Get All Users
	 */
	@GetMapping(path = "user/findAllUser")
	public List<User> getAllUsers()
	{
		List<User> users = userService.findAllUser();
		return users;
	}
	
	/*
	 * Add User
	 */
	@PostMapping(path = "user")
	public User createUser(@Valid @RequestBody User user)
	{
		User savedUser = userService.addUser(user);
		//ServletUriComponentsBuilder.fromRequestUri(req).path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		//ResponseEntity.created(location)
		
		return savedUser;
	}
	
	
	/*
	 * Find a User
	 */
	@GetMapping(path = "user/{userId}")
	public User getUser(@PathVariable int userId)
	{
		User user = userService.findUser(userId);
		if (null == user)
		{
			throw new UserNotFoundException("Id:"+userId + ", Not Exists");
		}
		
		//resour
		
		return user;
	}
	
	/*
	 * Delete a User
	 */
	@DeleteMapping(path = "user/{userId}")
	public User removeUser(@PathVariable int userId)
	{
		User user = userService.removeUser(userId);
		if (null == user)
		{
			throw new UserNotFoundException("Id:"+userId + ", Not Exists");
		}
		return user;
	}
	

	
	
	
	
	/*
	 * @GetMapping(path = "limits") public User getLimits() { User user = new
	 * User(); user.setDepartment(config.getLimitMin() + " - " +
	 * config.getLimitMax()); //user.setAge(33); return user; }
	 */
	

	
}
