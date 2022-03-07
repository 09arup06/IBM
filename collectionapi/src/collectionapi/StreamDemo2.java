package collectionapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<String> basket = Arrays.asList("Mango","anana","aplle","orange");
		//basket.forEach(System.out::println);
		
		//basket.stream().forEach(System.out::println);
		Stream<String> str = Stream.of("Mango","nuaasdf","ruahfza","Aplee");
		//str.sorted().forEach(System.out::println);
		
		//str.map(s->s.toUpperCase()).forEach(System.out::println);
		str.filter(s->s.contains("a")).forEach(System.out::println);
	}

}
