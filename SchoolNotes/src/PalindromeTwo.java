import java.util.Scanner;
/**
 * 
 */

/**
 * @author stewv
 *
 */
public class PalindromeTwo {

	/**
	 * 
	 */
	public PalindromeTwo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("?");
//		String word = scan.next(); //next(), nextInt(), nextString()
		
	    
	    System.out.print("Please enter a palindrome: ");
	    String s = scan.nextLine();
	    
	    if(isUpgradePalindrome(s)) {
	    	System.out.println( s + " is a palindrome");
	    }
	    else {
	    	System.out.println(s = " is not a palindrome");
	    }
		System.out.println();
	}
	
	public static boolean isUpgradePalindrome(String str) {
	    String backStr = "";
	    for(int i = str.length() - 1; i >= 0; i--) {  //for each letter adds the letter from last to first
	    	if(Character.isLetterOrDigit(str.charAt(i)) == true) {
	    		backStr += str.charAt(i);
	    	}
	    }
	    
	    String forwardStr = "";
	    for(int i = 0; i <= str.length() - 1; i++) { // -1 due to indexing
	    	if(Character.isLetterOrDigit(str.charAt(i)) == true) {
	    		forwardStr += str.charAt(i);
	    	}
	    }
	    
	    if(backStr.equalsIgnoreCase(forwardStr)) { //checks if the backwards version is the same without case
	    	return true;
	    }
	    else {
	    	return false;
	    }
  }
}
