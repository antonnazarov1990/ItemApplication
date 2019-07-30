package com.example.ItemApplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int amount;
	private String inventory_number;
	private int withdrawal_quantity;
	
	public Item() {		
	}	
	
	public Item(String name, int amount, String inventory_number, int withdrawal_quantity) {
		super();
		this.name = name;
		this.amount = amount;
		this.inventory_number = inventory_number;
		this.withdrawal_quantity = withdrawal_quantity;
	}
	
	public int getWithdrawal_quantity() {
		return withdrawal_quantity;
	}

	public void setWithdrawal_quantity(int withdrawal_quantity) {
		this.withdrawal_quantity = withdrawal_quantity;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getInventory_number() {
		return inventory_number;
	}
	public void setInventory_number(String inventory_number) {
		this.inventory_number = inventory_number;
	}
	
	

}
