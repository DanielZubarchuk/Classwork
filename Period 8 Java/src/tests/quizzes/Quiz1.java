package tests.quizzes;

import java.util.Scanner;

public class Quiz1 {

	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	private static String username = "test_user";
	private static String password = "test";
	
	public static void main(String[] args) {
		if(correctUser()){
			askPassword();
		}else{
			System.out.println("Unknown username. Please contact the network administrator.");
		}
		
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		while(inLoop){
			System.out.println("Enter your Password.");
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("Congradulations!.");
				inLoop = false;
			}else{
				triesRemaining --;
				if(triesRemaining == 0){
					System.out.println("Invalid Password");
					inLoop = false;
				}else{
					System.out.println("Wrong Password! You have "+triesRemaining+ " left.");
				}
			}
		}
	}

	private static boolean correctUser() {
		System.out.println("Enter a username!");
		return waitForEntry().equals(username);
	}

}
