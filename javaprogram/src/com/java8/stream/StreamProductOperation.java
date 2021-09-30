package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class StreamProductOperation {
	public static void main(String args[]) {
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(new Product(1,"lenovo laptop",75000f));
		productlist.add(new Product(2,"hp laptop",60000f));
		productlist.add(new Product(3,"dell laptop",90000f));
		productlist.add(new Product(4,"lenovo laptop",70000f));
		productlist.add(new Product(5,"sony laptop",50000f));
		productlist.stream().filter(p->p.price > 60000).map(pm->pm.price).forEach(System.out::println);
		
		Map<Object, Object> prodcutlist = productlist.stream().filter(pm -> pm.price > 60000)
                .collect(Collectors.toMap(pm -> pm.id, pm -> pm.name));
		System.out.println(prodcutlist);
		
	}

}
