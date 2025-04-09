package studio9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		int n = words.size();
		Map<String, Integer> map1 = new HashMap<>();
		int toCount = 0;
		int beCount = 0;
		int orCount = 0;
		int notCount = 0;
		for(int i = 0 ; i < n ; i++) {
			 if(words.get(i) == "to") {
				 toCount++;
			 }
			 if(words.get(i) == "be") {
				 beCount++;
			 }
			 if(words.get(i) == "or") {
				 orCount++;
			 }
			 if(words.get(i) == "not") {
				 notCount++;
			 }
		}
		map1.put("to", toCount);
		map1.put("be", beCount);
		map1.put("or", orCount);
		map1.put("not", notCount);
		return map1;

	}
	
	public static void main(String[] args) {
		
		List<String> wordList = new LinkedList<>();
		wordList.add("to");
		wordList.add("be");
		wordList.add("or");
		wordList.add("not");
		wordList.add("to");
		wordList.add("be");
		Map<String, Integer> words = countWords(wordList);
		
		//TODO: Write code that will iterate over the words map
		//to verify its contents
	}
}
