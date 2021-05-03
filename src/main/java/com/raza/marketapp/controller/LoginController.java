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
public class SaleDataController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam(required = true) String username, @RequestParam(required = true) String password) {
          
	}

	
}
