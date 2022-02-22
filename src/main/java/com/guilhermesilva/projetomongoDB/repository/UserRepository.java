package com.guilhermesilva.projetomongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guilhermesilva.projetomongoDB.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
