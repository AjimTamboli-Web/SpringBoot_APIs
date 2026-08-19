package com.Hibernate.RepositoryAnnotations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hibernate.RepositoryAnnotations.Classes.Actors;

@Repository
public interface Actor_Repo extends JpaRepository<Actors, Integer>{

	/**
	 * Repository is Spring boot's advanced version of DAO. it does the same job as DAO.
	 * But spring gives ready-made features.
	 * DAO = Data Access Object. it is a layer that talk to the database.
	 * DAO = You write everything manually
	 * Repository = Spring writes most thing for you.
	 * 
	 * What you get automatically? from JPARepository: save(), findById(), findAll(), deleteById()
	 * Repository = Smart DAO powered by spring.
	 * 
	 * JPA = Java Persistence API.
	 * JPA is a way to talk to database using java objects instead of SQL.
	 * 
	 * Old Way(JDBC) -> SELECT * FROM bus WHERE id = 1;
	 * JPA way   -> Bus bus = repository.findById(1);  No SQL, pure java.
	 * JPA converts java class into database table and there fields are database columns.
	 * This is called Object Relational Mapping (ORM)
	 * ORM -> is a software development technique that connects object-oriented programming models with
	 * 			 relational databases.
	 * Common ORM Framework - Hibernate, SQLAlchemy, DJangoORM, Active Record
	 * 
	 *  controller -> services -> repository -> JPA -> Database
	 *  
	 *  DAO layer -> low level db handling, uses JDBC, Manual query writing.
	 *  Repository -> Built on top of JPA, Uses interface, No implementation needed.
	 *  JPA -> Only a specification, Needs implementation like: Hibernate.
	 * 
	 */
	
}
