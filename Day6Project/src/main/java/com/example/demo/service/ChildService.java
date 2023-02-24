package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.ChildRepository;

@Service
public class ChildService {

	@Autowired
	ChildRepository repository;
	
	public boolean addChildren(Child children) {
		repository.save(children);
		return true;
	}

	public List<Child> getChildren() {
		return repository.findAll();
	}

	public List<Child> getChildrenSorted(String field) {
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}

	public List<Child> getChildrenWithPagination(int offset, int pagesize) {
		Page<Child>page=repository.findAll(PageRequest.of(offset, pagesize));
		return page.getContent();
	}

	public List<Child> getChildrenWithPaginationField(int offset, int pagesize, String field) {
		Page<Child>page=repository.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
		return page.getContent();
	}

}