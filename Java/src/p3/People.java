package p3;

public class People {
	private String name;
public People() {
	name="Anonymous";
	// TODO Auto-generated constructor stub
}
public People(String name) {
	this.name=name;
}
public String toString()
{
	return "People [name="+name+" ]";
}
private void print() {
	System.out.println("Name: "+name);
}
/*Secure even after accessible
 * private void print() {
	SecurityManager mgr=  new SecurityManager();
	mgr.checkPermission(new BasicPermission("No trsspassing") {});
	System.out.println("Name: "+name);
}*/
}
