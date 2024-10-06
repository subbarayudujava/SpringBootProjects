package com.nt.order;

import java.util.List;

import com.nt.product.Product;

public class OrderDetails {

	public static void main(String[] args) {
		List<Product> list = List.of(new Product(1, "keybord", 1200.00, "hydearabad"),
				new Product(2, "corejava_book", 200.65, "kadapa"), //of method values will give directly means direct immutable is created

				new Product(3, "Oracle", 1000.023, "karnul"), new Product(4, "Mobile", 1900.0293, "kadapa"),
				new Product(5, "Redmi", 19000.00, "TS"), new Product(6, "Oppo", 200.0293, "karnul"),
				new Product(7, "Waterbatal", 100.0293, "kadapa"));
		// when we wanr insert multiple data it don not 
		
		/*list.add(new Product (1,"Mouse",1299.002,"kadapa"));
		 * 
		 * 
		 //feaching the data by using name
		list.forEach(data ->System.out.println(data));
		System.out.println(list);*/
		
		/*list.stream().filter(data->
			data.getName().equalsIgnoreCase("keybord")).forEach(data->
			{
				System.out.println(data);
			});
		
		*/
		
		
		//feaching the data by using id
		// 4.list.stream().filter(data->data.getId()==6).forEach(System.out::println);
		
		
		//feaching the data y using manfacharing
		//list.stream().filter(data->data.getManfacharing().equalsIgnoreCase("kadapa")).forEach(System.out::println);
		
		//feaching data y using price
		//list.stream().filter(data->data.getPrice()==19000.00).forEach(System.out::println);
		
	/*	feaching the data only for 1000 below peoples
		list.stream().filter(data->data.getPrice()<=1000).forEach(System.out::println);*/
		
		
	/*feaching the data by using first two words
	list.stream().filter(data->data.getManfacharing().startsWith("ka")).forEach(System.out::println);//startswith  this keyword verifing name,
	  */
		//feaching the data by using two thing name is int no 1  after the
		list.stream().filter(data->data.getName().startsWith("e",1)).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
