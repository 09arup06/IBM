package p3;
import java.util.Scanner;

public class Test {

   public static void main(String[] args) {
      // create Scanner class object
      Scanner scan = new Scanner(System.in);

      // create String array of size 5
      String lang[] = new String[5];
      
      // read input
      System.out.println("Enter 5 Language Name:");
      for (int i = 0; i < 5; i++) {
         lang[i] = scan.nextLine();
      }

      // display
      System.out.println();
      System.out.println("Programming languages are:");
      for (int i = 0; i < 5; i++) {
         System.out.println(lang[i]);
      }
   }
}