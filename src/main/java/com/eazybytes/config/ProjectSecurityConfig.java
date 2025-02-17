package com.eazybytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	/*
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests().anyRequest().authenticated();
		http.formLogin();
		http.httpBasic();
		return http.build();
	}
	*/
	
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests()
		.requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
		.requestMatchers("/notices","/contact").permitAll()
		.and().formLogin()
		.and().httpBasic();
		
		return http.build();
	}
	
	
	
	/*
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests().anyRequest().denyAll();
		http.formLogin();
		http.httpBasic();
		return http.build();
	}
	*/
	
	/*
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests().anyRequest().permitAll();
		http.formLogin();
		http.httpBasic();
		return http.build();
	}
	*/

}
