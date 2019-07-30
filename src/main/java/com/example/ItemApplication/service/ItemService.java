package com.example.ItemApplication.service;

import com.example.ItemApplication.entities.Item;

public interface ItemService {
	
	void addItem(Item item);
	
	Item getItem(int id);
	
	Iterable<Item> getAllItems();

	boolean removeItem(int id);
	
	int getItemDepositById(int id);
	
	int getItemWithdrawalQuantityById(int id);

}
