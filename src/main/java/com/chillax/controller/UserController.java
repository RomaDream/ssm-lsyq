package com.chillax.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chillax.entity.User;
import com.chillax.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/userlist")
	public String userList(HttpServletRequest request, Model model){
		List<User> users = userService.getUserList();
		model.addAttribute("uList", users);
		return "userList";
	}
}
