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

}
