/**
 * 
 */

/**
 * @author User
 *
 */
public class DiplomaWithHonors extends Diploma{
	
	String honors = "*** with honors ***";
	
	public DiplomaWithHonors(String name, String language) {
		// TODO Auto-generated constructor stub
		super(name, language);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DiplomaWithHonors dip1 = new DiplomaWithHonors("Stewart", "AP CompSci");
//		System.out.println(dip1);
	}
	
	public String toString() {
		return super.toString() + "\n" + honors;
	}

}
