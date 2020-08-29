package com.dxc.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.beans.Product;
import com.dxc.service.ProductService;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("Spring.xml");
		
		ProductService productService = application.getBean(ProductService.class);
		
		productService.add(new Product(1,"Pen",10.23));
		productService.add(new Product(2,"Pencil",15.23));
		
		System.out.println(productService.findAll());
		
		application.close();
		
		
		
	}

}