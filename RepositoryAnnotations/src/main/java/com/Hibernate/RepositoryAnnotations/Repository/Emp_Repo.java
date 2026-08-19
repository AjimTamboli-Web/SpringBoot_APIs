package com.Hibernate.RepositoryAnnotations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hibernate.RepositoryAnnotations.Classes.Employee;

@Repository
public interface Emp_Repo extends JpaRepository<Employee, Integer> {

	/**
	 * 
	 *  it is a bean.  ✅ @Repository = special type of @Component (internally)
	 *  ✅ Extra feature: >> Exception Translation, 
	 *  					  >> Convert DB Exception into Spring Exceptions
	 *   Ex. SQL Exception → DataAccessException
	 *   
	 * Q. why we use @Repository on interfaces(in package), not just classes?
	 * >> Normally interfaces cannot create objects. Interface = no object -> no bean(in normal java)
	 *   So logically -> "How can spring create a bean from interface?"
	 *       Now magic happens because of Spring Data JPA.
	 * What spring actually does internally - spring create a proxy implementation of your interface at runtime.
	 *  		You don't write implementation, spring generates it automatically.
	 *  internally: Your interface -> Spring proxy class -> Actual Implementation
	 *   
	 * 
	 */
	
}
