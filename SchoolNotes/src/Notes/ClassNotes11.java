/**
 * 
 */
package Notes;

/**
 * @author User
 *
 */
public class ClassNotes11 {

	/**
	 * 
	 */
	public ClassNotes11() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* Sorting
	 * * To sort means to rearrange the elements of a list in ascending or descending order
	 * * Examples of sorting applications 
	 * * * directory of files sorted by name or date
	 * * * bank check sorted by account #
	 * * * addresses in a mailing list sorted by zip code
	 * * * credit card transactions sorted by date
	 * * How fast can we sort an array of n elements?
	 * * * if we compare each elements to each other we need n(n-1)/2 comparisons(that is, n^7 by the "order of magnitude")
	 * * Faster "divide & conquer" - need approx n*log2(n) comparisons
	 * 
	 * * if we compare each element to each other we need n(n-1)/2 comparisons, (that is, n^2 by the "order of comparison")
	 * * faster "divide and conquer" sorting algorithms need approximately n*log2(n) comparisons (has written diagram notes)
	 */
	
	/* Selection Sort
	 * 1. Select the max value amongst the first n elements
	 * 2. Swap it with the nth element
	 * 3. Decrement n by 1 and repeat from step 1
	 */
	//Iterative Implimentation
	public void selectionSort(double[] arr, int n) {
		while(n > 1) {
			int maxPos = 0;
			for(int k = 1; k< n; k++) {
				if(arr[k] > arr[maxPos]) {
					maxPos = k;
				}
			}
			double temp = arr[maxPos];
			arr[maxPos] = arr[n-1];
			arr[n-1] = temp;
			n--;
		}
	}
	/* the total # of comparisons is always (n-1) + (n-2) + ... + 1 = n(n-1)/2
	 * No average, best, or worst case --> always the same
	 * * an O(n^2)
	 * 
	 * Insertion Sort:
	 * 1. k = 1; keep the first k elements in order
	 * 2. take the (k+1)th element and insert it among the first k in the right place
	 * 3. Increment k by 1; repeat from step 2(while k > n
	 */
	
	//Iterative Implimentation
	public void insertionSort(double[] arr, int n) {
		for(int k = 1; k < n; k++) {
			double temp = arr[k];
			int i = k;
			while (i > 0 && arr[i-1] > temp) {
				arr[i] = arr[i-1];
				i--;
			}
			arr[i] = temp;
		}
	}
	/*Average # of comparisons is roughly 1/2 the number of S.S.
	 * The best case is when the array is already sorted - (n-1) comparisons
	 * The worse case is n(n-1)/2 when the array is sorted in reverse
	 * On average, an O(n^2) algorithm
	 */

}
