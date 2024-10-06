package streamapi;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {
		/*Integer a[] = { 2, 3, 5, 7, 2, 9, 0, 9, 4 };
		   Stream<Integer> sm= Arrays.stream(a).filter(i->i%2==1).forEach((s)->System.out.println(s));
		}*/
		//List<Integer> sm = List.of(1,2,3,4,5,6,7,8,9,10);
		/*Stream<Integer> ob=sm.stream();
		ob.forEach((d)->System.out.println(d));*/
		//sm.stream().filter(x -> x %2 != 0).sorted((i1,i2)->i1.compareTo(i2)).forEach((s) -> System.out.println(s));
		/* sm.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sm+ " ");
		*/
		List<Integer> li = new ArrayList<>();
		li.add(35);
		li.add(80);
		li.add(56);
		li.add(90);
		li.add(30);
		li.add(23);
		li.add(34);
		li.add(81);
		li.add(57);
		li.add(92);
		li.add(39);
		li.add(99);
		li.add(100);

		//filter the failure students
		li.stream().filter(m -> m < 35).forEach(System.out::println);

		//filter the total pass people students
		li.stream().filter(m -> m >= 35).forEach(System.out::println);
		//even numbers
		System.out.println("===Even numbers ===");
		li.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		// odd numbers
		System.out.println("===odd numbers ===");
		li.stream().filter(i -> i % 2 == 1).forEach(System.out::println);

		//Smallest values
		System.out.println("Minum value using collections class");
		Integer min = Collections.min(li);
		System.out.println(min);
		// another way of to find out min value
		System.out.println("another way using streams");
		  Integer min1=  li.stream().min((i1,i2)->i1.compareTo(i2)).get();
		     System.out.println(min1);
		//maximum values
		/*System.out.println("maximun value");
		    Integer max = Collections.max(li);
		    System.out.println(max);*/// another way of find ot maximum values
		System.out.println("maximun value");
          Integer max=   li.stream().max((i1,i2)->i1.compareTo(i2)).get();
          System.out.println(max);
             
	}
}
