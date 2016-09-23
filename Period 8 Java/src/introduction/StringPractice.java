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
	
	public static void print(String s){
		 String printString = "";
		 int cutoff = 25;
		 //this while loop last as long as there are words left in the original String
		 while(s.length() > 0){

			 String currentCut = "";
			 String nextWord = "";
	
			 //while the current cut is still less than the line length 
			 //AND there are still words left to add
			 while(currentCut.length()+nextWord.length() < cutoff && s.length() > 0){
	
				 //add the next word
				 currentCut += nextWord;
				 
				 //remove the word that was added from the original String
				 s = s.substring(nextWord.length());
				 
				 //identify the following word, exclude the space
				 int endOfWord = s.indexOf(" ");
		
				 //if there are no more spaces, this is the last word, so add the whole thing
				 if(endOfWord == -1) {
					 endOfWord = s.length()-1;//subtract 1 because index of last letter is one les than length
				 }
	
				 //the next word should include the space
				 nextWord = s.substring(0,endOfWord+1);
			 }
	
			 	printString +=currentCut+"\n";
	
			 }
			 	System.out.print(printString);
	 }
	


}
