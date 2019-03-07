package com.bk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bk.a.A;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx= null;
		A a= null;
		//create the container
		ctx=new ClassPathXmlApplicationContext("com/bk/cfgs/applicationContext.xml");
		// get bean for a 
		a= ctx.getBean("a",A.class);
		//invoke the method
		try {
			System.out.println(a.m1());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
