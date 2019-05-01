package com.kerwin.Gmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kerwin.Gmarket.model.Item;
import com.kerwin.Gmarket.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public void addItem(Item item) {
		itemRepository.save(item);
	}
	
	
}
