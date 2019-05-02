package com.kerwin.Gmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kerwin.Gmarket.model.Item;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Long>{

}
