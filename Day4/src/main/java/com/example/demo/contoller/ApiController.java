package com.example.demo.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student;
import com.example.demo.service.ApiService;

@RestController
@RequestMapping("/student")
public class ApiController {
	
	@Autowired
	ApiService service;
	
	@PostMapping("/")
	public boolean create(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("/")
	public List<Student> read(){
		return service.getStudent();
	}
	
	@GetMapping("/{id}")
	public Optional<Student>readById(@PathVariable int id){
		return service.getStudentById(id);
	}
	
	@PutMapping("/{id}")
	public Student update(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable int id) {
		return service.deleteStudentById(id);
	}


}
