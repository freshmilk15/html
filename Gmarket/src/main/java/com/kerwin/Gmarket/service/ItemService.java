package com.kerwin.Gmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	
	
	public Page<Item> findItemNoCriteria(Integer page,Integer size) {
		Sort sort = new Sort(Direction.DESC, "regTime");
		Pageable pageable = new PageRequest(page, size, sort);
        return itemRepository.findAll(pageable);
    }

	
	
}
