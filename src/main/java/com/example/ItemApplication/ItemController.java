package com.example.ItemApplication;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ItemApplication.entities.Item;
import com.example.ItemApplication.repos.ItemRepo;
import com.example.ItemApplication.service.ItemService;



@RestController
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@PostMapping("/item/")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	@GetMapping("/item/{id}")
	public Item getItem(@PathVariable int id) {
		return itemService.getItem(id);
	}
	
	@DeleteMapping("/item/{id}")
	public boolean removeItem(@PathVariable int id) {
		return itemService.removeItem(id);
	}
	
	@GetMapping("/allitems/")
	public Iterable<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	@GetMapping("/item/deposit/{id}")
	public int getItemDepositById(@PathVariable int id) {
		return itemService.getItemDepositById(id);
	}
	
	@GetMapping("/item/withdrawal/{id}")
	public int getItemWithdrawalQuantityById(@PathVariable int id) {
		return itemService.getItemWithdrawalQuantityById(id);
	}
	
//	@GetMapping("/main")
//	public String main(Map<String, Object> model) {
//		Iterable<Item> items = itemRepo.findAll();
//		model.put("items", items);
//		return "main";
//	}
//	
//	@PostMapping("/main")
//	public String add(@RequestParam String name, @RequestParam int amount, @RequestParam String inventory_number, Map<String, Object> model) {
//		Item item = new Item(name, amount, inventory_number, 0);
//		
//		itemRepo.save(item);
//		
//		Iterable<Item> items = itemRepo.findAll();
//		model.put("items", items);
//		return "main";
//	}
	

	

	

	

}
