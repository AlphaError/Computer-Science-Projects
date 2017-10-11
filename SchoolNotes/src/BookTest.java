/**
 * 
 */

/**
 * @author Stewart H.
 * Ver 1.0
 * 9/8/17
 *
 */
public class BookTest {

	/**
	 * 
	 */
	public BookTest(int x) {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(3); //for 3 pages
		System.out.println("You started a book with " + b.getNumPages() + " pages."); //initial statement
		
		for(int x=1; x<=3; x++) { //for 3 times prints (starting page is 0 so nextPage goes first)
			b.nextPage();//increment page
			System.out.println("You flipped to page " + b.getCurrentPage()); //print number page
		}
		System.out.println("Yay, you finished a " + b.getNumPages() + " page book!");//cuz computers are sassy

	}

}
