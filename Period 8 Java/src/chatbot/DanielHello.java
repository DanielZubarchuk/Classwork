package chatbot;

public class DanielHello implements Chatbot{

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = 
		{"We aready said Hello.Lets move the conversation along.",
				"You said hello already. Did you forget?"};
	
	private String[] angryResponses = 
		{"Okay seriously, stop saying hello",
				"What is wrong with you and saying hello?"};
	
	private int helloCount;
	
	public DanielHello(){
		helloCount = 0;
	}
	
	
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = DanielMain.promptInput();
			//negate use - !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				DanielMain.promptForever();
				
			}
		}
		
	}

	private void printResponse() {
		if(helloCount > 4){
			int responseSelection = (int)(Math.random()*angryResponses.length);
			DanielMain.print(angryResponses[responseSelection]);
		}
		else{
			int responseSelection = (int)(Math.random()*calmResponses.length);
			DanielMain.print(calmResponses[responseSelection]);
		}
		
	}



	public boolean isTriggered(String userInput) {
		if(DanielMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		if(DanielMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(DanielMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		return false;
		
		
	}

}
