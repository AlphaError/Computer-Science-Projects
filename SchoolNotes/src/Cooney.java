import java.util.Scanner;
/**
 * 
 */

/**
 * @author stewv
 *
 */
public class Cooney {

	/**
	 * 
	 */
	public Cooney() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int correctCount = 0;
		do {
			System.out.println("\nPlease Enter a Word: ");
			String word = scan.next(); //next(), nextInt(), nextString()
			
			if(isLiked(word) == true) {
				System.out.println("Cooney Likes " + word + ".");
				correctCount++;
			}
			else {
				System.out.println("Cooney Doesn't Like " + word + ".");
				correctCount = 0;
			}
		}while(correctCount < 5);
		
		System.out.println("Congrats, you can appease the almighty Cooney's decires");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Prepare to be enslaved 0_0");
	}
	public static boolean isLiked(String word) {
		String lastLetter = "";
		for(int i = 0; i <= word.length()-1; i++) {
			if((word.charAt(i) + "").equals(lastLetter)) {
				return true;
			}
			else {
				lastLetter = word.charAt(i) + "";
			}
		}
		return false;
	}

}
