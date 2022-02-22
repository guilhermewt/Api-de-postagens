package com.guilhermesilva.projetomongoDB.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermesilva.projetomongoDB.domain.User;
import com.guilhermesilva.projetomongoDB.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@RequestMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
