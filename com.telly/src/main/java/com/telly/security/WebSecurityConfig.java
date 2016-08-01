package com.telly.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.telly.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// @formatter:off

		http.authorizeRequests().
		antMatchers("/", "/register", "/results")
			.permitAll()
		.antMatchers("/js*", "/css/*")
			.permitAll()
		.antMatchers("/myreservations", "/book", "/createtrip")
			.hasAnyRole("USER", "ADMIN")
		.and()
			.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/")
				.permitAll()
		.and()
			.logout()
				.permitAll();

		// @formatter:on

	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService).passwordEncoder(passwordEncoder);
		
	}

}
