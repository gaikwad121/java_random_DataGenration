package comRandomNumGenerator;

import java.util.Random;

public class RandomEmail {
	 public static void main(String[] args) {
	        String alphabets = "abcdefghijklmnopqrstuvwxyz";
	        Random rand = new Random();
	        StringBuilder name = new StringBuilder();

	        int length = 5 + rand.nextInt(4); // name length between 5 to 8

	        for (int i = 0; i < length; i++) {
	            char c = alphabets.charAt(rand.nextInt(alphabets.length()));
	            name.append(c);
	        }

	        // Capitalize first letter
	        String finalName = name.substring(0, 1).toUpperCase() + name.substring(1);
	        System.out.println("Random Name: " + finalName);
	        String Email=name+"@gmail.com";
	        System.out.println(Email);
	    }
	
}
