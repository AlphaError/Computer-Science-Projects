package Notes;
/**
 * 
 */

/**
 * @author stewv
 *
 */
public class ClassNotes3 {

	/**
	 * 
	 */
	public ClassNotes3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* Numbers from Strings:
	 * -Wrapper Classes
	 * --String s1 = "-123", s2 = "123.45";
	 * --int n = Integer.parseInt(s1);
	 * --double x = Double.parseDouble(s2);
	 * 
	 * PDT  -->   WC
	 * int -->    Integer
	 * double --> Double
	 * char -->   Character
	 * -Number Formating Exception
	 * --String s3 = 1; --> conflicting types with String and Int/Double
	 */
//	int n;
//	do {
//		try {
//			n = Integer.parseInt(s); //attempts to do this
//		}
//		catch(NumberFormatException ex) { //if expecting not to work error (name is ex)
//			System...ln("Invalid input, reenter"); //print
//		}
//	}while(...); //runs again based on condition
	
	/* Character Methods
	 * -Java.lang.Character --> part of package
	 * --its a "wrapper" class that represents characters as objects
	 * -Methods --boolean methods
	 * --Character.isDigit(ch);
	 * --Character.isLetter(ch);
	 * --Character.isUpperCase(ch);
	 * --Character.isLowerCase(ch);
	 * --Character.isWhiteSpace(ch);
	 * --->whitespace == space, tab, newline, etc.
	 * 
	 * ex:
	 * -char ch2 = Character.toUpperCase(ch1);
	 * -int d = Character.digit(ch,radix);        (not on test)
	 * char ch = Character.forDigit(d, radix);    (not on test)
	 * 
	 * StringBuffer Class (not tested on ap but very useful)
	 * -represents a string of characters as mutable objects
	 * -constructors:
	 * --StringBuffer() //empty StringBuffer with a default capacity
	 * --StringBuffer(n) // empty StringBuffer with a given capacity
	 * --StringBuffer(str) // converts a String into a StringBuffer
	 * -adds methods: setCharAt, insert, append, delete
	 * -toString method that converts a StringBuffer into a string
	 */
	
	/* Practice/Review
	 * indexOf methods --> returns int starting at (assume 0) at which a string exists
	 * -indexOf(char/String/char,int/String,int)
	 * overload String methods --> lastIndexOf --> same thing but goes backwards (right to left) in reading the index numbers
	 * --the same method name but multiple different functions due to parameters or names (ex: indexOf, lastIndexOf, substring)
	 * String s and == or other relational operators and compareTo methods
	 * trim--> removes trailing (at the end) whitespace
	 * number to a string --> String x = toString(y);
	 */
	
	/* Radix
	 * int d = Character.digit(ch, radix);
	 * char ch = Character.forDigit(d, radix); --> returns a char that represents int d in a given int radix
	 * --returns the int value of the digit ch in the given int radix
	 * -Character.digit('7',10); --> returns 7 (nifty but not tested on)
	 * --where 10 references decimal (base 10)
	 * -Character.digit('A',16); --> returns 10
	 * -Character.forDigit('7',10); --> returns 7 as a char (forDigit flips)
	 * 
	 * Review!:
	 * StringBuffer sb = new StringBuffer(10); //sb is empty
	 * int len = sb.length();   //len is set to 0
	 * int cap = sp.capacity();   //cap is set to 10
	 * sb.append("at");   //sb holds "at"
	 * sb.insert(0, 'b');   //sb holds "bat"
	 * char ch = sb.charAt(1);   //ch is set to 'a'
	 * sb.setCharAt(0, 'w');   //sb holds "wat"
	 * sb.append("er");   //sb holds "water"
	 * sb.replace(1,3,"int");   //sb holds "winter"
	 * String s1 = sb.substring(1);   //s1 is set to "inter"
	 * String s2 = sb.substring(1,3);   //s2 is set to "in"
	 * sb.delete(4,6);   //sb holds "wint"
	 * sb.deleteCharAt(3);   //sb holds "win"
	 * sb.append(2020);   //sb holds "win2020"
	 * String str = sb.toString()   //str is set to "win202020"
	 */
}
