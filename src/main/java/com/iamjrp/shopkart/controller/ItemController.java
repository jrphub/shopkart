package com.iamjrp.shopkart.controller;

import com.iamjrp.shopkart.beans.Item;
import com.iamjrp.shopkart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        itemService.save(item);
        return ResponseEntity.ok(item);
    }

    @GetMapping("")
    public ResponseEntity<List<Item>> getItems() {
        List<Item> items = itemService.fetchAllItems();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable("id") Long id) {
        Optional<Item> itemById = itemService.getItemById(id);
        return ResponseEntity.ok(itemById).getBody().get();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItemById(@PathVariable("id") Long id, @RequestBody Item item) {
        Item updatedItem = itemService.updateItemById(id, item);
        return ResponseEntity.ok(updatedItem);
    }
}
