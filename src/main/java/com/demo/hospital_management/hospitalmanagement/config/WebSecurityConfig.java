package com.demo.hospital_management.hospitalmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.demo.hospital_management.hospitalmanagement.dao.UserDao;
import com.demo.hospital_management.hospitalmanagement.enums.ERole;
import com.demo.hospital_management.hospitalmanagement.filter.JwtRequestFilter;
import com.demo.hospital_management.hospitalmanagement.model.Users;
import com.demo.hospital_management.hospitalmanagement.service.MyUserDeatilsService;
import com.demo.hospital_management.hospitalmanagement.util.JwtUtil;


/*
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService myUserDetailsService;
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	@Autowired
	UserDao userDao;
	@Autowired
	MyUserDeatilsService myUserDeatilsService;
	
	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(myUserDetailsService);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	//@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	//@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/auth/authenticate").permitAll()
		.antMatchers("/hospital/v1/api/save").permitAll()
				.antMatchers("/hospital/v1/api/doctor/**").hasAuthority(ERole.DOCTOR.toString())
				.antMatchers("/hospital/v1/api/update/{id}").hasAuthority(ERole.DOCTOR.toString())
				.anyRequest().authenticated().and().exceptionHandling().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}
}

 */
