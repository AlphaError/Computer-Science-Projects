/**
 * 
 */

/**
 * @author User
 *
 */
public class SearchingPart1 {

	/**
	 * 
	 */
	public SearchingPart1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(mySearch(a, 0, 9, 4));
	}
	
	public static int countXs(String s) {
		int left = 0, right = s.length() - 1;
		while(left <= right) {
			int middle = (left+right)/2;
			if(s.charAt(middle) == 'O')
					right = middle-1;
			else
				left = middle+1;
		}
		return left;
	}
	
	//Part II
	public static int mySearch(int[] a, int m, int n, int target) {
		if(n < m) {
			return -1;
		}
		else if(a[m] == target) {
			return m;
		}
		else {
			mySearch(a, m+1, n, target);
			return -1;
		}
	}
	//Real Solution
	public static int search(int[] a, int m, int n, int target( ) {
		if(n < m)
			return -1;
		
		int k = (m+n)/2;
		if(a[k] == target) //if the middle index k is prime
			return k;
		
		int pos = search(a,m,k-1,target);
		if(pos >= 0) //recursion
			return pos;
		
		pos = search(a,k+1,n,target);
		return pos;
	}
}
