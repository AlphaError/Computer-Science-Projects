package Notes;
/**
 * 
 */

/**
 * @author Stewart Hughes
 * @teacher Danah Screen
 * @date 9/6/17-
 *
 *Class Structure
 */
public class ClassNotes1 {
	
	// field zone (global variables)
	private int students = 17;
	
	public ClassNotes1(int students/*constructor*/) {
		this.students = students; //this accesses a variable outside of the function
	}

	public int totalStudents(int addstudents) {//method
		return this.students + addstudents;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* List of Errors:
		 * "Cannot resolve symbol" (if you call a local variable outside of scope, you will invoke a compiler syntax error)
		 * 
		 */
	
		/* Casting:
		 * (cast type) sometype somevar;
		 */
//		double xx = 5.2; //truncating (x is not 5)
//		(int)xx;
		/* Strings:
		 * strings in "" are recognized as literal constants or literal strings
		 * + or += (string concatenation)
		 */
		String catch22 = "Catch_" + "22"; //"Catch_22"
		
		/* Escape Sequences
		 * \n --> new line
		 * \r --> carriage return (type writer)
		 * \t --> tab or indent
		 * \\ --> prints a backslash
		 * \" --> prints double quotes
		 * \' --> prints single quote
		 */
		System.out.print("I like tacos.\nI do too");
		
		/* Symbolic Constants
		 * initialized final variables
		 * ex. private final int sidelength = 8;
		 * --> easy to change the value throughout entire code (becuase it can't be changed within it)
		 * private final double TAX_RATE;
		 */
		
		/* Arithmetic
		 \ Operators --> +, -, /, *, %
		 * Modulus (remainder)
		 * PEMDAS (% is the same rank as * and /)
		 * Unary Operators --> - (side = -side), ! (not), ++, --
		 * 
		 */
		int a = 17;
		int b = 5;
		// a/b is truncated into 3 because they're ints
		double ex = a/b;
		int ex2 = (int) ((double)a/b);
		
		/* Compound operators
		 * +=, -=, *=, /=, %=
		 * a = a+b;
		 * a += b;
		 */
		
		/* Math Operators
		 * Math.abs(x) (absolute value)
		 * Math.round(x) (rounds to nearest int)
		 * Math.pow(x,y) (x^y --> both have to be doubles)
		 * Math.sqrt(x) (square root of x)
		 * Math.max(x,y) (returns largest of x and y)
		 * Math.min(x,y) (returns lowest of x and y)
		 * Math.random() (returns random value greater than or equal to 0 and less than 1)
		 */
		
//		boolean cond1;
//		boolean cond2;
//		boolean cond3;
		/* Relational Operators: (data type- boolean)
		 * == --> equal to
		 * >= --> greater than or equal to
		 * <= --> less than or equal to
		 * != --> not equal to
		 * > --> greater than
		 * < --> less than
		 */
		
		/* Logical Operators
		 * && --> and
		 * || --> or
		 * ! --> not
		 * 
		 * DeMorgan's Law
		 * !(p&&q) is the same as !p || !q
		 * !(p||q) is the same as !p && !q
		 * 
		 * !((a&&!b) > (x || y)) --> (!a||b) <= (!x&&!y)
		 * !(a||b && c) && (!(y<(x||z))) --> (!a&&!b||!c) && (!y>=(!x&&!z))
		 */
		
		/* Rules of Precedence (note: unary - is like negative)
		 * Highest:
		 * !, (unary) -, (cast), ++, --
		 * *, %, /
		 * +, -
		 * <, <=, >, >=, ==, !=
		 * &&
		 * ||
		 * Lowest:
		 */
		
		/* Short Circuit Evaluation:
		 * if(cond1 || ... cond57)
		 * cond1 is true, the rest don't need to be evaluated
		 * if(cond2 && ... cond57)
		 * cond2 is false, the rest don't need to be evaluated (aren't evaluated)
		 */
		
		/*
		 * more than 1 line will create another if statement... ex:
		if(cond)
		   if(cond1)
	           if(cond2)
	        	   //statement
		else {}
			//else is tied to the cond2 condition because it is closest --> use bracets
		 */
			
		/* Loops:
		 * 1. Initialization
		 * 2. Condition
		 * 3. Change (incrementation)
		 */
//		for(int i=0; i<=10; i+= 2) {}
//		int j = 0;
//		while(j<=55) {
//			j+= 2;
//		}
//		int f;
//		do {
//			f+= 2;
//		} while(cond);
		
		/* Quiz Notes:
		 * Topics:
		 * -Number Systems (decimal/binary/octal/hexadecimal)
		 * -Data Types (primitives)
		 * -Demorgan's Law
		 * -Operators
		 * --logical (|| && !)
		 * --relational
		 * --arithmetic(+ - / %)
		 * --if statements (nested and if/else if/else)
		 * -Loops (for/while/do while)a
		 * 
		 * Format:
		 * -3-4 multiple choice
		 * -1 short free-response (writing a method based on prompt)
		 */
	}
}
