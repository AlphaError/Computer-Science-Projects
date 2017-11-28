/**
 * 
 */
package Notes;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;


/**
 * @author stewv
 *
 */
public class ClassNotes6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* Arrays: (insertion and assorting)
	 * Inserting Value
	 * * 1. |1| |1| |2| |3| (shift elements to the right starting from the last one) |8| |13| | | | |
	 * * 2. |1| |1| |2| |3| (insert value into a place) 8->| | |13| | |
	 * * 3. |1| |1| |2| |3| |5| |8| |13| | |
	 */
	public boolean insert(double[] arr, int arrLength, double value) {
		//Returns true if inserted successfully and false otherwise
		if(arrLength >= arr.length)//arrLength is the length of the array/the positions we're moving over
			return false;
		int k = arrLength - 1; //index
		while(k >= 0 && arr[k] > value) { //value is the thing your inserting
			arr[k+1] = arr[k];
			k--;
		}
		arr[k+1] = value; //at this instance k+1 is always 0
		return true;
	}
	/* Summary
	 * * How to refer to an array element in Java?
	 * * * 1-D  arr[k]
	 * * * 2-D  arr[r][c]
	 * * if the index has an invalid value: *ArrayIndexOutOfBoundsException
	 * * How do we refer to the length of an array?
	 * * * 1-D  arr.length
	 * * * 2-Dr  arr.length
	 * * * 2-Dc  arr[row].length
	 * * Can you resize an array after it has been created?
	 * * * No, you technically throw away your old array, and create a new one
	 * * *  with the same values and an extra space
	 */
	
	/* ArrayList
	 * * arrays have one limitation --> once an array is created, its size cannot change
	 */
	int someSize = (int)(Math.random() * 10);
	Object[] arr = new Object[someSize]; //Object = someDataType
//	...
	Object[] temp = new Object[2*arr.length]; //double the size
	for(int i = 0; i < arr.length; i++)
		temp[i] = arr[i];
	arr = temp;
	/* Structure:
	 * * keeps a list of values in an array
	 * * keeps track of size and capacity
	 * Capacity-- the length of the currently allocated array that holds our list values
	 * Size-- the number of elements currently stored in the array
	 * * * ArrayLists can morph to accommodate values --> if you add a value where the size is
	 * * *  greater than the capacity, it will add more to the right to fit the value in 
	 * * * * |"Ben"|, |"Ben"|, |"Ben"|, |   |, |   | --> capacity 5, size 3
	 * * AL has get and set methods that access/set the values of the i-th element respectively
	 * * * 0 < i < size
	 * must --> import java.util.ArrayList;
	 * <<interface>>, java.util.List, java.util.ArrayList/java.util.LinkList
	 * 
	 * Declaration:
	 */
	private ArrayList<String> names;
	private ArrayList<Color> colors;
	private ArrayList<Integer> seats;
	
	public ArrayList<String> fiveORLonger(ArrayList<String> words) {
		ArrayList<String> words5 = new ArrayList<String>();
		for(String word: words)
			if(word.length() >= 5)
				words5.add(word); //add = appends to the end of the arraylist
		return words5;
	}
	
//	ArrayList<Double> samples = new ArrayList<Doubles>();
//	samples add(5.0);
	ArrayList<Double> samlpes = new ArrayList<Double>(); //same thing
	samples.add(new Double(5.0));
	
	//AJ's no-args constructor (size = 0, capacity = 10)
	//AJ has a constructor that takes an int capacity as its argument
	ArrayList<String> namesTwo = new ArrayList<String>(10000);
	
//	***********************************
	int size();         //Returns the number of elements currently stored in this list
	boolean isEmpty();  //Returns True if the list is empty (false otherwise)
	boolean add(E elmt); //Appends elmt at the end of the list
	void add(int i, E elmt); //Inserts elmt into the i-th position; shifts the element currently at
		//that position & the subsequent elements to the right (increments their indicies by one)
		//checks 0 *greater-than-or-equal-to* i *greater-than-or-equal-to* list.size()
		//range the method throws IndexOutOfBounds
	get(int i);       //returns the value of the i-th element
	set(int i, E elmt);  //Replaces the i-th element with elmt and returns the old value
	remove(int i);    //Removes the i-th element from the list and return sits value; shifts the
		//subsequent elements (if any) to the left (decrements their indices by one)
	boolean contains(Object obj); //Returns true if this list contains any elements equal to obj,
		//(the equals method is useful for comparison)
	int indexOf(Object obj);  //Returns the index of the first occurence of obj in this list
		//or -1 if the obj is not found
	String toString()//Returns a string representation of the this list as [elmt0,elmt1,...elmtN-1]
	
	//u must put a wrapper class in the <> of a 
	//wrapper class (Integer) vs data type (int)
}
