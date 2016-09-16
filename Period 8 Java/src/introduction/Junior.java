package introduction;

public class Junior extends Student {
	private String examScore;

	public Junior(String name, String score) {
		super(name);
		examScore = score;
		
	}

	public void talk(){
		super.talk();
		System.out.println("... and I am a Junior!");
	}
	
	public void boastScore(){
		System.out.println("My score is "+examScore);
	}
	
}
