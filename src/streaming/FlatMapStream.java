package streaming;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

public class FlatMapStream {
	public static void main(String[] args) throws Exception {
		Stream<String> lines = Files.lines(new File("test.txt").toPath(), StandardCharsets.UTF_8);
		lines.flatMap(line -> Stream.of(line.split("="))).forEach(System.out::println);
		lines.close();
	}
}
