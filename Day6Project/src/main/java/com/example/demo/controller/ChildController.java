package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.ChildService;

@RestController
public class ChildController {
	
	@Autowired
	ChildService service;
	
	@PostMapping("/children")
	public boolean addChildren(@RequestBody Child children) {
		return service.addChildren(children); 
	}
	
	@GetMapping("/children")
	public List<Child> read(){
		return service.getChildren();
	}
	
	@GetMapping("/children/{field}")
	public List<Child> childrenwithSort(@PathVariable String field){
		return service.getChildrenSorted(field);
	}
	
	@GetMapping("/children/{offset}/{pagesize}")
	public List<Child> childrenWithPagination(@PathVariable int offset,@PathVariable int pagesize){
		return service.getChildrenWithPagination(offset,pagesize);
	}
	
	@GetMapping("/children/{offset}/{pagesize}/{field}")
	public List<Child> childrenWithPaginationField(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return service.getChildrenWithPaginationField(offset,pagesize,field);
	}
}