import java.util.Scanner;

public class CylinderTest {

	private static double base; //eclipse needed me to make them static
	private static double height;
	
	public CylinderTest() {
		
	}
	
	public static double getVolume(int r, int h) {
		// TODO Auto-generated constructor stub
		base = Math.PI * Math.pow(r, 2);  //pow-a
		height = h;
		return base * height;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the radius of your cylinder: ");
		
		Scanner scan = new Scanner(System.in);
		int rad = scan.nextInt();
		System.out.println("Now please enter the height of your cylinder: ");
		int heit = scan.nextInt();
		
		System.out.println("The volume of your cylinder is " + getVolume(rad, heit) + " ...woohooo!");
	}

}
