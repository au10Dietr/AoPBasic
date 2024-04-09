package com.dietrich.aspect.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TemplateAspect {

	@Before("execution(public String getTemplate42())")
	public void getTemplateAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	@Before("execution(public void setTemplate(*))")
	public void setTemplateAdvice() {
		System.out.println("Executin Advice on setName");
	}
	@After("execution(public void setTemplate(*))")
	public void setAfterTemplateAdvice() {
		System.out.println("Executin Advice on setName2");
	}
	@Before("execution(* com.dietrich.formReader.controller.*.get*())")
	public void getAllAdvice(){
		System.out.println("Execution on all get methods");
	}
}