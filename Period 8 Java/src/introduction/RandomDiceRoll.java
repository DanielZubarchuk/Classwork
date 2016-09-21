package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		
		int[] results = new int[6];
		
		// declare variable, logic test, increment
		int totalRolls = 10000;
		for(int index = 0; index < 10; index ++){
			System.out.println("Roll #"+ (index+1)+": "+rollFairDie());	
		}
		
		System.out.println("...");	
		
		for(int index = 0; index < 10; index ++){
			System.out.println("Roll #"+ (index+1)+": "+rollUnfairDie());	
		}
		
		System.out.println("...");	
		
		for(int index = 0; index < totalRolls; index ++){
			int result = rollFairDie();
			System.out.println("Roll #"+ (index+1)+": "+result);	
			results[result-1] ++;
		}
		
		for(int i = 0; i < 6; i ++){
			double percentage = ((int) ((double)1000*results[i]/totalRolls))/10.0;
			System.out.println((i+1)+" appeared " + percentage +" %.");
		}
	}

	// return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie() {
		double rand = Math.random();// returns a double (0,1)
		int roll = (int) (6*rand)+1; //[1,6]
		//int roll = (int) (6*rand); //[0,5]
		return roll;
	}
	
	public static int rollUnfairDie() {
		double rand = Math.random();
		int unfairRoll = (int) (6*rand)+1;
		if(unfairRoll == 2 || unfairRoll == 4)
		{
			unfairRoll = unfairRoll + 2;
		}
		else{
			unfairRoll = unfairRoll++;
		}
		return unfairRoll;
	}
}
