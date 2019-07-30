package com.example.ItemApplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.ItemApplication.entities.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
