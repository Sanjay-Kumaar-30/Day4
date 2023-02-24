package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Book;
import com.example.demo.service.ApiService;

@RestController
@RequestMapping("/book")
public class ApiController 
{
	@Autowired
	ApiService service;
	
	@PostMapping("")
	public boolean create(@RequestBody Book book)
	{
		return service.addBook(book);
	}
	@GetMapping("")
	public List<Book>read()
	{
		return service.getBook();
	}
	@GetMapping("/{id}")
	public Optional<Book>readById(@PathVariable int id)
	{
		return service.getBookById(id);
	}
	@PutMapping("/{id}")
	public Book update(@RequestBody Book book)
	{
		return service.updateBook(book);
	}
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable int id)
	{
		return service.deleteBookById(id);
	}
}
