package collectionapi;

import java.util.HashMap;

public class MapsDemo {

	public static void main(String[] args) {
HashMap<String, String> map = new HashMap<>();
map.put("Scott","tiger");
map.put("Jack","jill");
map.put("polo", "lilli");
map.put("jack","rose");

System.out.println("Scott: "+map.get("Scott"));
System.out.println("Jack: "+map.get("jack"));
System.out.println("Polo: "+map.get("polo"));
System.out.println("----------");

for(String key:map.keySet())
{
	System.out.println(key+ ": "+ map.get(key));
}
	}

}
