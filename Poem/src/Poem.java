/**
 * 
 */

/**
 * @author User
 *
 */
public abstract class Poem {
	//String poemWords;

	/**
	 * 
	 */
	public Poem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public abstract int numLines(); ///{}
	
	public abstract int getSyllables(int k); //{}
	
	public void printRhythm() {
		String rhythm = "";
		for(int i = 0; i < numLines(); i++) {
			for(int j = 0; j <= getSyllables(i); j++) {
				rhythm += "ta-";
			}
			rhythm = rhythm.substring(0, rhythm.length()-1); //deletes the last dash
			rhythm += "\n";
		}
		System.out.println(rhythm);
	}
}
