package com.abhishek.springmvc.model;

public class Alien {

	private int aid;
	private String name;
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
