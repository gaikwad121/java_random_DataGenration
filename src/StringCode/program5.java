package StringCode;

import java.util.HashMap;

public class program5 {

	static void charSeq(String str) {
	// frequency occurance in string
	char[] ch=str.toCharArray();
	HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	for(char ch1:ch) {
		map.put(ch1, map.getOrDefault(ch1, 0)+1);
	}
	for(char ch3:map.keySet()) {
		System.out.print(ch3+" "+map.get(ch3)+" ");
	}
	}
	
	}

