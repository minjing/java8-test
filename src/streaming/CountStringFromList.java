package streaming;

import java.util.Arrays;
import java.util.List;

public class CountStringFromList {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a", null, "b", "c", null, "d");
		long numNonNull = strings.stream().filter(str -> str != null).count();
		System.out.println("The number of non-null string is: " + numNonNull);
	}
}
