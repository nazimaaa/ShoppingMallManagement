package com.example.mallmanagement.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "emp")
public class Emp {
	

	

	
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String name;
	    private String role;
	    private double salary;

	    public Emp() {}

	    // Getters & Setters
	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getRole() { return role; }
	    public void setRole(String role) { this.role = role; }

	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }
	}


