/**
 * 
 */
package Notes;

/**
 * @author User
 *
 */
public class TestPlace implements Place {
    private int x; 
    
    
	/**
	 * 
	 */
	public TestPlace(int x) {
		// TODO Auto-generated constructor stub
		this.x = x; 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Place p1 = new TestPlace(1);
	    Place p2 = new TestPlace(2);
	    Place p3 = new TestPlace(0);
		//Place y = 2;
		//Place z = -1;
		
		System.out.println(sameDistance(p1, p2, p3));
	}
	
	public int getX() {
		return x;
	}
	public static boolean sameDistance(Place p1, Place p2, Place p3) {
		return p1.distance(p2) == p1.distance(p3); //if p2 and p3 are equidistance from p1
	}

	public int distance(Place other) {
		return Math.abs(getX() - ((TestPlace)other).getX());
	}
}
