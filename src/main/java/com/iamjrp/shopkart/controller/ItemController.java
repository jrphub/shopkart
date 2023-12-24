package com.iamjrp.shopkart.controller;

import com.iamjrp.shopkart.config.Item;
import com.iamjrp.shopkart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@PostMapping("")
	public ResponseEntity<Item> createItem(@RequestBody Item item){
		itemService.save(item);
		return ResponseEntity.ok(item);
	}
}
