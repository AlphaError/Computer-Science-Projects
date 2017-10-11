package Notes;
/**
 * 
 */

/**
 * @author stewv
 * 9/18/2017
 * Post Quiz #1 ~ Notes
 */
public class ClassNotes2 {

	/**
	 * 
	 */
	public ClassNotes2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Strings (topics)
		 * -literal strings
		 * -String constructors & commonly methods
		 * -Immutability of strings
		 * -Format numbers into strings & extract numbers from strings
		 * -Learn methods of the Character class
		 */
		
		/* String Class
		 * -an object of the String class represents a string of characters
		 * -the String class belongs to the java.lang package (which is already build into Java)
		 * -it has it's own constructors and specified methods
		 * -unlike other classes, the String class has two operators: +, += (String concatenation)
		 * 
		 * -string text may include "escape" characters
		 * -- \\ stands for \
		 * -- \n stands for newline
		 */
		String c1 = "Biology";
		String c2 = "C:\\jdkl.2\\docs"; //a random file path (reads double backslash as single)
		
		/* Literal String
		 * -objects in the String class
		 * -- defined as text within double quotes ("")
		 * -can be assigned to String variables
		 * -can be past in methods and constructors as parameters
		 * "some text",someMethod(...);
		 * "some text".equals(string); --> test if the values in string are the same as "some text"
		 */
		
		/* Immutability
		 * -once created, a string cannot be changed; none of its methods can change the String
		 * -- aka immutable objects
		 * -Advantage: more efficient, no need to copy
		 */
		String i1 = "Sun"; // more efficient than declaring s2 = new String(s1); since both values have to be changed separately
		String i2 = i1;
		
		/* Empty Strings
		 * -a string with no characters in it: length = 0 value = null
		 */
		String e1 = "";
		String e2 = new String();
		
		/* String Methods:
		 * -length(), charAt()
		 * --(String).length(); --> Returns the number of characters in a string (int)
		 * --(String).charAt(k); --> Returns the k-th char/char at index k
		 * ---"Flower".length() --> 5
		 * ---"Wind".charAt(2); --> 'n'
		 * 
		 * Substrings~~
		 * -String s2 = s.substring(i, j);
		 * --returns a substring of chars in positions from i to (j-1) --> [i, j) (i being inclusive and j exclusive)*
		 * -String s2 = s.substring(i);
		 * --returns a string from the i-th char to the end of the string
		 * "strawberry".substring(2,5); --> "raw"
		 * "unhappy".substring(2); --> "happy"
		 * "emptiness".substring(9); --> "" (empty string)
		 * ---substring is an overloaded method because it has more than one version of itself (substring with 1 or 2 parameters)
		 * str.substring(i) <---> str.substring(i, str.length());
		 * 
		 * Concatenation~~
		 * -String result s1 + s2;
		 * --concatenation of s1 & s2
		 * -String result = s1.concat(s2);
		 * --concatenation of s1 & s2 (same thing)
		 * -result += s3; <---> result.concat(s3);
		 * -result += num;
		 * --num becomes a string once it is concatenated with result
		 * 
		 * indexOf~~
		 * -String date = "Feb 18, 2001 8:52:28 AM";
		 * --date.indexOf('F'); --> returns 0
		 * --date.indexOf('2'); --> returns 8
		 * ---single quotes are needed cuz its recognized as a character
		 * --date.indexOf('2001'); --> returns 8
		 * --date.indexOf('2',9); --> 16
		 * --date.lastIndexOf('2'), --> returns 18
		 * -s.indexOf(s.charAt(2)); cancels out
		 * 
		 * -Overloads
		 * --indexOf(char);
		 * --indexOf(String);
		 * --indexOf(String, int);
		 * --indexOf(char, int);
		 * ---last index of just goes from decreasing index number (applicable for all indexOf overloads)
		 * ---returns empty string if not found
		 * 
		 * Comparisons~~
		 * -boolean b = s1.equals(s2);
		 * --returns true if the String s1 equals s2
		 * -boolean b = s1.equalsIgnoreCase(s2);
		 * --returns true if the String s1 equals s2 but case-blind (Ss = sS);
		 * -int diff = s1.compareTo(s2);
		 * -int diff = s1.compareToIgnoreCase(s2);
		 * --returns int
		 */
		
		/* Lexicographical Character Sequencing
		 *  -A generalization of the way the alphabetical order of words is based on the alphabetical order of their component letters.
		 *  -This generalization consists primarily in defining a total order over the sequences (often called words in computer science),
		 *  of elements of a finite totally ordered set, often called alphabet.
		 *  --Upper-case letters are a lower value than lowercase
		 */
		
		String str1 = "String method tutorial";
		String str2 = "compareTo method example";
		String str3 = "String method tutorial";
		int var1 = str1.compareTo(str2);
		System.out.println("str1 & str2 comparison: " + var1);
		int var2 = str1.compareTo(str3);
		System.out.println("str1 & str3 comparison: " + var2);
		int var3 = str2.compareTo("compareTo method example");
		System.out.println("str2 & string argument comparison: " + var3);
		/* Output:
		 * -str1 & str2 comparison: -16   --> between str1 and str2, the lowest index at which a value differs is [0] where 'c' > 'S' so the value is posative
		 * -str1 & str3 comparison: 0
		 * -str2 & string argument comparison: 0
		 */
		
		/* compareTo
		 * -compares two strings lexicographically
		 * -comparison is based on the Unicode value of each char in the string
		 * --the result is negative if the String object is smaller
		 * --the result is a positive if the String object is bigger
		 * --the result is 0 if the object is equal to the argument
		 * -If they (String object & argument) have difference chars at one or more index...
		 * --this.charAt(k)-anotherString.charAt(k)
		 * ---k is the smallest index
		 * ---then the string whose char at position k has a smaller value, lexicographically, precedes the other String
		 * -Symbols and "number strings" also have values (numbers generally lesser than actual letters)
		 * -lower case has a higher lex val than upper
		 */
		
		/* Replacements:
		 * -String s2 = s1.trim();
		 * --returns a new string from s1 that removes white-space at both ends of a string
		 * -String s2 = s1.replace(OldCh, newCh);
		 * --returns a new string that replaces all (single character) values OldCh with NewCh - like the find feature for 1 letter
		 * String s2 = s1.toUpperCase();
		 * String s2 = s1.toLowerCase();
		 * -return a new string formed from s1 by converting its characters to upper and/or lower case.
		 * --String immutability --> must set value equal to a new string because the functions on their own
		 */
		
		String s = Float.toString('x');
		/* Numbers to Strings
		 * 1. String s = "" + n;
		 * 2. String s = Integer.toString(n);
		 * 3. String s = Double.toString(x);
		 * -Wrapper classes --> Integer, Double, Character, Float, etc. (all primitive data types)   (int n, double x)
		 * 4. String s = String.valueOf(n);
		 * -With--> import java.text.DecumalFormat;
		 * DecimalFormat money = new DecimalFormat("0.00");
		 * --stores decimal format object within money
		 * double amount = 56.7381
		 * String s = money.format(amount);   --> s = 56.74
		 */
		
		/* Other Notes:
		 * -Test: 1-2 methods/class & multiple choice
		 * -String is a class and char is a data type
		 * --the charAt method is based on the String class, which converts a single string to a Char
		 * --you can also concatenate a char into a string
		 */
	}
}
