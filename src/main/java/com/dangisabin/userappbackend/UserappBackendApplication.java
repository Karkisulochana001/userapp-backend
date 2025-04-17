package com.dangisabin.userappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dangisabin.userappbackend.model.User;
import com.dangisabin.userappbackend.repository.UserRepository;

@SpringBootApplication
public class UserappBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserappBackendApplication.class, args);
	}
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Sulochana","Karki","sulochana@gmail.com"));
		this.userRepository.save(new User("Sujyana","Karki","sujyana@gmail.com"));
		this.userRepository.save(new User("Suchitra","Karki","suchitra@gmail.com"));
	}
}
