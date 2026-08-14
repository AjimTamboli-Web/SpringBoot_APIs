package com.Hibernate.RepositoryAnnotations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hibernate.RepositoryAnnotations.Classes.Actors;

@Repository
public interface Actor_Repo extends JpaRepository<Actors, Integer>{

}
