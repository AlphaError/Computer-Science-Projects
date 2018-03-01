/**
 * 
 */

/**
 * @author User
 *
 */
public class Diploma {
	
	String newDiploma;

	/**
	 * 
	 */
	public Diploma(String name, String language) {
		// TODO Auto-generated constructor stub
		newDiploma = "This certifies that " + name + "\n" + "has completed a MOOC in " + language;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Diploma dip1 = new Diploma("Stewart", "AP CompSci");
//		System.out.println(dip1);
	}
	
	public String toString() {
		return newDiploma; //an object class exist that uses this method so you are more or less overriding it
	}
	

}
