import java.util.ArrayList;
/**
 * 
 */
import java.util.Scanner;

/**
 * @author stewv
 * -Assignment attachment for Shuffler
 */
public class LineList {
	
	ArrayList<String> text = new ArrayList<String>();
	
	public LineList() {
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				text.add("a");  //used for testing
//				text.add("b");
//				text.add("c");
//			    System.out.println(text);
//			    System.out.println(size());
//			    add("d");
//			    add("e");
//			    System.out.println(text);
//			    remove(1);
//			    System.out.println(text);
//			    add("f");
//			    move(0,1);
//			    System.out.println(text);
//			    shuffle();
//			    System.out.println(text);
	}

	public int size() {
		return text.size();
	}
	public String get(int k) {
		return text.get(k);
	}
	public void add(String line) {
		text.add(line);
	}
	public String remove(int k) {
		return text.remove(k);
	}
	public void move(int index, int newIndex) {
		String placeHold = text.remove(index); //remember that remove returns the too
		text.add(newIndex, placeHold);
	}
	
	public void shuffle() {
		ArrayList<String> newText = new ArrayList<String>();
		do { 
			int numLine = (int)(Math.random() * text.size());
			newText.add(text.get(numLine));
			text.remove(numLine);
		}while(text.size() >= 2);
		
		for(int i = 0; i < newText.size(); i++) {
			text.add(newText.get(i));
		}
	}
}
