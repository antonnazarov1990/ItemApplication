package com.example.ItemApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ItemApplication.entities.Item;
import com.example.ItemApplication.repos.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepo repo;

	@Override
	public void addItem(Item item) {
		repo.save(item);
		
	}

	@Override
	public Item getItem(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public boolean removeItem(int id) {
		Item item = repo.findById(id).orElse(null);
		if(item == null) {
		return false;
		}
		repo.delete(item);
		return true;
	}

	@Override
	public Iterable<Item> getAllItems() {
		return repo.findAll();
	}

	@Override
	public int getItemDepositById(int id) {
		Item item = repo.findById(id).orElse(null);
		return item.getAmount();
	}

	@Override
	public int getItemWithdrawalQuantityById(int id) {
		Item item = repo.findById(id).orElse(null);
		return item.getWithdrawal_quantity();
	}

}
