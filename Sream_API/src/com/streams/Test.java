package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public String d1="""       
			 kdsfnkljsadflksafks
			 slksakjfsljnfkajn
			 lsdclsdsfkn
			 lSKCLKSDLKSF
			""";//THIS IS TextBlock Introducing java15  implimenting 17 v
	
	
	public static void main(String[] args) {
		/*Integer a[]= {1,3,2,4,6,5,8,9,4,10};
		//Arrays.stream(a).forEach(System.out::println);
		Arrays.stream(a).filter(k->k.equals(10)).forEach(System.out::println);*/
		
		List<StreamsApi> list = new ArrayList<>();
		list.add(new StreamsApi("Subbarayudu","mouse",809.0,4));
		list.add(new StreamsApi("ram","mouse",709.0,5));
		list.add(new StreamsApi("ram","mouse",709.0,9));
		list.add(new StreamsApi("ram","mouse",709.0,1));
		list.add(new StreamsApi("ram","mouse",709.0,2));
		list.forEach(System.out::println);
		
		System.out.println("====after filtering=======");
	//	list.stream().filter(x->x.price>800).forEach(System.out::println);
	/*list.stream()filter(k->k.qty<=5).collect(Collectors .toList());
	list.forEach(System.out::println);*/
		list.stream().sorted().forEach(System.out::println);
	}

}
