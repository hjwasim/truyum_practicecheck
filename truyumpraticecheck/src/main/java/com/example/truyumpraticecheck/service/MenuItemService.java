package com.example.truyumpraticecheck.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.truyumpraticecheck.repository.MenuItemRepository;
import com.example.truyumpraticecheck.model.MenuItem;
import com.example.truyumpraticecheck.exception.MenuItemNotFoundException;

@Service
public class MenuItemService {

	@Autowired
	MenuItemRepository menuItemRepo;

	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemRepo.findAll();
	}

	@Transactional
	public List<MenuItem> getMenuItemListCustomer() {
		return menuItemRepo.getMenuItemListCustomer();
	}
	
	@Transactional
	public void updateMenuItem(MenuItem menuItem) throws MenuItemNotFoundException {
		MenuItem item = menuItemRepo.findById(menuItem.getMeId()).orElse(null);
		if(item == null) {
			throw new MenuItemNotFoundException("Menu Item Not Found");
		}
		menuItemRepo.save(menuItem);
		
	}
}
