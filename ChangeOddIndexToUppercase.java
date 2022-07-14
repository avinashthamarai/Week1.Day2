package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		/*
		 Pseudo Code
		 * Declare String Input as Follow
		 * String test = "changeme"
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c)find the odd index within the loop (use mod operator)
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 */

		String name = "testleaf";
		
		//Converting String to Character Array
		char[] chararray = name.toCharArray();
		
		for(int i=0; i<chararray.length;i++)
		{
			if(i%2 != 0)
			{
				char c = chararray[i];
				char upperCase = Character.toUpperCase(c);
				System.out.print(upperCase);
			}else
			{
				System.out.print(chararray[i]);
			}
		}
	}
}
