package com.guilhermesilva.projetomongoDB.dto;

import com.guilhermesilva.projetomongoDB.domain.User;

public class AuthorDTO {
	
	private String id;
	private String name;
	
	public AuthorDTO() {}
	
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public AuthorDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
