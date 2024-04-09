package com.dietrich.aspect.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String name() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Template obj = ctx.getBean("template", Template.class);
		Template2 obj2 = ctx.getBean("template2", Template2.class);
		obj.setTemplate("name");
		String name= obj.getTemplate42();
		obj.getnothing();
		System.out.println("break for objs");
		obj2.getTemplate42();
		ctx.close();
		return name;
	}
	
}
