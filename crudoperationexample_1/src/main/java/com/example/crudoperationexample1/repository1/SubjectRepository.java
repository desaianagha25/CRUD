package com.example.crudoperationexample1.repository1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.crudoperationexample1.entity1.Subject;

@EnableJpaRepositories(basePackages = "com.example.crudoperationexample1.repository1")
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
