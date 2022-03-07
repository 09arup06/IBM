package collectionapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
Map<String, String>people = new HashMap<>();
people.put("Polo","Pune");
people.put("Mili", "Mumbai");
people.put("Den","Delhi");
people.values().stream().forEach(System.out::println);
List<String>cities =people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
cities.forEach(System.out::println);
Map<String,List<String>> contacts= new HashMap<>();
contacts.put("Frudo",Arrays.asList("1212-3434","5656-7878"));
contacts.put("Sean",Arrays.asList("23121-3534","56565-8989"));
contacts.put("Ben",Arrays.asList("2112-6464","5633-1188"));
contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);

//Collect all contact numbers into a collection and print that contains your lucky number
//*contacts.values().stream().flatMap(Collection::stream).filter(x->x.startsWith("7")).forEach(System.out::println);
List<String> lucky = contacts.values().stream().flatMap(Collection::stream).filter(x->x.contains("7")).toList();
lucky.forEach(System.out::println);
	}
}
