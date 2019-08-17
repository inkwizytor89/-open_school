package com.enoch.openschool;

import com.enoch.openschool.entity.Skill;
import com.enoch.openschool.entity.User;
import com.enoch.openschool.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class OpenSchoolApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(OpenSchoolApplication.class, args);
	}


	@PostConstruct
	public void setupDbWithData(){
		User user= new User("Ashish", null);
		user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		user= userRepository.save(user);
	}

}
