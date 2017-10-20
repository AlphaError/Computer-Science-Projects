package Notes;
/**
 * 
 */

/**
 * @author stewv
 *
 */
public class ClassNotes5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* For-Each Loops
		 * 
		 */
		int[] scores = null;
		int sum = 0;
		for(int i = 0; i < scores.length; i++) { //number of rows
			int s = scores[i];
			sum += s;
		}
		//aka
		int[] scores1 = {};
//		int sum = 0;
		for(int s:scores1) { //can use break but it's better to use a for loop then
			sum += s;
		}
		
//		int sum = 0;
		int[][] scores2 = null;
		for(int r = 0; r < scores.length; r++) {
			for(int c = 0; c < scores2[0].length; c++) {
				int s = scores2[r][c];
				sum += s;
			}
		}
		//aka
//		int[][] scores2 = null;
//		int sum = 0;
		for(int[] num: scores2) {
			for(int s: num) {
				sum += s;
				//int[][] scores is possible because your re-initializing a new array
			}
		}
		
		/* More For-Each Loops
		 * * You can't add or remove element within a for-each loop
		 * * * Only access the elements as they go through the loop
		 * * * But you can store values given into different formats and edit those as needed
		 */
	}
	
	public static int sumElements(int[] values) {
		int sum = 0;
		for(int s: values) {
			sum += s;
		}
		return sum;
	}
	public static void sumElements2(int[][] t) {
		for(int sums[]: t) {
			System.out.println(sums);
		}
	}
}
