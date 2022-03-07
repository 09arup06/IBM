package collectionapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class PersonStream {

	public static void main(String[] args) {
		List<String> p = Arrays.asList("Arr","Poas","Harr","Loka");
		//p.forEach(System.out::println);
		List<Integer>li=Arrays.asList(2,5,6,7);
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Arr",2);
		map.put("Poas", 5);
		map.put("Harr", 6);
		map.put("Loka", 7);
		for(String key:map.keySet())
		{
			System.out.println(key+ ": "+ map.get(key));
		}
		Stream<String> str = Stream.of("Arup","Lalt","Poka","Ioas");
		//str.sorted().forEach(System.out::println);
		str.filter(s->s.startsWith("P")).forEach(System.out::println);

		

	}
}
