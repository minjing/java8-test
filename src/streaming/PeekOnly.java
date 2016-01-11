package streaming;

import java.util.Arrays;
import java.util.List;

public class PeekOnly {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bender", "Fry", "Leela");
		list.stream().peek(System.out::println);
	}
}
