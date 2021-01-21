package lambda04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterviewQuestion03 {

	public static void main(String[] args) {

		String st="Ali, do you know Ali. Ali said you know him";
		String words[] =st.split(" ");
		System.out.println(Arrays.toString(words));
		List<String> wordList = new ArrayList<>();

		Arrays.stream(words).forEach(t->wordList.add(t.replaceAll("\\W", "")));

		System.out.println(wordList);
		HashMap<String, Integer> countMap = new HashMap<>();

		for(int i=0; i<wordList.size();i++) {
			if(countMap.containsKey(wordList.get(i))) {
				int numOfWords = countMap.get(wordList.get(i));
				countMap.put(wordList.get(i), numOfWords+1);
			}else {
				countMap.put(wordList.get(i),1);
			}
		}
		System.out.println(countMap);
	}

}
