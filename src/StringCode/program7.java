package StringCode;

public class program7 {
public static void main(String[] args) {
	String s = "aabbcde";
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++) {
	boolean repeated=false;
for(int j=i+1;j<ch.length;j++) {
if(ch[i]==ch[j]) {
	repeated=true;
}
if(!repeated) {
	System.out.println(ch[i]);
	break;
}
}
}
}
}
