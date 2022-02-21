package com.guilhermesilva.projetomongoDB.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermesilva.projetomongoDB.domain.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

	@RequestMapping
	public ResponseEntity<List<User>> findAll(){
		
		User u1 = new User("123", "antonia", "tonia@gmail.com");
		User u2 = new User("1234", "vanessa", "vane@gmail.com");
		User u3 = new User("1235", "carlos", "carlos@gmail.com");
		
		List<User> list = new ArrayList<>(Arrays.asList(u1,u2,u3));
		
		return ResponseEntity.ok().body(list);
	}
}
