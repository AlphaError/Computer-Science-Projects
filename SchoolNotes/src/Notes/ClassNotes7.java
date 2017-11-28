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

}
