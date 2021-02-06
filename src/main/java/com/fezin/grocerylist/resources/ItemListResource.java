package com.fezin.grocerylist.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fezin.grocerylist.entities.Category;
import com.fezin.grocerylist.entities.Item;
import com.fezin.grocerylist.entities.ItemList;

@RestController
@RequestMapping(value = "/itemlist")
public class ItemListResource {
	
	@GetMapping
	public ResponseEntity<ItemList> findAll() {
		Item i = new Item(1L, "besodorante");
		
		Category cat = new Category(1L, "Higiene pessoal");
		
		i.getCategories().add(cat);
		
		ItemList il = new ItemList(1L, "Karinne", Instant.now());
		
		il.getItems().add(i);
		
		return ResponseEntity.ok().body(il);
	}
}
