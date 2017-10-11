import java.util.Scanner; //ug

public class CircleTest {
	
	double radius;
	
	public CircleTest() {
	}
	
	public static void main(String[] args) {
		System.out.println("Enter radius (integer): "); //prompt
		
		Scanner scan = new Scanner(System.in);
		double circle = scan.nextDouble(); //next double/int...?
		getRadius(circle);
		// Circle c = new Circle(radius, height);
		System.out.println("Your area is " + getArea(circle) + " ...yay!"); //output
	}

	public void Circle (double r) {
		//...
	}
	public static double getArea (double r) {
		double area = Math.pow(r, 2) * Math.PI; //i know I don't need the variable but it makes me feel good
		return area; //less clunky return statement
	}
	public static double getRadius (double r) {
		return r;
	}
}
