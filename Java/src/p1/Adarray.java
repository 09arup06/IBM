package p1;

public class Adarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jag[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		for (int i = 0; i < jag.length; i++) {
			for (int j = 0; j < jag[i].length; j++) {
				System.out.println(jag[i][j] + "\t");
			}
			System.out.println();
		}
	}
}