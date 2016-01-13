package streaming;

import java.util.stream.Stream;

public class IntegerSum {

	public static void main(String[] args) {
		Stream<Integer> ints1 = Stream.of();
		System.out.println(ints1.reduce(Integer::sum));
		
		Stream<Integer> ints = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(ints.reduce(0, Integer::sum));
	}
}
