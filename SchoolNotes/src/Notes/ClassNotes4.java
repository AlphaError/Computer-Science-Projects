package Notes;
import java.awt.Color;

/**
 * 
 */

/**
 * @author stewv
 *
 */
public class ClassNotes4 {

	/**
	 * 
	 */
	public ClassNotes4() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/* Arrays
	 * -an array is a block on consecutive memory locations that hold the same data type
	 * --the individual locations of an array is called it's elements
	 * ---when referring to an element, the actual reference is to the value of the element
	 *  |__|  |__|  |__|  |__|  |__|
	 *  -instead of treating each element as a separately named variable, all the elements are under the name of the index
	 *  -the specific array elements are referred to by using the array's name and the element's number,
	 *  --called the index or subscript
	 *  Indices
	 *  -index is written within [] --> ex. a[k]
	 *  --a = array name, k = index (number)
	 *  -Indices always start from 0 --> nth element = a[n-1]
	 *  --possibilities: a[k-2], a[(int)(6*Math.random())] //0 to 6 with 6 exclusive but 0 inclusive
	 *  -array is declared without a fixed length (unchangable)
	 *  -checks the values of the indices at runtime
	 *  -java interpreter checks indices and their values at runtime
	 *  -default value = 10
	 *  -if index is negative or greater than array length-1: ArrayIndexOutOfBoundsException
	 *  -arr = new int[newSize];
	 *  Arrays as Objects:
	 *  -Java, an array is an object if the type of the element is anyType and the type of array object is anyType
	 *  --declaration: someType[]arrayName; // can't skip
	 *  --initialization: arrayName = new someType[n]; with n being the length of the array
	 *  -more default values; integer-->0, String-->null, boolean-->false
	 */
	//ex. D&I
	int[] scores = new int[10];
	private double[] gasPrices = {3.05,3.17,3.59};
	String[] words = new String[1000];
	String[] cities = {"Atlanta", "Boston", "Cincinnati"};
	
	/* More Arrays
	 * -Array's Length
	 * --the length of the array is determined when the array is created
	 * --the length is either given explicitly or comes from the length of the inside of the {...}
	 * --the length of an array arrName is referred to in the code as arrName.length
	 * ---there are no parenthesis because the length is like a public field in an array object (not a method)
	 * -Initializing Elements
	 * --unless specific values are given in a {...} list, all the elements are initialized to the default-->
	 * --value: 0 for numbers, false for booleans, null for objects
	 */
//	Color[] pens; //array not created yet -----> import java.awt.Color;
////	...
//	pens = new Color[3]; //array is created; all 3 elements set to null
////	...
//	pens[0] = Color.BLUE;
//	pens[1] = new Color(15,255,255); //all 3 elements are initialized
//	pens[2] = Color.CYAN;
	
	/* Two-Dimensional Arrays:
	 * -2D arrays are used to represent tables, matrices, game boards, images, etc.
	 * -An element of a 2D array is addressed using a pair of indices, "row" and "column"
	 * --ex. board[r][c] = 'x';
	 * Declarations:
	 * -2D array of char with 5 rows, 7 columns
	 * --char[][] letterGrid = new char[5][7];
	 * -2D array of Color with 1024 rows, 768 columns
	 * --Color[][] image = new Color[1024][768];
	 * -2D array of double with 2 rows, 3 columns
	 * --double[][] sample = {
	 *        {0.0,0.1,0.2}
	 *        {1.0,1.1,1.2}};
	 * Dimensions:
	 * -In Java, a 2D array is basically a 1D array of 1D arrays, its rows.
	 * --Each row is stored in a separate block of consecutive memory locations
	 * --Ex. if m, is a 2D array, then m[k] is a 1D array, the kth row
	 * ---m.length--> num of rows
	 * ---m[k].length--> num of columns
	 * Ragged Array: (row vs. column) varying structure (not on AP)
	 * * * * *
	 * * *
	 * *
	 * * * *
	 * * *
	 * Rectangular Array: always same columns in each row
	 * * * *
	 * * * *
	 * * * *
	 * Nested Loops & 2D Arrays: 
	int[][] m = new int[5][5];
	for(int r = 0; r < m.length; r++) {
		for(int c = 0; c < m.[0].length; c++) {
			//process m[r][c]
		}
	}
	 * Triangular Loops:

	 * 
	 * *
	 * * *
	 * * * *
int n = m.length; //is 5
for(int r = 1; r<n; r++) {
	for(int c = 0; c<r; c++) { //0'th index of the column
		double temp = m[r][c]; //first time around... temp = m[1][0]
		m[r][c] = m[c][r];    //m[1][0] = m[0][1]
		m[c][r] = temp;       //m[0][1]
	}
}
	 */
}
