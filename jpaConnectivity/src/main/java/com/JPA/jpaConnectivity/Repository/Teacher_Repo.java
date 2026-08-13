package com.JPA.jpaConnectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPA.jpaConnectivity.Entity.Teacher;

@Repository
public interface Teacher_Repo extends JpaRepository<Teacher, Integer> {

}
