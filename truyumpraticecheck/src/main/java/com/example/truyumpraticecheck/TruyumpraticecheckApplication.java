package com.example.truyumpraticecheck;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.truyumpraticecheck.service.MenuItemService;
import com.example.truyumpraticecheck.model.MenuItem;

@SpringBootApplication
public class TruyumpraticecheckApplication {

	private static MenuItemService menuItemService = null;
	private static final Logger LOGGER = LoggerFactory.getLogger(TruyumpraticecheckApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TruyumpraticecheckApplication.class, args);
		menuItemService = ctx.getBean(MenuItemService.class);
//		getMenuItemListAdminTest();
//		getMenuItemListCustomerTest();
		updateMenuItemTest();

	}

	public static void getMenuItemListAdminTest() {
		LOGGER.info("Start getMenuItemListAdminTest");
		List<MenuItem> menuItems = menuItemService.getMenuItemListAdmin();
		for (MenuItem m : menuItems) {
			LOGGER.info(m.toString());
		}
		LOGGER.info("End getMenuItemListAdminTest");

	}

	public static void getMenuItemListCustomerTest() {
		LOGGER.info("Start getMenuItemListCustomerTest");
		List<MenuItem> menuItems = menuItemService.getMenuItemListCustomer();
		for (MenuItem m : menuItems) {
			LOGGER.info(m.toString());
		}
		LOGGER.info("End getMenuItemListCustomerTest");
	}

	public static void updateMenuItemTest() {
		try {
			LOGGER.info("Start updateMenuItemTest");
			MenuItem item = new MenuItem();
			item.setMeId(101);
			item.setMePrice(23.0);
			item.setMeName("Jasim");
			menuItemService.updateMenuItem(item);
			LOGGER.info("End updateMenuItemTest");

		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage());
		}
	}
}
