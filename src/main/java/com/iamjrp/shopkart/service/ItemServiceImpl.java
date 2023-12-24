package com.iamjrp.shopkart.service;

import com.iamjrp.shopkart.config.Item;
import com.iamjrp.shopkart.persistence.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;
	public Item save(Item item) {
		return itemDao.save(item);
	}
}
