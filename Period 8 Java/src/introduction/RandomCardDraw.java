package introduction;

public class RandomCardDraw {

	public static void main(String[] args) {
		String[]ranks = {"A Two","A Three","A Four","A Five","A Six","A Seven","A Eight","A Nine","A Ten","A Jack","A Queen","A King","An Ace"};
		String[]suits = {"Diamonds","Spades","Clubs","Hearts"};
		
		for(int i = 0; index < 52; i ++){
			System.out.println("Draw #"+ (i+1)+": "+ranks[drawRandomRank()]+"Of"+suits[drawRandomSuit()]);	
		}
		

	}
	
	public static void drawRandomRank() {
		double rand = Math.random();
		int rank = (int) (12*rand); 
		return rank;
	}
	
	public static void drawRandomSuit() {
		double rand = Math.random();
		int suit = (int) (12*rand); 
		return suit;
	}

}
