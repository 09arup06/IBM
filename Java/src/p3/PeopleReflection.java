package p3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class PeopleReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
People p = new People("HAnsa");
System.out.println(p);
Class pc= p.getClass();
System.out.println(pc.getName());
System.out.println("----- list of constructors");
Constructor[] constructors= pc.getConstructors();
for(Constructor c: constructors)
	System.out.println(c);

System.out.println("-----List of methods");
Method [] methods = pc.getMethods();
for(Method m : methods)
	System.out.println(m);

	System.out.println("-----List of declared methods");
	Method [] decmethods = pc.getDeclaredMethods();
	for(Method m : decmethods)
		System.out.println(m);
}
}
