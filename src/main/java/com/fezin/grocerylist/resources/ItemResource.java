package com.fezin.grocerylist.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fezin.grocerylist.entities.Item;

@RestController
@RequestMapping(value = "/items")
public class ItemResource {
	
	@GetMapping
	public ResponseEntity<Item> findAll() {
		Item i = new Item(1L, "bruno");
		
		return ResponseEntity.ok().body(i);
	}
}
