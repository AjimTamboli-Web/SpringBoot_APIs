package com.Hibernate.RepositoryAnnotations.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hibernate.RepositoryAnnotations.Classes.Actors;
import com.Hibernate.RepositoryAnnotations.Repository.Actor_Repo;

@RestController
public class Actor_Controller {

	private Actor_Repo repo;
	
	Actor_Controller(Actor_Repo repo){
		this.repo = repo;
	}
	
	@PostMapping("/add")
	public String createActor(@RequestBody Actors actor) {
		repo.save(actor);
		return  actor.getName() + " added Successfully..";
	}
	
	@GetMapping("/get")
	public List<Actors> getList(){
		return repo.findAll();
	}
	
	@DeleteMapping("/delete")
	public String deleteActor(@RequestParam(value="ac") int i) {
		repo.deleteById(i);
		return "Deleted";
	}
	
}
