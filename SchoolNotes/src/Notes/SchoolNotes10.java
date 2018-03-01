/**
 * 
 */
package Notes;

/**
 * @author User
 *
 */
public class SchoolNotes10 {

	/**
	 * 
	 */
	public SchoolNotes10() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* Searching & Sorting
	 * learn 3 ways to compare objects in Java
	 * learn the following algorithms
	 * * Sequential & Binary Search
	 * * Selection Sort & Insert Sort
	 * * Mergesort & Quicksort
	 * * get a feel for the big-O of different algorithms
	 * * * but we're not getting into this concept formally
	 */
	
	/* Comparing Objects
 * boolean result => obj1.equals(obj2);
	 * * boolean method from class Object
	 public boolean equals(Object other){
	 ...
	 }
	 * * Object's equals*( is not useful - because the only think compared is it's address (where it is being held in memory)
	 * * * method is usually overrided in another class
	 * * equals is called polymorphically from library methods such as: ArrayList's contains()/indexOf()
	 * * properly defined in: String(with .equalsIgnoreCase()), Integer, Double, etc.

 * int diff = obj1.compareTo(obj2);
	 * * an abstract method created in the java.util.Comparable<T> interface
	 public int compareTo(Type(of parameter) others) {}
	 * * returns a positive int if obj1 is "greater than" obj2
	 * * returns a negative int if obj1 is "less than" obj2
	 * * returns 0 if they are equal
	 * * * this example makes it kind of like obj1-obj2 (in lexographical value)
	 * * similarity to .equals -->> a.equals(b) if and only if a.compareTo(b) == 0
	 * * compareTo is called polymorphically from library method, such as: Arrays.binarySearch(Object[] arr),
	 * * Objects that implement Comparable interface, are called "comparable"
	 * Strings, Integers, Doubles are comparable
	 * * for Strings (and characters), compared using lexigraphical order on the ASCII Unicode (table)
	 * * * capital letters are before lowercase and therefore lower in value, letters are before numbers so also lower in value
	 * * * example "cat".compareTo("cog") --> negative value cuz "a" is before "o"

 * int diff = c.compare(obj1, obj2); //not needed on the AP but useful, 
	 * * an abstract method defined in the java.util.Comparactor<T> interface (compare to is from the Comparable<T> interface)
	 * * * returns a posative integer if obj 1 is "greater than" or a negative int if it's "less than" or 0 if it's equal
	 * * * * like (obj1 - obj2)
	 */
//	public class PetComparatorByName implements Comparator<Pet> {
//		...
//		public int compare(Pet pet1, Pet pet2) {
//			return pet1.getName().compareTo(pet2.getName());
//		}
//	}
	/*
	 * * compare is called from library methods such as: 
	 * Arrays.sort(T[] arr, Comparator<T> c) --> T = type
	 */
	
	/* Sequential Search
	 * * Scan the list comparing the target value of each element
	 *
	public int sequentialSearch(Object []arr, Object target) {
		for(int i = 0; i < arr.length; i++) {
			if(target.equals(arr[i])) {
				return i; //like index of for arrays (aka == for primitive data types)
			}
		}
		return -1;
	}
	* * average number of comparisons(assuming the target is in the array), randomly chosen) is about n/2 (where n is arr.length)
	* * Worst = n, Best = 1
	* * Also n comparisons is needed to establish that the target is not in the array
	* * * This search is O(n) (order of n) algorithms ///////////////////////////
	* * * O notation --> get rid of any constants, put to power (this case 1/2)
	Binary Search
	* * the elements of this list must be arranged in ascending (or descending) order
	* * the target value is always compared with the middle element of the remaining search range
	* * * Ex: list of 6 elements, checks element 3, then goes right and checks element 5, then goes left and finds Eve at 4
	* * * * after each check, the desired obj is compared with the Lex value, choose the closest value to the desire obj
	* 
	*/
	//Recursive Implementation:
		public int binarySearch(int[] arr, int value, int left, int right){
			if(right < left)
				return -1; //not found
			int middle == left+right)/2;
			if(value == arr[middle])
				return middle;
			else if(value < arr[middle])
				return binarySearch(arr, value, left, middle-1);
			else
				return binarySearch(arr, value, middle+1, right);
		}
	//Iterative Implimentation
		public int binarySearch(int[] arr, int value, int left, int right) {
			while(left <= right) {
				int middle = (left + right)/2;
				if(value == arr[middle])
					return middle;
				else if(value < arr[middle])
					right = middle-1;
				else //if(value > arr[middle]
					left = middle+1;
				return -1;
			}
		}
	/* More Binary Search
	 * * binary searching is a "divide and conquer" algorithm
	 * * works very fast (for 1million elements, 20 average searches ~ aka log2 of 10^6)
	 * * its an O(log2 of n) algorithm /////////////////////////
	 */
	
}
