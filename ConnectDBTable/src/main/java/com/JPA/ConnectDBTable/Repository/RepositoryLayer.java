package com.JPA.ConnectDBTable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.ConnectDBTable.Entity.Teacher;

public interface RepositoryLayer extends JpaRepository<Teacher, Integer>{

 /**
  * 
  *  @Repository -> is a spring annotation used on classes or interfaces that interact with the DB.
  *  It is used for the DAO layer, where we write code to save, fetch, update, delete data.
  *  
  *  Why we use? -> to tell spring "This class talk to DB","This class is responsible for DB operation"
  *   Automatic bean creation, spring will automatically create an object(bean) of that class/interface
  *   to use @autowired.
  *   This is the main hidden power of @repository to exception handle.it converts low-level DB exception
  *   (like SQL errors) into spring exceptions.
  *   
  * you get clean spring exception like - DataAccessException, - JPASystemException this is called
  *  Exception Translation.
  *  
  *  Types of Repository - 
  *  @CrudRepository   @JPARepository   @PagingAndSortingRepository
  * 
  * To write custom queries SQL in SB application - two ways to create custom queries
  * 1.> Native query (pure SQL)
  * 2.> HQL (Hibernate Query Language) Java-based(Entity Oriented)
  * 
  * Native Query - Pure SQL, works on database table & columns,use in complex/DB-specific queries, DB dependent
  * HQL - Java based, works on entity class & fields, use in normal queries, Portability is DB independent
  * 	also known JPQL (Java Persistence Query Language)
  * 
  */
	
	
}
