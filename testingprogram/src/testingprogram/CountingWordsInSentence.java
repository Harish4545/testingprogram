package testingprogram;

import java.util.HashMap;

public class CountingWordsInSentence {
	
	public static void main(String[] args) {
		
		String str="this is is harish harish";
		
		String[] s=str.split(" ");
		
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for (int i = 0; i < s.length; i++) {
			if (hm.containsKey(s[i])) {
				int count=hm.get(s[i]);
				hm.put(s[i], count+1);
			} else {
                hm.put(s[i],1);
			}
		}
		System.out.println(hm);
	}
}
