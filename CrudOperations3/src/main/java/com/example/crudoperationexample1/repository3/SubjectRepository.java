package com.example.crudoperationexample1.repository3;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.crudoperationexample1.entity3.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
