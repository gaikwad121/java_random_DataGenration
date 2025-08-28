package StringCode;

public class program1 {

	static void countVowels(String name) {
		char ch[]=name.toCharArray();
		int count=0;
	for(int i=0;i<ch.length;i++) {
		char c=ch[i]; 
	if(c=='A' || c=='I' || c=='O' || c=='U' || c=='E' || c=='a' || c=='i' || c=='e' || c=='o' || c=='u') {
		count++;
	}
	}
	System.out.println(count);
	}
		}
	

