package com.AutoGenerate.IdAndDtos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AutoGenerate.IdAndDtos.Entity.Patient;

import jakarta.transaction.Transactional;

@Repository
public interface Patient_Repo extends JpaRepository<Patient, Integer> {

	@Modifying
	@Transactional
	@Query(value = "update patient set email = :mail where id = :id;",nativeQuery = true)
	int updateByName(@Param(value="id")int id,@Param(value="mail")String mail);
	
	
}
