package com.mysql.SpringbootappwithmysqlDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.SpringbootappwithmysqlDB.model.User;
import com.mysql.SpringbootappwithmysqlDB.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}
	
	@PutMapping("/updateUser/{userId}")
	public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
		return userService.updateUser(userId, user);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		return userService.deleteUser(userId);
	}

}
