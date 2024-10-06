package com.nt.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private Integer id;
	private String name;
	private Double price;
	private String manfacharing;

}
