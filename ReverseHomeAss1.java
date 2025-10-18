package week2.day2;

public class ReverseHomeAss1 {

	public static void main(String[] args) {
		
		//Reverse the odd position words from a String with the input:
		
		String str = "I am a software tester";
		// Step 1: Split the words and store them in an array
		String[] str1= str.split(" ");
		// Step 2: Traverse through each word using a loop
		for(int i=0; i<str1.length;i++) {
			
		//System.out.println(str1[i]);
		if(i%2!=0) {
			// Step 4: Convert the word into a character array
            char[] chars = str1[i].toCharArray();
            // Step 5: Print the word in reverse order using another loop
            for(int j= chars.length-1;j >= 0; j--) {
				System.out.print(chars[j]);
				
			}
			
		}
		else
		{
			// Step 6: Print the even-positioned words as they are
			System.out.print(str1[i]);
			
			
		}
		// Step 7: Concatenate a space after each word
		System.out.print(" ");
		}

	}

}

