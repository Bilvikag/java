import java.util.Scanner;
import java.util.Arrays;
public class anagraam {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    System.out.print("Enter first String: ");
		    String a = input.nextLine();
		    System.out.print("Enter second String: ");
		    String b = input.nextLine();
		    if(a.length() == b.length()) {
		      char[] charArray1 = a.toCharArray();
		      char[] charArray2 = b.toCharArray();

		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(a + " and " + b + " are anagram.");
		      }
		      else {
		        System.out.println(a + " and " + b + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println(a + " and " + b + " are not anagram.");
		    }

		    input.close();
	}		
}

