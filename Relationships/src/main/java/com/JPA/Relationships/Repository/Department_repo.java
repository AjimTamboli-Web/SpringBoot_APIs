package com.JPA.Relationships.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JPA.Relationships.Entity.Department;

import jakarta.transaction.Transactional;

@Repository
public interface Department_repo extends JpaRepository<Department, Integer> {

	@Modifying
	@Transactional
	@Query(value = "update department set category = :cat where id = :id;" ,nativeQuery = true)
	int updatecategory(@Param(value="cat") char c,@Param(value="id") int i);
}
