package com.guilhermesilva.projetomongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guilhermesilva.projetomongoDB.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
