package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}