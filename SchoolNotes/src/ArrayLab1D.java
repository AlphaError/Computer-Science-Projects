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
		String[] alphabet = {};
		int[] pointValues = {};
		for(int i = 0; i < word.length(); i++) {
			//syntax for letter in a word
			if(alphabet.indexOf() != -1) {
				
			}
		}
	}
}
