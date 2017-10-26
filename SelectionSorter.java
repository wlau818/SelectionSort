import java.util.ArrayList;
import java.util.Collections;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		int num = wordList.size() - 1;
		String word = null;
		for (int i = num; i >= 0; i --) {
			for (int j = 0; j < i; j ++) {
				if (wordList.get(j).compareTo(wordList.get(j + 1)) > 0) {
					Collections.swap(wordList, j, j + 1);
				}
			}	
			for (int j = 0; j < i; j ++) {
				if (word == wordList.get(j)) {
					Collections.swap(wordList, j, i);
				}
			}
			
			
		}
		
	/*
	 * Implement selection sort on the wordList which is an ArrayList of strings
	 */
		
	}
}
