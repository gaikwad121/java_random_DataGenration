package StringCode;

public class program6 {
    public static void main(String[] args) {
        revWordInString();
    }

    static void revWordInString() {
        String s = "I love Java";
        String str[] = s.split(" ");   // split by space
        String rev = "";

        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            String revWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            rev = rev + revWord + " ";
        }

        System.out.println(rev.trim()); // remove last space
    }
}
