package com.guilhermesilva.projetomongoDB.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermesilva.projetomongoDB.domain.Post;
import com.guilhermesilva.projetomongoDB.repository.PostRepository;
import com.guilhermesilva.projetomongoDB.services.exceptions.ObjectNotFound;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;;
	
	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("object not found"));
	}
		
}
