import java.util.Scanner;
/**
 * 
 */

/**
 * @author stewv
 *
 */
public class HangmanGame {

	static String finalWord = "";
	static StringBuffer wordGuessed;
	static StringBuffer lettersTried;
	
	
	/**
	 * 
	 */
	public HangmanGame(String word) {
		// TODO Auto-generated constructor stub
		finalWord = word.toUpperCase();
		wordGuessed = new StringBuffer(word.length());
		for(int i = 0; i < finalWord.length(); i++) {
			wordGuessed.append("-");
		}
		lettersTried  = new StringBuffer(26);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int tryLetter(char letter) {
	   letter = Character.toUpperCase(letter);
	   /*
		for(int i = 0; i <= lettersTried.length()-1; i++) {
			if(lettersTried.charAt(i) == letter) { //if the letter had been played
				return 0;
			}
		}
		for(int i = 0; i <= finalWord.length()-1; i++) {
			if(finalWord.charAt(i) == letter) { //if the letter is in the word
				lettersTried.append(letter); //adds letter to list of tried
				wordGuessed.replace(i, i, (letter + "")); //adds letter to list of correct guesses
				return 1; // win
			}
		}
		*/
	   if (lettersTried.toString().indexOf(letter) >= 0)
		   return 0;
	   else if (finalWord.indexOf(letter) < 0) { // condition for if the index exits 
		lettersTried.append(letter); //adds letter
		return -1; //the only other case in which the letter hasn't been played and isn't in the word
	   }
	   else {
		   for(int i = 0; i <= finalWord.length()-1; i++) {
				if(finalWord.charAt(i) == letter) { //if the letter is in the word
					wordGuessed.setCharAt(i, letter); //sets the letters guessed into wordGuessed
	   }
	}
		   lettersTried.append(letter); //adds letter
		   return 1; //the letter is guessed correctly
	   }
	}
	
	public String getWord() {//accessor methods
		return finalWord;
	}
	public String getGuessed() {
		return wordGuessed.toString();
	}
	public String getTried() {
		return lettersTried.toString();
	}
	
}
