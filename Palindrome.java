package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not

		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String original = "madam";
		String rev = "";

		// converting String to toCharArray()

		char[] chararray = original.toCharArray();

		// Iterating chararray in reverse order

		for(int i=chararray.length-1; i>=0; i--)
		{
			rev = rev+original.charAt(i);
		}

		if (original.equals(rev))
		{
			System.out.println("Given string is Palindrome");
		}
		else {
			System.out.println("Given string is not an Palindrome");
		}
	}
}
