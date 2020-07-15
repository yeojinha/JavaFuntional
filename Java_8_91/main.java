package Java_8_91;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {

		System.out.println(Stream.of(1,2,3,4,5)
				.collect(toSet()));
		System.out.println(Stream.of(1,2,3,4,5)
				.map(i->String.valueOf(i))
				.collect(joining(", ")));
		System.out.println(Stream.of(1,2,3,4,5)
				.map(i->String.valueOf(i))
				.collect(toList()));
	}

}
