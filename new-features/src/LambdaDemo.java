import java.util.function.*;
public class LambdaDemo {
	public static void print(Object obj)
	{
		System.out.println(obj);
	}
public static void main(String[] args) {
	Consumer<String> c1 = (s)-> System.out.println(s);
	c1.accept("Hello");
	Consumer<String> c2 = System.out::println;
	c2.accept("Genre");
	Consumer<String> c3 = LambdaDemo ::print;
	c3.accept("Aloo");
	Supplier<String>s1=()->"Adios";
	System.out.println(s1.get());
	Supplier<Integer>s2= ()->(int)(Math.random()*100);
	System.out.println(s2.get());
	
	Predicate<Integer>p1=(x)->x>=0?true:false;
	System.out.println(p1.test(4));
	System.out.println(p1.test(-1));
	
	Predicate<Integer>p2=(x)->x%2==0?true:false;
	System.out.println(p2.test(5));
	System.out.println(p2.test(10));
	
	String email="arup@gmail.com";
	BiPredicate<String , String> contains = (s,c)->s.contains(c);
	System.out.println(contains.test(email,"@"));
	System.out.println(contains.test(email,"."));
	
	
	Function<Integer, Integer>f1 = (x)->x*x;
	System.out.println(f1.apply(5));
	BiFunction<Integer, Integer,Integer >b1=(a,b)->a+b;
	System.out.println(b1.apply(10,20));

	
}
}
