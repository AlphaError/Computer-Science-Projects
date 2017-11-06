/**
 * 
 */

/**
 * @author stewv
 *
 */
public class RotationPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {1,2,3,4,5};
		
		returnElements(rotateRight(testArray));
		System.out.println("...");
		returnElements(rotateLeft(testArray));
		System.out.println("...");
		returnElements(rotate(testArray, 2));
		System.out.println("...");
		returnElements(rotate(testArray, -2)); //test negative vals
		System.out.println("...");

	}

	public static int[] rotateRight(int[] array) {
		int[] newArray = new int[array.length];
		for(int k = array.length-1; k >= 0; k--) {
			if(k == array.length-1) {
				newArray[0] = array[k];
			}
			else {
				newArray[k+1] = array[k];
			}
		}
		return newArray;
	}
	public static int[] rotateLeft(int[] array) {
		int[] newArray = new int[array.length];
		for(int k = array.length-1; k >= 0; k--) {
			if(k == 0) {
				newArray[array.length-1] = array[k];
			}
			else {
				newArray[k-1] = array[k];
			}
		}
		return newArray;
	}
	
	public static int[] rotate(int[] a, int unknownD) {
		int d = 0;
		if(unknownD >= 0) //I'm not sure why this is needed but hey, it works
			d = unknownD+1;
		else
			d = unknownD-1;
		int[] newArray = new int[a.length];
		for(int k = 0; k <= a.length-1; k++) {
			if((k+d) >= a.length) { //moving right
				newArray[k+d - a.length] = a[k];
			}
			else if ((k+d) < 0) { //moving left
				newArray[a.length + (k+d) - 1] = a[k];
			}
			else { //normal
				newArray[k+d] = a[k];
			}
		}
		return newArray;
	}
	
	public static void returnElements(int[] array) { //because system.out.print is dumb
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
