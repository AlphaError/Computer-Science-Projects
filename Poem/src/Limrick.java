/**
 * 
 */

/**
 * @author User
 *
 */
public class Limrick extends Poem {

	/**
	 * 
	 */
	public Limrick() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numLines() {
		return 5;
	}
	
	public int getSyllables(int k) {
		if(k == 1 || k == 2 || k == 5) {
			return 9;
		}
		else {
			return 6;
		}
	}
	
}
