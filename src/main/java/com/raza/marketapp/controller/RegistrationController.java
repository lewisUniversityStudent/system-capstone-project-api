package com.raza.marketapp.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import static java.lang.Math.*;

import com.google.gson.*;
import com.raza.marketapp.model.*;

@RestController
@RequestMapping("api")
public class RegistrationController {

        public static bool existsUser(String username)
	{
		return (String)jdbcTemplate.queryForObject("select username from users where username='" + username + "';") != null;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam(required = true) String username, @RequestParam(required = true) String password, @RequestParam(required = true) String name, @RequestParam(required = true) String surname) {
          if (existsUser(username)) return "Username already taken!";
          jdbcTemplate.queryForObject("insert into users(username, password, name, surname) values('" + + username + "','" + password + "','" + name + "','" + surname + "';");
	  return "Success";
	}

        @Bean
 	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
   	 	return new JdbcTemplate(dataSource);
	}
}
