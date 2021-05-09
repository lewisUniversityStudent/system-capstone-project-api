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
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam(required = true) String username, @RequestParam(required = true) String password) {
          User loginuser = (User)jdbcTemplate.queryForObject("select * from users where username = '" + + username + "' and password = '" + password + "';");
	  if (loginuser == null) return "Wrong username or password";
	  return "Success!";
	}

        @Bean
 	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
   	 	return new JdbcTemplate(dataSource);
	}
}
