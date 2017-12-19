/**
 * 
 */
package Notes;

/**
 * @author stewv
 *
 */
public class ClassNotes7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addSquares(3));
		System.out.println(factorial(10));
		System.out.println(reverse("palendrome"));
	}

	/* Recursion
	 * learn about recursion
	 * learn to interpret and write recursive methods
	 */
	public static int addSquares(int n) {
        //Precondition...
        if(n == 1) { //base case
            return 1;
        }
        else {
            return addSquares(n-1) + n*n;
        }
    }
	
	/*
	 * Properties of Algorithms:
	Compactness
		An algorithm can use iterations or recursion to repeat the same steps multiple times
	Generality
		The same algorithm applies to any "size" or task or (any) input values
	Abstractness
		An algorithm does not depend on as particular computer language or platform
		(not down to the syntactical level)
	 */
	
	/*Recursive Methods:
		A recursive solution describes a procedure for a particular task in terms of applying
		the same procedure to similar, but smaller tasks.
		You must have a base case - which are cases that don’t need recursion
		Tangerine Knight’s Quest -  lvl B (the start) acts as the starting input,
		and lvl 1 is the Base Case
	 */
	
	/* Recursive Methods
	 * * recursion is based on the mathematical concept that the definition of a function
	 * *  can use itself aka Inception
	 * * f(n) = n! (n-factorial)
	 */
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return factorial(n-1) * n;
		}
	}
	//ex: n=4 -> fac(3) * 4
	//          fac(3) = fac(2) * 3
	//                  fac(2) = fac(1) * 2
	//                          fac(1) = 1
	// so then 1*2*3*4 = 24
	public static String reverse(String s) {
		if(s.length() >= 2) {
			s = reverse(s.substring(1)) + s.charAt(0);
		}
		return s;
	}
	//ex: reverse("AB") -> reverse("B") + "A"
	//                    reverse("B") = "B"
	//  final val = "BA"
	
	
	/*
	 * process(VE) + " " + process(HA)
	 * E + " " + V    +   A + " " + H
	 * + " " +
	 * process(UN) + " " + F
	 * N + " " + U
	 * 
	 * E + V + A + H + N + U + F
	 */
	public static int findMin(int[] list, int n) {
		if(n == 1) {
			return list[n-1];
		}
		else{
			return Math.min(list[n-1], findMin(list, n-1));
		}
	}
	
	/* Friday Quiz
	 * * We'll have the java reference sheet but the quiz is entirely short response
	 * * * in the style of the other sheets we got
	 */
	
}
