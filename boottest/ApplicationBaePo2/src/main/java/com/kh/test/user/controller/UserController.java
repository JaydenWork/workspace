package com.kh.test.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


import com.kh.test.user.model.service.UserService;
import com.kh.test.user.model.vo.User;



@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/searchUser")
	public String searchUser(int userNo, Model model) {
		
		
		User user = service.searchUser(userNo);

		if(user != null) {
		model.addAttribute("user", user);
		return "searchSuccess";
		}else {
		return "searchFail";

		}
	}
}
