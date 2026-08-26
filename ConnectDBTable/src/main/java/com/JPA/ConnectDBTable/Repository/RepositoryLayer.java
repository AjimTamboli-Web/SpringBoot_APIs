package com.JPA.ConnectDBTable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.ConnectDBTable.Entity.Teacher;

public interface RepositoryLayer extends JpaRepository<Teacher, Integer>{

 /**
  * 
  *  @Repository -> is a spring annotation used on classes or interfaces that interact with the DB.
  *  It is used for the DAO layer, where we write code to save, fetch, update, delete data.
  *  
  * 
  * 
  * 
  * 	
  */
	
	
}
