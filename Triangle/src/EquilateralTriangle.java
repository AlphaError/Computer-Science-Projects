import java.util.Scanner;
/**
 * 
 */

/**
 * @author User
 *
 */
public class EquilateralTriangle extends Triangle{

	//private double side;

	public EquilateralTriangle(double side) {
		// TODO Auto-generated constructor stub
		super(side);
		//this.side = side; // -this- is outside
	}

	public double getPerimeter() {
		return 3*getSide();
	}
	public double getArea() {
		return Math.sqrt(3) / 4 * getSide() * getSide();
	}

}
