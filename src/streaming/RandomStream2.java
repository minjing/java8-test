package streaming;

import java.util.stream.Stream;

public class RandomStream2 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.generate(() -> String.valueOf(Math.random()));
		stream.limit(10).forEach(System.out::println);
	}
}
