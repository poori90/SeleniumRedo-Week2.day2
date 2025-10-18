package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//Define two input strings.
		String text1 = "stops"; 
		String text2 = "potss";
		//Check if the lengths of the two strings are equal: - If equal, continue; otherwise,
		//print "Lengths mismatch, therefore the strings are not an Anagram" and exit.
		
		if(text1.length()!=text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;
		
		}
		//Convert both the strings to character arrays
			char[] char1 = text1.toCharArray();
			char[] char2 = text2.toCharArray();
			//Sort both the character arrays
			Arrays.sort(char1);
			Arrays.sort(char2);		
	//Check if the sorted arrays are equal - If equal, print "The given strings are Anagram." 
			//- Otherwise, print "The given strings are not an Anagram."		
			
			if(Arrays.equals(char1, char2)) {
				
				System.out.println("The given strings are Anagram.");
			}
			else
				System.out.println("The given strings are not an Anagram.");
	
	}

}
