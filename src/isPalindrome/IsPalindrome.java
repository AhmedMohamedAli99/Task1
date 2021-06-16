package isPalindrome;

import java.util.Scanner;

public class IsPalindrome {

	public static boolean isPalindrome(String str) {

		// Index pointing to the beginning of the string
		// and the end of the string
		
		int i = 0, j = str.length() - 1;
		
		// While there are characters to compare
	
		while (i < j) {
			//In case of no match for first letter
			
			if (str.charAt(i) != str.charAt(j))
				return false;
			// Increment first index and decrement the other
		
			i++;
			j--;
		}

		// If string is palindrome
		return true;
	}

	public static void main(String[] args) {
		System.out.print("Enter any string : ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(isPalindrome(str));
	}

}
