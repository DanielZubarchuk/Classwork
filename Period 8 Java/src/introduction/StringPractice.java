package introduction;

import java.util.Scanner;

public class StringPractice {

		static Scanner input;
		static String user;
		
	public static void main(String[] args) {
		demonstrateStringMethods();
		createFields();
		promptName();
		//promptInput();
		promptForever();
	}
	
	public static void promptName() {
		print("Enter Your Name!");
		user = input.nextLine();
		print("Glad to meet you, " +user+". For the rest of the time,I will call you, "+user+"." + "You may call me Computer.");                         
		// \n makes a new line
	}

	public static void promptForever() {
		while(true){
			promptInput();
		}
	}

	public static void promptInput() {
		print("Please Type Something, "+user+".");
		String userInput = input.nextLine();
		print("Congradulations! You Typed: " +userInput);
	}

	public static void createFields() {
		input =  new Scanner(System.in);
		user = "";
	}

	public static void demonstrateStringMethods(){
		
		String text1 = new String("Hello World");
		String text2 = "Hello World"; // same as above
		
		if(text1.equals(text2)){
			print("These Strings are Equal!");
		}
		print(text1);
		print(text1);
		
		String word1 = "Alaba";
		String word2 = "Zeeeeeben";
		
		if(word1.compareTo(word2) < 0){
			print("word 1 comes before word 2!");
		}
		
	}
	
	public static void print(String s)
	{
		String printString = "";
		int cutoff = 10;
		//check for words to add
		//IOW s had a length > 0 
		while(s.length() > 0){
			String cut = "";
			String nextWord = "";
			//check to see if the next word will fit on the line
			//there must be still words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				// add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				//identify the following word without the space
				int endOfWord = s.indexOf(" ");
				//if there are no more spaces, this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				
				nextWord = s.substring(0, endOfWord);
			}
			
			printString += cut+"\n";
			
		}
		System.out.println(printString);
		
	}
	


}
