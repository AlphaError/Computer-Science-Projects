/**
 * 
 */

/**
 * @author stewv
 *
 */
public class Classwork1 {

	/**
	 * 
	 */
	public Classwork1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String scroll(String scrollWord) {
		String finalScroll;
		if(scrollWord.length() >= 2) {
			finalScroll = scrollWord.substring(1,scrollWord.length()) + scrollWord.charAt(0);
			//                   word from index 1                   +   letter from index 0
		}
		else if (scrollWord.length() == 1){
			finalScroll = scrollWord;
		}
		else {
			finalScroll = "";
		}
		return finalScroll;
	}
	
	public static boolean isFailedSameCharacter(String word) { //exception when word is a composition of the same letters doubled
		if(word.length() >= 2) {
			String firstHalf = word.substring(0, (word.length() / 2));
			String secondHalf = word.substring((word.length() / 2), word.length());
			if((word.length() % 2) == 0) { //if divisible by 2
				if(firstHalf.compareTo(secondHalf) == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else if((word.length() % 2) == 1) {
				if(firstHalf.length() < secondHalf.length()) {
					String newSecondHalf = secondHalf.substring(0, (secondHalf.length() - 1));
					if(firstHalf.compareTo(newSecondHalf) == 0) {
						return true;
					}
					else {
						return false;
					}
				}
				else if(firstHalf.length() > secondHalf.length()) {
					String newFirstHalf = firstHalf.substring(0, (firstHalf.length() - 1));
					if(secondHalf.compareTo(newFirstHalf) == 0) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(firstHalf.compareTo(secondHalf) == 0) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
		}
		else if(word.length() == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int newIndexOf(String word, char letter, int index) {
		int newIndex = -1;
		boolean hasInput = false;
		if(word.length() >= index) {
			for(int i = index; i <= word.length(); i++) {
				if(word.charAt(i) == letter && hasInput == false) {
					newIndex = i;
					hasInput = true;
				}
			}
		}
		else {
			newIndex = -1;
		}
		return newIndex;
	}

}
