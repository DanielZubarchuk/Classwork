package introduction;

public class RandomCardDraw {

	public static void main(String[] args) {
		String[]ranks = {"A Two","A Three","A Four","A Five","A Six","A Seven","A Eight","A Nine","A Ten","A Jack","A Queen","A King","An Ace"};
		String[]suits = {"Diamonds","Spades","Clubs","Hearts"};
		int rank = (int) (Math.random()*ranks.length);
		int suit = (int) (Math.random()*suits.length);
		
		System.out.println(ranks[rank]+" Of "+suits[suit]);	

	
	}
	
	

}
