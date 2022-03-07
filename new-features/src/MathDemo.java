@FunctionalInterface
interface Maths{
	//int square(int n);
	int sum(int a, int b);
	//boolean isOdd(int n);
}
public class MathDemo{
	public static void main(String[] args) {
		/*Maths m1= (n)-> n*n;
		Maths m2= (int n)->{
			int sqr=n*n;
			return sqr;
		};
		System.out.println(m1.square(10));
		System.out.println(m2.square(5));*/
		//Maths o1= (n)-> n % 2 != 0? true: false;
		Maths s1=(n1,n2)->n1+n2;
		System.out.println(s1.sum(5, 9));
	}
}