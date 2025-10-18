package week2.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Oddindex {

	public static void main(String[] args) {


		String test = "changeme";
		//Convert the given String to a character array
		char[] chars = test.toCharArray();
		
		//Implement a loop to iterate through each character of the String (from end to start)
		for(int i=0 ; i<= chars.length;i++ ) {
			//Find the odd index within the loop
			if(i%2!=0) {
				//Inside the loop, change the character to uppercase only if the index is odd
				chars[i] = Character.toUpperCase(chars[i]);
				
			}
		
					
		}
		//Print the characters with the expected output: cHaNgEmE
		for(char c : chars) {
			
			System.out.print(c);
		}

	}

}
