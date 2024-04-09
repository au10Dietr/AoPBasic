package com.dietrich.formReader.controller;

public class Template {

	private String name;
	
	public String getTemplate42() {
		return name;
	}
	public void setTemplate(String nm) {
		System.out.println("inside");
		this.name=nm;
	}
	public String getnothing() {
		System.out.println("nothing");
		return "no";
	}
}
