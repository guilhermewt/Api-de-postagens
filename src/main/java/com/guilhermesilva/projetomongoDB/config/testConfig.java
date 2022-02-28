package com.guilhermesilva.projetomongoDB.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.guilhermesilva.projetomongoDB.domain.Post;
import com.guilhermesilva.projetomongoDB.domain.User;
import com.guilhermesilva.projetomongoDB.dto.AuthorDTO;
import com.guilhermesilva.projetomongoDB.repository.PostRepository;
import com.guilhermesilva.projetomongoDB.repository.UserRepository;


@Configuration
public class testConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		userRepository.deleteAll();
		postRepository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
	
		userRepository.saveAll(Arrays.asList(maria,alex,bob));
		
		Post post1 = new Post(null, sdf.parse("22/02/2022"), "Partiu viajem", "hoje é dia de sergipe", new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("30/05/2022"), "Bom dia!", "acordei feliz hoje!", new AuthorDTO(maria));
		
		postRepository.saveAll(Arrays.asList(post1,post2));
		
		maria.getPosts().addAll(Arrays.asList(post1,post2));
		
		userRepository.save(maria);
	}
	
	

}
