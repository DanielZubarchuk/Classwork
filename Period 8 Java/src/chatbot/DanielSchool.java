package chatbot;

public class DanielSchool implements Chatbot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		
		inSchoolLoop = true;
		while(inSchoolLoop){
			DanielMain.print("(Type 'quit' to go back.)");
			//static call
			schoolResponse = DanielMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				DanielMain.promptForever();
			}
			DanielMain.print("That is my favorite part about school!");
		}
	}

	
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"};
		if(DanielMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(DanielMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}

}
