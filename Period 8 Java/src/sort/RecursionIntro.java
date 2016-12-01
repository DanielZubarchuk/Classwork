package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		
		int n = 100;
		System.out.println("The "+n+"th fibonacci is "+fibonacci(n));
		
		//hanoiSolution(3, "A", "B", "C");
		/*
		System.out.println("Using a for loop");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello World x"+i);
		}
		
		System.out.println("Without using a for loop");
		forLoop(5, new Action(){

			private int value = 0;
			
			public void act() {
				System.out.println("Hello World x"+value);
				value++;
			}
			
		});
		*/
		
	}

	private static int fibonacci(int n) {
		if(n <= 1){
			return 1;
		}else{
			int previous = fibonacci(n-1);
			System.out.println("Before we find fibonacci "+n+" we need to find fibonacci"+(n-1)+", which is "+previous);
			int beforePrevious = fibonacci(n-2);
			return previous + beforePrevious;
		}
		
	}

	private static int factorial(int x){
		System.out.println("Using a for loop(factorial)");
		int factorial = 1;
		for(int j = x; j > 0; j--){
			factorial = factorial * j;
		}
			return factorial;
		
		/*System.out.println("Without using a for loop");
		if(x > 1){
			return x*factorial(x-1);
		}
		return 1; 
		*/
	}

	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		if(numberOfDiscs <= 1){
			System.out.println("Move "+startPeg+" to "+endPeg);
		}else{
			System.out.println("In order to move "+numberOfDiscs+" over to peg "+endPeg+" we must move"+(numberOfDiscs - 1)+"over to peg "+midPeg+" first.");
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
	
	private static void forLoop(int i, Action action) {
		if(i <= 0){
			// base case
			return;
		}else{
			//standard action
			action.act();
			//recursion call
			forLoop(i-1, action);
		}
		
	}
	
	

}
