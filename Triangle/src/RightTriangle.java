/**
 * @author User
 *
 */
public class RightTriangle extends Triangle{

//	private double side;
	/**
	 * 
	 */
	public RightTriangle(double side) {
		// TODO Auto-generated constructor stub
		super(side);
//		this.side = side; // -this- is outside
	}
	
	public double getPerimeter() {
		return (2 + Math.sqrt(2.0)) * getSide();  // accessor-method getSide() replaces the need to create
		                                          //a side variable in the subclass
	}
	public double getArea() {
		return getSide() * getSide() / 2;
	}

}
