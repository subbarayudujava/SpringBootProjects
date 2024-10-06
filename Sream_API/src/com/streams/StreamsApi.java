package com.streams;

public class StreamsApi {
	public String name;
	public String code;
	public Double price;
	public Integer qty;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public StreamsApi(String name, String code, double d, Integer qty) {
		this.name = name;
		this.code = code;
		this.price = d;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "StreamsApi [name=" + name + ", code=" + code + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
	
	/*public static void main(String[] args) {
	List<Integer> list=new ArrayList();
	list.add(1);
	list.add(4);
	list.add(9);
	list.add(5);
	list.add(2);
	list.add(6);
	list.add(7);
	list.add(3);
	list.add(8);
	list.stream().filter(i->i%2!=0).forEach(System.out::println);//here filter  we can call intermediate oparators
	//another way of to find List values
	System.out.println("==========list=======");
	List<Integer> ob=List.of(2,4,6,7,9,3,3);
	//  ob.stream().map(k->k/2).reduce((k,i)->k+i).ifPresent(System.out::println);
	ob.forEach(System.out::println);
	}
	
	List<Object> ob=List.of("Subbarayudu","Rajesh",8009.0,4.0);
	System.out.println("Values:"+ob);
	List<StreamsApi> ob=new ArrayList<StreamsApi>();
	
	ob.add(new StreamsApi("Subbarayudu","mouse",809.0,4));
	ob.add(new StreamsApi("ram","mouse",809.0,5));
	ob.forEach(System.out::println);
	}*/
}
