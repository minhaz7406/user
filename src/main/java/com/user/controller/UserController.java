package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.entity.User;
import com.user.service.UserService;

@Controller 
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/viewUserPage")
	public String viewPage() {
		return "create_user";
	}
	@RequestMapping("/saveUserDetails")
	public String saveUser(@ModelAttribute("user")User user) {
		userService.saveUserDetails(user);
		return "create_user";
	}
  @RequestMapping("/readAllUser")
  public String readUser(@ModelAttribute("user")User user,Model model) {
	  List<User> user1 = userService.readAllUser();
	  model.addAttribute("user", user1);
	  return "read_user";
  }
  @RequestMapping("/deleteById")
  public String deleteUser(@RequestParam("id")long id,Model model) {
	  userService.deleteById(id);
	  List<User> user1 = userService.readAllUser();
	  model.addAttribute("user", user1);
	  return "read_user";
	  
  }
  @RequestMapping("/updateUser")
  public String getId(@RequestParam("id")long id,Model model) {
	  User user = userService.getId(id);
	  model.addAttribute("user",user);
	  return "update_user";
  }
  @RequestMapping("/updateUserDetails")
  public String updateUserDetails(@ModelAttribute("user")User user,Model model){
	  userService.saveUserDetails(user);
	  List<User> user1 = userService.readAllUser();
	  model.addAttribute("user", user1);
	  return "read_user";
  }
}
