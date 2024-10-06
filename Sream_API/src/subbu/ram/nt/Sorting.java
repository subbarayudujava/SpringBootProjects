package subbu.ram.nt;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 9, 8, 8, 4, 3, 10, 5 };
		/*String[] numbers= {"subbarayudu","kutty","madhu","ram"};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}*/
		int[] num=Arrays.stream(numbers).sorted().toArray();
		System.out.println(Arrays.toString(num));
	}//main
}// class
