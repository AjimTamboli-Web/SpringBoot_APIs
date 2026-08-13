package com.JPA.jpaConnectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPA.jpaConnectivity.Entity.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student, Integer> {
	
	
}
