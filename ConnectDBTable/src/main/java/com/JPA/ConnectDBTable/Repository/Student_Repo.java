package com.JPA.ConnectDBTable.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JPA.ConnectDBTable.Entity.Student;

@Repository
public interface Student_Repo extends JpaRepository<Student, Integer> {

	// here you can create your own custom query by default JpaRepository(ListCrudRepository) have some query
	// like save, findAll, deleteById,findById
	
	@Query(value="select * from student where name = :nm;",nativeQuery = true)
//												    ▲▲△ 
		       List<Student> findByName(@Param(value="nm") String name);
		// compulsion for bind the name @Param for getting fetch the SQL query
		// repository to write custom query by name you need @Param(bind the parameter) for taking and fetch in query
	
}
