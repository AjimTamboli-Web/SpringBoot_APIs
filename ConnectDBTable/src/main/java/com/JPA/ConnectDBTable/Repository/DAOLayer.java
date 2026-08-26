package com.JPA.ConnectDBTable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.ConnectDBTable.Entity.Teacher;

public interface DAOLayer extends JpaRepository<Teacher, Integer> {

	/**
	 * 
	 * DAO - Database Access Object (repository)
	 *  This layer is used to communicate with the database you need to write the methods to work with 
	 *   the database in this layer. this is generally an interface.
	 * 
	 * We used JPA Repository to define this DAO layer interface, their are some predefine methods to 
	 *   interact with the databases provided by the hibernate.
	 *   >> Spring Data JPA (java persistence API) - it is model in the SB which is used to interact 
	 *   	with the DB, it persist some data into DB.
	 *      It has some interfaces and classes which reduces boilerplate code to connect with DB.
	 *      
	 * Spring Data JPA has several implemetations @hibernate is most widely used.     
	 * 
	 * DAO - it is a layer that talks to the database.
	 * Repository - Repository is spring boot advanced version of DAO, it gives ready-made features
	 * JPA - is a way to talk to database using JAVA objects instead of SQL.
	 * 
	 * ❌ old way (JDBC) - select * from teacher where id = 1;
	 * ✔️ JPA way - Teacher tech = repository.findById(1);  pure java
	 * 
	 * JPA = no sql pure java this concept called Object Relational Mapping (ORM)
	 * 
	 * @Hibernate - is an ORM build over spring data JPA.
	 * It has some predefine queries. and it also support the custom sql queries.
	 * 
	 * What hibernate does? -> write the sql queries automatically, manages the join automatically,
	 * 						  manages relation automatically(oneTomany, manyToone, manyTomany)
	 * It works with the java entities.
	 * 
	 * Hibernate @annotations -> @entity @id @column @table @oneTomany etc.
	 * To enable the spring data jpa you need to add it's dependency.
	 * 
	 * 
	 */
	
}
