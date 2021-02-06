package com.fezin.grocerylist.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fezin.grocerylist.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@GetMapping
	public ResponseEntity<Category> findAll() {
		Category cat = new Category(1L, "Higiene pessoal");
		
		return ResponseEntity.ok().body(cat	);
	}
}
