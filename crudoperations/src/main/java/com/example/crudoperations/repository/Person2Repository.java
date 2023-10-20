package com.example.crudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crudoperations.entity.Person2;
@Repository
public interface Person2Repository extends JpaRepository<Person2, Integer> {
	
	
}