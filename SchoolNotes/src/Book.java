/**
 * 
 */

/**
 * @author Stewart H.
 * Ver 1.0
 * 9/8/17
 * 
 */
public class Book {

	private int numPages;
	private int currentPage;
	/**
	 * 
	 */
	public Book(int x) { //initial "book" values
		// TODO Auto-generated constructor stub
		numPages = x;
		currentPage = 0;
	}
	public void nextPage() { //increases page number
		if(currentPage < numPages) {
			currentPage+= 1;
		}
	}
	
	public int getCurrentPage() { //accesor methods
		return currentPage;
	}
	public int getNumPages() {
		return numPages;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
