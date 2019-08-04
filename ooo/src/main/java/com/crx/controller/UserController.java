package com.crx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crx.pojo.User;
import com.crx.service.userService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private userService us;
	
	@RequestMapping("findByName")
	public void findByName(String name) {
		User user = us.findByName(name);
		
		
	}
}
