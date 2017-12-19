import java.util.Scanner;
/**
 * 
 */

/**
 * @author User
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Input the number you wish to get the factorial of...");
//		int num = scan.nextInt();
//		System.out.println(num + "! = " + getFactorial(num));
//		
//		System.out.println("Input the number you wish to take 2 to the power of...");
//		int num2 = scan.nextInt();
//		System.out.println("2^" + num2 + " = " + twoPow(num2));
		
		System.out.println("Input the number of Pascal's Triangle you wish to find...");
		int num3 = scan.nextInt();
		pascalTri(num3);
		
		System.out.println("Input the number you want converted to binary...");
		int num4 = scan.nextInt();
		System.out.println("Your number is " + convertBinary(num4));
		
		
	}
	
	public static int getFactorial(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n * getFactorial(n-1);
		}
	}
	
	public static long twoPow(long n) {
		if(n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 2;
		}
		else {
			return 2 * twoPow(n-1);
		}
	}
	
	public static int findNum(int rowNum, int x) { //helper method for pascal's triangle that gets the element
		if(x == 1 || x == rowNum) {
			return 1;
		}
//		else if (x == 2 || x == (rowNum-1)) {
//			return rowNum-1;
//		}
		else {
			return findNum(rowNum-1, x) + findNum(rowNum-1, x-1); //this is really cool
		}
	}
	public static void pascalTri(int row) {
		int[] lastLine = new int[row+1];
		for(int x = 1; x <= row; x++) {
			lastLine[x] = findNum(row, x);
		}
		int numLastLine = lastLine.length; //honestly just to store the number of terms the last line has
		
		for(int newRow = 1; newRow <= row; newRow++) {
			int[] rowRet = new int[newRow+1];
			for(int x = 1; x <= newRow; x++) {
				rowRet[x] = findNum(newRow, x);
			}
			
			for(int z = numLastLine; z >= 0; z--) {
				System.out.print(" ");
			}
			for(int y = 1; y < rowRet.length; y++) { //to print all elements except the first
				System.out.print(rowRet[y] + " ");
			}
			System.out.println("");
			numLastLine--;
		}
	}
	
//	public static double logBase(int base, int num) {//another helper method but for binary converter
//	    return Math.log(num) / Math.log(base); //log rules
//	}
	public static String convertBinary(int n) {
		if(n < 2) {
			return ""+n; //saves as String
		}
		else {
			return convertBinary((int)(n/2)) + n%2; // divisor is in relation to the base ex: n/10 & n%10
		}
	}
}
