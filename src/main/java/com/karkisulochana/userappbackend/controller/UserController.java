package com.karkisulochana.userappbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karkisulochana.userappbackend.model.User;
import com.karkisulochana.userappbackend.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin //frontend: http:localhost:4200
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/greet")
	public String greetingUser() {
		return "Namaste...";
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return this.userService.getAllUsers();
		
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		return this.userService.getUser(id);
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		this.userService.deleteUser(id);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User updateUser) {
		return this.userService.updateUser(updateUser);
	}
}
