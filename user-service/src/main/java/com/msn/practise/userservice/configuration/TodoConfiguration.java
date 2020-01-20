package com.msn.practise.userservice.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class TodoConfiguration {
	
	@Value("${user-service.limit.minimum}")
	public String limitMin;	

	@Value("${user-service.limit.maximum}")
	public String limitMax;
	
	public String getLimitMin() {
		return limitMin;
	}

	public String getLimitMax() {
		return limitMax;
	}
		
	/*
	 * @Bean public static PropertySourcesPlaceholderConfigurer
	 * propertyConfigInDev() { return new PropertySourcesPlaceholderConfigurer(); }
	 */
	
	
	
	
	
	
	
	


}
