/**
 * 
 */

/**
 * @author stewv
 *
 */
import java.util.ArrayList;
public class DocumentIndex extends ArrayList<IndexEntry>{	
	public ArrayList<Integer> numbers; 

	public DocumentIndex() {
		numbers = new ArrayList<Integer> (); 
	}
	public DocumentIndex(int n) {
		numbers = new ArrayList<Integer> (n); 
	}
	
	public void addWord(String word, int num) {
		 int objPlace = foundOrInserted(word);
		 IndexEntry entry = get(objPlace);
		 entry.add(num);

	}
	
	public void addAllWords(String str, int num) {
		String[] array = str.split("\\W+");
		 for(String string : array){
		     if (string.length() != 0)
		        addWord(string, num);
		     
		}
	}
	private int foundOrInserted(String word) {
		int i;
		for(i = 0; i < size(); i++) {
			int compared = word.compareToIgnoreCase(get(i).getWord());
			if (compared == 0) {
				return i;
			}
			if (compared < 0){
				break;
			}
		}
		add(i, new IndexEntry(word));
		return i;
	}
}