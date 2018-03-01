/**
 * 
 */

/**
 * @author User
 *
 */
public class Reservation {

	private String reservedName;
	public boolean isFrequentFlier = false;
	/**
	 * 
	 */
	public Reservation(String passangerName) {
		// TODO Auto-generated constructor stub
		reservedName = passangerName;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String passangerName() {
		return reservedName;
	}
	
	public boolean frequentFlier() {
		return isFrequentFlier;
	}
	

}
