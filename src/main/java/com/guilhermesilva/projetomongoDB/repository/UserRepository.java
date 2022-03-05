package com.guilhermesilva.projetomongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.guilhermesilva.projetomongoDB.domain.User;
@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
