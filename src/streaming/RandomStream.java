package streaming;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class RandomStream {

	public static void main(String[] args) {
		Stream<String> stream = Stream.generate(new Supplier<String>() {
			@Override
			public String get() {
				return String.valueOf(Math.random());
			}
		});
		stream.limit(10).forEach(System.out::println);
	}
}
