package com.JPA.ConnectDBTable.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JPA.ConnectDBTable.Entity.Teacher;

import jakarta.transaction.Transactional;

@Repository
public interface Teacher_Repo extends JpaRepository<Teacher, Integer> {

	@Query(value ="select * from teacher where city= :cit;" ,nativeQuery = true)
	List<Teacher> byCity(@Param(value="cit") String cite);
	
	@Modifying
	@Transactional
	@Query(value= "update teacher set mail = :mail where id = :id;",nativeQuery = true)
	int updateEmail(@Param(value = "id")int  id,@Param(value = "mail")String name);
	
	
}
