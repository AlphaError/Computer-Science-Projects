/**
 * 
 */
import java.awt.*;
import java.lang.reflect.Array;

/**
 * @author stewv
 *
 */
public class ArrayLab2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] checkers = new char[8][8];
		fillCheckerboard(checkers);
	}
	
	public static boolean checkDiagonals(int[][] matrix, int r, int c) {
//		for(int i = 0; i < matrix.length; i++) {
//			if(matrix[i][i-1] == numberCheck) {
//				return true;
//			}
//		}
//		return false;
		if(r == c) {
			return true;
		}
		else if(c == (matrix.length-1)-r) {
			return true;
		}
		return false;
	}
	
	public static void fillCheckerboard(char[][] board) {
		for(int j = 0; j < board.length; j++) {
			for(int i = 0; i < board[j].length-1; i += 2) {
				board[j][i] = 'x';
			}
			for(int i = 1; i < board[j].length-1; i += 2) {
				board[j][i] = 'o';
			}
		}
		System.out.println(board);
	}

}
