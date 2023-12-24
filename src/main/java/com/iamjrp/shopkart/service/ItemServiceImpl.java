package com.iamjrp.shopkart.service;

import com.iamjrp.shopkart.beans.Item;
import com.iamjrp.shopkart.persistence.ItemDao;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;
	public Item save(Item item) {
		return itemDao.save(item);
	}

	@Override
	public List<Item> fetchAllItems() {
		return itemDao.findAll();
	}

	@Override
	public Optional<Item> getItemById(Long id) {
		return itemDao.findById(id);
	}

	@Override
	public Item updateItemById(Long id, Item item) {
		Item dbItem = itemDao.findById(id).get();

		if (StringUtils.isNotEmpty(item.getName())) {
			dbItem.setName(item.getName());
		}
		if (StringUtils.isNotEmpty(item.getDescription())) {
			dbItem.setDescription(item.getDescription());
		}
		if (StringUtils.isNotEmpty(item.getCategory())) {
			dbItem.setCategory(item.getCategory());
		}
		if (item.getPincodes() != null && !item.getPincodes().isEmpty()) {
			dbItem.setCategory(item.getCategory());
		}
		if (item.getStockCount() != null) {
			dbItem.setStockCount(item.getStockCount());
		}
		if (item.getPrice() != null) {
			dbItem.setPrice(item.getPrice());
		}
		if (StringUtils.isNotEmpty(item.getCcyType())) {
			dbItem.setCcyType(item.getCcyType());
		}
		return itemDao.save(dbItem);
	}
}
