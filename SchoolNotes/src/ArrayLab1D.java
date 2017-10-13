/**
 * 
 */

/**
 * @author stewv
 *
 */
public class ArrayLab1D {

	public ArrayLab1D() {
		// TODO Auto-generated method stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static boolean isSame(int[] arrInts) {
		if(arrInts[0] == arrInts[arrInts.length-1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static char getRandomRps() {
		char[] letters = {'r','r','r',  'p','p','p','p','p',  's','s','s','s','s','s'};
		int index = (int)(Math.random() * letters.length);
		return letters[index];
	}
	
	public static int computeScore(String word) {
		String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
				"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int[] pointValues = {1,2,3,4,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
		int playerScore = 0;
		
		for(int i = 0; i < word.length(); i++) { //for every letter in the word
			for(int j = 0; j < alphabet.length; j++) { //for every letter in the alphabet array
				if(alphabet[j].equalsIgnoreCase(word.charAt(i) + "")) { //if the alphabet letter is the wor'ds letter
					playerScore += pointValues[j]; //add the point value in correlation with the alphabet letter's index
				}
			}
			//can also do if(alphabet.indexOf(word.charAt(i) + "") >= 0) {} instead of the for loop
		}
		return playerScore;
	}
}
