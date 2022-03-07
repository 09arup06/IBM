package p2;
import java.util.Random;
public class Pizza {
double pricee = 0;
String mdip;
String type;
String size;
int qty;
Random rand= new Random();
int x= rand.nextInt(150);

public Pizza() {
}

public Pizza(String mdip, String type, String size, int qty) {
super();
this.mdip = mdip;
this.type = type;
this.size = size;
this.qty = qty;
}

public void price() {
pricee = qty * 10;
if (size.charAt(0) == 'L') {
Lprice();
} else if (size.charAt(0) == 'M') {
Mprice();
} else if (size.charAt(0) == 'R') {
Rprice();
} else if (size.charAt(0) == 'S') {
Sprice();
} else {
System.out.println("Please check size once again");
}
}

public void Lprice() {
pricee = pricee * 75;
if (type.charAt(0) == 'C')
Classic();
else if(type.charAt(0)=='F')
FreshPan();
else
System.out.println("Please Enter crust correctly");
}

public void Rprice() {
pricee *= 50;
if (type.charAt(0) == 'C')
Classic();
else if(type.charAt(0)=='F')
FreshPan();
else
System.out.println("Please Enter crust correctly");
}

public void Mprice() {
pricee *= 25;
if (type.charAt(0) == 'C')
Classic();
else if(type.charAt(0)=='F')
FreshPan();
else
System.out.println("Please Enter crust correctly");
}

public void Sprice() {
pricee = pricee * 10;
if (type.charAt(0) == 'C')
Classic();
else if(type.charAt(0)=='F')
FreshPan();
else
System.out.println("Please Enter correctly");
}

public void Classic() {
pricee += 15;
Mdip();
}

public void FreshPan() {
pricee += 50;
Mdip();
}

public void Mdip() {
if (mdip.charAt(0) == 'Y') {
pricee += 40;
print();
} else if(mdip.charAt(0)=='N')
print();
else System.out.println("Give input as Y or N");
}

private void print() {
System.out.println("---------------CHECKOUT---------------- ");
System.out.println("You have ordered for a " + size + "size pizza");
System.out.println("You have ordered " + qty + " no. of Pizzas");
System.out.println("You have chosen " + type + " crust pizza");
System.out.println("You have chosen Mayonese Dip: " + mdip);
System.out.println("the total amount for your order is: " + pricee);
System.out.println("Your order number is: "+x+" . Please wait");
System.out.println("-----THANK YOU PLEASE VISIT AGAIN-----");
}

}