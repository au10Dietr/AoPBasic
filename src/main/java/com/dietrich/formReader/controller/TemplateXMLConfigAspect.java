//package com.dietrich.formReader.controller;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//
//public class TemplateXMLConfigAspect {
//
//	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//		System.out.println("TemplateXMLConfigAspect:: Before invoking getName() method");
//		Object value = null;
//		try {
//			value = proceedingJoinPoint.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("ObjectAspect:: After invoking getName() method. Return value="+value);
//		return value;
//	}
//}