package com.guilhermesilva.projetomongoDB.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermesilva.projetomongoDB.domain.Post;
import com.guilhermesilva.projetomongoDB.repository.PostRepository;
import com.guilhermesilva.projetomongoDB.services.exceptions.ObjectNotFound;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("object not found"));
	}

	public List<Post> searchTitle(String text){
		return postRepository.findBySearchTitle(text);
	}
	
	public List<Post> searchFull(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return postRepository.findBySearchFull(text, minDate, maxDate);
	}
}
