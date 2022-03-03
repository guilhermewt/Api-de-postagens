
package com.guilhermesilva.projetomongoDB.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermesilva.projetomongoDB.domain.Post;
import com.guilhermesilva.projetomongoDB.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Post> findByPost(@PathVariable String id) {
		Post obj = postService.findById(id);
	    return ResponseEntity.ok().body(obj);
	}
	
}
