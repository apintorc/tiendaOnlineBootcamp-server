package com.example.jsbackend2.util;

import java.util.List;

public class Compra {
	private String user;

	private List<Item> items;

	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compra(String user, List<Item> items) {
		super();
		this.user = user;
		this.items = items;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItem(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Compra [user=" + user + ", items=" + items + "]";
	}
	
	
}
