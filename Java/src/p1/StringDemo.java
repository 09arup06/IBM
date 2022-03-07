package p1;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		System.out.println(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		s1=s1+"World";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,6));
	}
	}
/*12345678910
HELLOWORLD
0123456789*/

