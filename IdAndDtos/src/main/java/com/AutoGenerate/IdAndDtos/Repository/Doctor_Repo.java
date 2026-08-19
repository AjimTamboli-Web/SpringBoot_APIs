package com.AutoGenerate.IdAndDtos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AutoGenerate.IdAndDtos.Entity.Doctor;

@Repository
public interface Doctor_Repo extends JpaRepository<Doctor,Integer>{

	
	
}
