/**
 * 
 */

/**
 * @author stewv
 *
 */
public class Die {

	/**
	 * 
	 */
	public Die() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	int rollNum;
	public void roll() {
		rollNum = (int)(5 * Math.random()) + 1;
	}
	public int getNumDots() {
		return rollNum;
	}

}
