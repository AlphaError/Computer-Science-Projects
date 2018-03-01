/**
 * 
 */


/**
 * @author User
 *
 */
public class Mazer {

	private static String[][] maze;
	private String[] randomizer = {"|", "/", "/", "\\", "\\", null, null, null, null, null};
	
	public Mazer(int rows, int cols) {
		maze = new String[rows][cols];
		for(int x = 0; x < rows; x++) {
			for(int y = 0; y < cols; y++) { //declaring values
				if(x != 0) {
					maze[x][y] = ""+(int)(Math.random() * 10);
				}
			}
		}
		maze[rows][cols-1] = null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
}
