/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author stewv
 *
 */
public class IndexEntry {

	private String word;
	private ArrayList<Integer> numList;
	
	public IndexEntry(String aString) {
		word = aString.toUpperCase();
//		for(int i = 0; i < list.size(); i++) {
//			numList.add(list.get(i));
//		}
		numList = null; //not sure if this works
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void add(int number) {
		boolean hasNum = false;
		for(int i = 0; i < numList.size(); i++) {
			if(numList.get(i) == number) {
				hasNum = true;
			}
		}
		if (hasNum == false) {
			numList.add(number);
		}
	}
	public String getWord() {
		return word;
	}
	
	public String toString() {
		String newOutput = "";
		String output = word;
		for(int i = 0; i < numList.size(); i++) {
			output += " " + numList.get(i) + ",";
			if((numList.size()-i) <= 1) {
				newOutput = output.substring(0, output.length());
			}
		}
		return output;
	}
}
