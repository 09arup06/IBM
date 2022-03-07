package p1;
import java.util.*;
import java.lang.String;
public class ValidEmail {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n,c,a,d,a1,l;
		String pattern = "^((?=[A-Za-z0-9@])(?![_\\\\-]).)*$";
		if (s.contains("@")&&(s.contains(".")))
				{
		a=s.indexOf("@");
		d=s.indexOf(".");
		n= s.codePointCount(0,a);
		c=s.codePointCount(a, d);	
		l=s.length();
		a1=s.codePointCount(d,l-1);
		if((n<=4)&&(c>=3)&&(a1>=2))
		{	
				System.out.println("PAss is valid");}}
		else if (s.matches(pattern)) { 
			System.out.println("Invalid");
		}
		sc.close();
		}
		}
