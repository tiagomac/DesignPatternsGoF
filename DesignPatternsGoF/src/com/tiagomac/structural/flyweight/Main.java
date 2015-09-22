package com.tiagomac.structural.flyweight;

import java.util.List;
import java.util.Vector;

public class Main {
	private final List<Order> orders = new Vector<Order>();
	private final Menu menu = new Menu();

	void takeOrder(String flavourName, int table) {
		CoffeeFlavour flavour = menu.lookup(flavourName);
		Order order = new Order(table, flavour);
		orders.add(order);
	}

	void service() {
		for (Order order : orders) {
			order.serve();
			orders.remove(order);
		}
	}

	String report() {
		return "\ntotal CoffeeFlavour objects made: " + menu.totalCoffeeFlavoursMade();
	}

	public static void main(String[] args) {
		// coffee shop
		Main shop = new Main();

		shop.takeOrder("Cappuccino", 2);
		shop.takeOrder("Frappe", 1);
		shop.takeOrder("Espresso", 1);
		shop.takeOrder("Frappe", 897);
		shop.takeOrder("Cappuccino", 97);
		shop.takeOrder("Frappe", 3);
		shop.takeOrder("Espresso", 3);
		shop.takeOrder("Cappuccino", 3);
		shop.takeOrder("Espresso", 96);
		shop.takeOrder("Frappe", 552);
		shop.takeOrder("Cappuccino", 121);
		shop.takeOrder("Espresso", 121);

		shop.service();
		System.out.println(shop.report());
	}

}