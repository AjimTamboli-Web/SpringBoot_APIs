package com.Relation.Bidirectional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Relation.Bidirectional.Entity.Bank;

@Repository
public interface Bank_repo extends JpaRepository<Bank, Integer> {

}
