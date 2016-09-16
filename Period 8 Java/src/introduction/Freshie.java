package introduction;

public class Freshie extends Student {
	
	String characteristic;

	public Freshie(String name, String quality) {
		super(name);
		this.characteristic = quality;
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){
		super.talk();
		System.out.println("... and I am a Freshie!");
	}

}
