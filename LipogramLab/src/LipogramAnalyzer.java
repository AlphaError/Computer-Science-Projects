/**
 * 
 */

/**
 * @author stewv
 *
 *  a lipogram (from Greek lipagrammatos, "missing letter")
is a kind of writing with constraints or word game
consisting of writing paragraphs or longer works in which
a particular letter or group of letters is missing,
usually a common vowel, the most common in English being e.
 */
public class LipogramAnalyzer {

	private String originalText;
	
	public LipogramAnalyzer(String text) {
		// TODO Auto-generated constructor stub
		originalText = text;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String mark(char letter) {
		return originalText.replace(letter, '#'); //pound = hashtag
	}
	public String allWordsWith(char letter) {
//		String fixed4Text = originalText; //attaining instance of text
//		String fixed3Text = fixed4Text.replace(".", ""); //deleting punctuation
//		String fixed2Text = fixed3Text.replace("!", "");
//		String fixedText = fixed2Text.replace("?", "");
		
		String word = ""; //organizer for each word instance in the string input
		int lastSpaceIndex = 0; //place holder for index (used for getting words)
		String lastWords = ""; //returned string
		
		for(int i = 0; i <= originalText.length(); i++) {
			if(originalText.length() >= (i+1) && originalText.charAt(i) == ' ') { //checks if its a space
				word = originalText.substring(lastSpaceIndex, i);
				lastSpaceIndex = i;
			}
			if(word.replace(letter, ' ') != word) { //checks if the word has the letter again
				if(originalText.lastIndexOf(word, (lastSpaceIndex - word.length() - 1)) == -1) { //checks if there is another instance of letter past the word's index
					lastWords += (word + "\n"); // adds word to return
				}
			}
		}
		
		if(lastWords.indexOf("\n" + word ) < 0) { //checks if the word has the letter again
			if(originalText.lastIndexOf(word, (lastSpaceIndex - word.length() - 1)) == -1) { //checks if there is another instance of letter past the word's index
				lastWords += (word + "\n"); // adds word to return
			}
		} //ms. screen's ...
		lastWords.trim(); //removes whitespace (spaces)
		return lastWords; //returns
	}
}
