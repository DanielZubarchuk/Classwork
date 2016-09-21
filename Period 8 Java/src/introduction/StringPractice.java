package introduction;

public class StringPractice {

	public static void main(String[] args) {
		String text1 = new String("Hello World");
		String text2 = "Hello World"; // same as above
		
		
		if(text1.equals(text2)){
			print("These Strings are Equal!");
		}
		print(text1);
		print(text1);
		
		String word1 = "Alaba";
		String word2 = "Zeeeeeben";
		
		if(word1.compareTo(word2) < 0){
			print("word 1 comes before word 2!");
		}
	}
	
	public static void print(String s)
	{
		System.out.println(s);
	}

}
