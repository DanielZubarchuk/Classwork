package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Junior jordan = new Junior("Jordan", "98");
		Student joseph = new Freshie("Joseph", "Lazy");
		
		
		jillian.talk();
		
		jordan.talk();
		jordan.boastScore();
		
		((Freshie)joseph).talk();
		
	}

}
