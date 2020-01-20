package com.msn.practise.userservice;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.h2.security.auth.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.msn.practise.userservice.dao.jdbc.UserJdbcDAO;
import com.msn.practise.userservice.model.User;

//@EnableConfigurationProperties(ConfigurationProperties.class) 
@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	
	//private Logger log test1111111111111111111111111111111111
	
	@Autowired
	UserJdbcDAO userJdbcDao;
	
	public static void main(String[] args) {
		//SpringApplication.run(TodoApplication.class, args);
		
		SpringApplication springAappliation = new SpringApplication(TodoApplication.class);
		springAappliation.setDefaultProperties(Collections.singletonMap("server.port", "3080"));
		springAappliation.run(args);
	}

	
	
	  @Override 
	  public void run(String... args) throws Exception { 
		  // TODO Auto-generated method stub 
		  List<User> users = userJdbcDao.findAllUser();
		  System.out.println("All users ----> " + users);
		  Iterator<User> iterator =  users.iterator();
		  
		  while(iterator.hasNext())
		  {
			  System.out.println(iterator.next().toString());			  
		  }
	  }
	 

}
