package com.JPA.Relationships.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPA.Relationships.Entity.Company;

@Repository
public interface Company_repo extends JpaRepository<Company, Integer> {

}
