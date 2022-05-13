package com.example.truyumpraticecheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.truyumpraticecheck.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

	@Query(value = "Select m from MenuItem m where m.meActive='true' and m.meDateOfLaunch<=current_Date()")
	public List<MenuItem> getMenuItemListCustomer();
}
