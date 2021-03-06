import java.util.Scanner;


/**
 * @author Kyler Smith, 2017
 *
 * Implementation of a character count.
 * (Slow, could be improved upon, effectively O(n).
 * */

public class CountChar {

    public static void main(String[] args) {
  	  	Scanner input = new Scanner(System.in);
  	  	System.out.print("Enter your text: ");
      	String str = input.nextLine();

        System.out.println("There are " + CountCharacters(str) + " characters.");
    }



    /**
     * @param str: String to count the characters
     *
     * @return int: Number of characters in the passed string
     * */

    public static int CountCharacters(String str) {

    	int count = 0;

    	if(str.isEmpty() || str == null)
    		return -1;

        for(int i = 0; i < str.length(); i++)
        	if(!Character.isWhitespace(str.charAt(i)))
        		count++;

        return count;
     }
}
