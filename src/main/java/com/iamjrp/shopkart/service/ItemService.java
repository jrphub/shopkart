package com.iamjrp.shopkart.service;

import com.iamjrp.shopkart.beans.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
	Item save(Item item);

	List<Item> fetchAllItems();

	Optional<Item> getItemById(Long id);

	Item updateItemById(Long id, Item item);

    void deleteItemById(Long id);
}
