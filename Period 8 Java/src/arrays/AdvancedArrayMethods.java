package arrays;

public class AdvancedArrayMethods {
	
	static int[] array;
	
	public static void main(String[] args) {
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		//swap(array, 0, array.length - 1);
		shuffle(array);
		
		listPrimes(120);
	}
	
	private static void listPrimes(int limit) {
		int lastToCheck = (int)(Math.sqrt(limit));
		boolean[] numbers = new boolean[limit + 1];
		for(int i = 0; i < limit + 1; i++){
			numbers[i] = true;
			
		}
		
		numbers[0] = false;
		numbers[1] = false;
		for(int prime = 2; prime <= lastToCheck; prime++){
			if(numbers[prime]){
				System.out.println("\n"+prime+" is prime. Crossing off:");
				for(int i = (int)(Math.pow(prime, 2)); i < limit+1; i += prime){
					System.out.print(i + ", ");
					numbers[i] = false;
				}
			}
		}
		System.out.println("The Primes are:");
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index]){
				System.out.print(index + ", ");
			}
		}
		
	}

	private static void shuffle(Object[] array) {
		for(int i = 0; i < array.length; i++){
			int random = (int)(Math.random()*6);
			swap(array, i, random);
		}
		
	}

	private static void swap(Object[] arr, int a, int b) {
		Object placeholder = arr[b];
		arr[b] = arr[a];
		arr[a] = placeholder;
		
	}

	public static void arrayCopying(){
		array = new int[100];
		int[] someArray = new int[50];
		someArray = array;
		System.out.println(someArray.length);
		someArray[30] = 1;
		System.out.println(array[30]);
		
		methodA(someArray);
		
	}

	private static void methodA(int[] someArray) {
		int[] newArray = new int[someArray.length];
		
		
	}
	
	public static void copyArray(int[] original, int[] target){
		if(original.length == target.length){
			for(int i = 0; i < original.length; i++){
				target[i] = original[i];
			}
		}else{
			System.out.println("ERROR, TRIED TO COPY ARRAYS OF TWO DIFF ARRAYS!");
		}
	}

}
