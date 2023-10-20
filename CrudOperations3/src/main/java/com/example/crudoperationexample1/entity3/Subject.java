package com.example.crudoperationexample1.entity3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {
	@Id
	private int subject_id;
	private String name;
	private int fees;

	public Subject() {

	}

	public Subject(int subject_id, String name, int fees) {
		super();
		this.subject_id = subject_id;
		this.name = name;
		this.fees = fees;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
}
