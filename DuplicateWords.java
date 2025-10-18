package week2.day2;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;

public class DuplicateWords {

	
	public static void main(String[] args) {
		//Initialize a variable ‘count’ to keep track of the number of duplicate words found
		int count=0;
		
		String text = "We learn Java basics as part of java sessions in java week1";
		//Split the text into an array of words using space as the delimiter
		String[] text1= text.split(" ");
		
		//Create two nested for loops to compare each word with every other word in the String array.
		for(int i=0; i<text1.length;i++) {
			
			for(int j= i+1 ;j < text1.length; j++) {
				//f a duplicate word is found, it is replaced with an empty string and the count is incremented.
				if(text1[i].equalsIgnoreCase(text1[j]) && !text1[i].equals("")) {
					//After comparing all words, if the count is greater than 1 (indicating at least one duplicate was found), 
					//it prints the modified words array where duplicates have been replaced with empty strings.
					text1[j]="";
					count++;
				}
				
			}
			
		}
		
			for(String newtext :text1) {
				if(!newtext.equals("")) {
					System.out.print(newtext+" ");
				}
			}
	
	}
}
