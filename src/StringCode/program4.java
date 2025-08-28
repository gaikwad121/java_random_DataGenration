package StringCode;

public class program4 {

	static void splitAndJoin(String str) {
		String s[]=str.split(" ");
		for(String words:s) {
		System.out.println(words);
		}
		String joined = String.join("-", s);
		System.out.println(joined); // I-love-Java	}
}}
