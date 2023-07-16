package com.sample.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("admin")
		.password("admin")
		.roles("ADMIN")
		.and()
		.withUser("user")
		.password("user")
		.roles("USER");
		
	}
	
	@Bean
	public PasswordEncoder getpassword() {
		return NoOpPasswordEncoder.getInstance();
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.authorizeHttpRequests()
//		.antMatchers("/useraccess").hasRole("USER")
//		.antMatchers("/adminaccess").hasRole("ADMIN")
//		.antMatchers("/").permitAll().and().formLogin();;
//	}
	
	
}
