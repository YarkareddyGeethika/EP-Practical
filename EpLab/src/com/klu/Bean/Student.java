package com.klu.Bean;

public class Student {

	private int itemid;
	private String itemname;
	private float cost;
	public void setId(int itemid) {
		this.itemid = itemid;
	}
	public void setName(String itemname) {
		this.itemname = itemname;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return itemid;
	}
	public String getName() {
		return itemname;
	}
	public float getCost() {
		return cost;
	}
}
