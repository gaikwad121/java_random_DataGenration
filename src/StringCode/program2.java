package StringCode;

public class program2 {

	static void palindromeString(String str) {
		char ch[]=str.toCharArray();
		String temp=str;
		String rev="";
for(int i=ch.length-1;i>=0;i--)	{
	rev=rev+ch[i];
}
System.out.println(rev);
	}
}
