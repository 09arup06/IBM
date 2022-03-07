package p3;

public class Persoon implements Cloneable{
private String name;
private int age;
public Persoon() {
	// TODO Auto-generated constructor stub
}
public Persoon(String name, int age) {
	this.name = name;
	this.age = age;
}
public void print()
{
	System.out.println("Name: "+name +"\tAge: "+age);
}
@Override
public String toString() {
	return "Name: "+name+ "\tAge: "+age;
}


@Override
public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(obj==this)
		return true;	
	
	Persoon p1= (Persoon)obj;
	return this.name.equals(p1.name)&&this.age==(p1.age);
}
	
public static void main(String[] args) throws Exception {
	Persoon p1= new Persoon("Polo",21);
	p1.print();
	/*System.out.println(p1.hashCode());
	System.out.println(p1);
	Persoon p2= new Persoon("Polo", 21);
	System.out.println(p2.hashCode());
	System.out.println(p2);
	System.out.println(p1.equals(p2));
	System.out.println(p1.equals(p2));*/
	
	Persoon pc= (Persoon) p1.clone();
	System.out.println(pc);
	
	
}

}
