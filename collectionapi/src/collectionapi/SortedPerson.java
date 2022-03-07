package collectionapi;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
public static void main(String[] args) {
	Comparator<Person> compAge=(p1,p2)-> p1.getAge()-p2.getAge();
	Comparator<Person> compName=(p1,p2)->p1.getName().compareTo(p2.getName());
	TreeSet<Person> people = new TreeSet<>(compName);
	people.add(new Person("Polo",21));
	people.add(new Person("Jack",24));
	people.add(new Person("Lilio",245));
	for(Person p : people)
		System.out.println(p);
	
}
}
