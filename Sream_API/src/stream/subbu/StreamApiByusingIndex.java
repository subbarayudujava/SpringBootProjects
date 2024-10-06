package stream.subbu;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiByusingIndex {

	public static void main(String[] args) {
		String str = "Subbu";

		Map<String, Long> hash = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		hash.forEach((k, v) -> {
			System.out.println(k + "-" + v);
		});
	}
}
