package com.mysql.SpringbootappwithmysqlDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.SpringbootappwithmysqlDB.model.User;
import com.mysql.SpringbootappwithmysqlDB.respository.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public User getUser(int userId) {
		return userRepository.findById(userId).get();
	}
	
	public User updateUser(int userId, User user) {
		user.setId(userId);
		return userRepository.save(user);
	}
	
	public String deleteUser(int userId) {
		userRepository.deleteById(userId);
		return "User recored deleted successfully";
	}
	
}
