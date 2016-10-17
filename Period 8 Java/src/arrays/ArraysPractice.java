package arrays;

public class ArraysPractice {
	
	static boolean[] boos3;

	public static void main(String[] args) {
		
		long currentTime = System.currentTimeMillis();
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		print(someStrings);
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took "+(endTime-currentTime) + " ms.");
		
	}
	
	private static void makeSpecial(String s) {
		s = "ThIS STRING IS SPECIAL";
		
	}

	private static void print(String[] s) {
		for(int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
		
	}

	private static void standardPopulate(String[] s) {
		for(int i = 0; i < s.length; i++){
			s[i] = "String #"+(i+1);
		}
		
	}

	public static void initializeArraysExample(){
		boolean[] boos1 = new boolean[3];
		//this can ONLY be done at the declaration
		//because it sets size and content
		boolean[] boos2 = {false, false, false};
		//boos3 = {false, true, true};
		// this is all that will work
		boos3 = new boolean[3];
		
		
		/**2 ways of iterating through an array
		STANDARD FOR LOOP
				-the index is important to keep track of
				-you need to customize the order
		*/
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		/**
		"FOR - EACH" LOOP
				-the index is not important
				-you do not need to customize
				-automatically assigns a "handle"
				-faster to write
		*/
		for(boolean b: boos1){
			System.out.println(b);
		}
		
		
		
		// OBJECT ARRAYS
		String[] someStrings1 = new String[3];
//		someStrings1[0] = "a";
//		someStrings1[1] = "b";
//		someStrings1[2] = "c";
		
		for(int i = 0; i < someStrings1.length; i++){
			someStrings1[i] = "a new String"; 
		}
		
		for(String s: someStrings1){
			System.out.println(s);
		}
		
	}

}
