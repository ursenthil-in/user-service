package com.msn.practise.userservice.dao.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.msn.practise.userservice.model.User;


@Repository
public class UserJdbcDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//select * from user
	public List<User> findAllUser(){
		List<User> users = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper(User.class)); //query, resultSetExtractor
		return users;
	}

}
