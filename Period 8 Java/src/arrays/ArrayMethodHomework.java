package arrays;

public class ArrayMethodHomework {

	 private static int average;

	public static void main(String[] args) {
		    
	     /**
	      * IMPORTANT NOTE: 
	      * This homework assignment will be weighted 4x.
	      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
	      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
	      * DO NOT spend hours and hours trying to fix perfect code just because my test
	      * says that it isn't perfect!
	      * */
	    }
	 
	    public static int searchUnsorted(int[] arrayToSearch, int key){
	    /**
	     * this method take an unsorted int array (arrayToSearch) and returns an 
	     * int corresponding to the index of a key, if it is in the array
	     * if the key is not in the array, this method returns -1
	     * */
	    	for(int i = 0; i < arrayToSearch.length; i++ ){
	    		if(arrayToSearch[i] == key){
	    			return i;
	    		}
	 		}
	     return -1;
	    }
	    
	    public static int searchSorted(int[] sortedArrayToSearch, int key){
	    /**
	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
	     * if the key is not in the array
	     * 
	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
	     * */
	    	for(int i = sortedArrayToSearch.length - 1; i > -1; i-- ){
	    		if(sortedArrayToSearch[i] == key){
	    			return i;
	    		}
	 			
	 		}
	     return -1;
	    }
	    
	    public static boolean isSorted(int[] array){
	        /**
	         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
	         * */
	    	 for(int i = 0; i < array.length - 1; i++){
	    		 if (array[i] < array[i+1]){
	    			 return false;
	    		 }
	    	 }
			return true;
	    } 
	    
	    
	    public static double[] getStats(double[] array){
	        /** 
	         * This method return a double[] contain a WHOLE BUNCH of stats
	         * The double array must keep the following stats about the array parameter:
	         * index 0 = the mean
	         * index 1 = the max
	         * index 2 = the min
	         * index 3 = the median
	         * index 4 = the number of values greater than or equal to the mean
	         * index 5 = the number of values below the mean
	         * */
	    	 
	         double[] stats = new double[6];
	         sortArray(array);
	         
	         stats[0] = getMean(array);
	         stats[1] = array[];
	         stats[2] = array[0];
	         stats[3] = getMedian(array);
	         stats[4] = getValuesGreater(array);
	         stats[5] = getValuesLess(array);
	         return stats;
	    }
	   
		private static Object sortArray(double[] array) {
			Object sortedArray = null;
			return sortedArray;
		}

		private static double getMean(double[] array){
			double average = 0;
	    	for(int i = 0; i < array.length; i++){
	    		average = average + array[i];
	    	}
	    	
			double mean = average / array.length;
			
			return mean;
	    }
		
		private static double getMedian(double[] array) {
			int middle = 0;
			
			return median;
		}
		
		private static double getValuesLess(double[] array) {
			// TODO Auto-generated method stub
			return 0;
		}

		private static double getValuesGreater(double[] array) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
	    
	    public static void reverseOrder(int[] array){
	        /**
	         * this method reverses the order of the array passed to it.
	         * Not that this method does not have a return type. You do not need to copy the array first
	         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
	         * in a random order, though you still need to reverse whatever order it is in
	         * 
	         * Example:
	         * array = {5, 1, 9, 10, 16, -6}
	         * after calling this method
	         * array = {-6, 16, 10, 9, 1, 5}
	         * 
	         * */
	    	for (int i = 0; i < (array.length/2); i++){
	    		int placeholder = array[i];
	    		array[i] = array[(array.length-1) - i];
	    		array[array.length-i-1] = placeholder;
	    	}
	    }
	    
	    public static int countDifferences(int[] array1, int[] array2){
	        /**Here, you will write an method that returns the number of values in two arrays 
	         * that are NOT the same (either in value OR location).
	         * The arrays ALWAYS have the same length
	         * Examples:
	         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
	         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
	         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
	         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
	         * 
	         * */
	         return 0;
	    }
	    

	    public static int longestConsecutiveSequence(int[] array1){
	        /**This method counts the longest consequtive sequence in an array.
	         * It does not matter where the sequence begins
	         * If there are no consecutive numbers, the method should return '1'
	         * 
	         * Examples:
	         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
	         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
	         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
	         * */
	        
	        return 0;
	    }

	    public static int longestSharedSequence(int[] array1, int[] array2){
	        /**This method counts the longest unbroken, shared sequence in TWO arrays.
	         * The sequence does NOT have to be a consecutive sequence
	         * It does NOT matter where the sequence begins, the arrays might not be the same length
	         * 
	         * Examples:
	         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
	         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
	         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
	         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
	         * */
	        int longest = 1;
	        boolean isSequence = false;
	        int seqLength = 0;
	        if(array1.length > array2.length){
	            for(int i = 0; i < array1.length; i++){
	                for(int j = 0; j < array2.length; j++){
	                    if(array1[i] == array2[j]){
	                        isSequence = true;
	                    }else{
	                        isSequence = false;  
	                    }
	                    if(isSequence){
	                        seqLength ++;
	                        i++;
	                    }else if(seqLength > longest){
	                        longest = seqLength;
	                        seqLength = 0;
	                    }else{
	                        seqLength = 0;
	                    }
	                }
	            }
	        }else{
	            for(int i = 0; i < array2.length; i++){
	                for(int j = 0; j < array1.length; j++){
	                    if(array2[i] == array1[j]){
	                        isSequence = true;
	                    }else{
	                        isSequence = false;  
	                    }
	                    if(isSequence){
	                        seqLength ++;
	                        i++;
	                    }else if(seqLength > longest){
	                        longest = seqLength;
	                        seqLength = 0;
	                    }else{
	                        seqLength = 0;
	                    }
	                }
	            }
	        }
	        if(seqLength > longest){
	            return seqLength;
	        }else{
	            return longest;
	        }
	        
	    }

	    public static int[] generateDistinctItemsList(int n){
	        /**
	         * This method needs to generate an int[] of length n that contains distinct, random integers
	         * between 1 and 2n 
	         * The method will be tested by verifying that the array you return is n items long,
	         * contains only entries between 1 and 2n (inclusive) and has no duplicates
	         * 
	         * */
	        int[] arr = new int[n];
	        int rng;
	        for(int i = 0; i < arr.length; i++){
	            boolean original = false;
	            do{
	                rng = (int)(Math.random()*(2*n))+1;
	                original = true;
	                for(int j = 0; j < arr.length; j++){
	                    if(rng == arr[j]){
	                        original = false;
	                    }
	                }
	            }while(!original);
	            arr[i] = rng;
	        }
	        return arr; 
	    }
	    
	    public static void cycleThrough(int[] array, int n){
	        /** This problem represents people moving through a line.
	         * Once they get to the front of the line, they get what they've been waiting for, then they 
	         * immediately go to the end of the line and "cycle through" again.
	         * 
	         * This method reorders the array so that it represents what the array would look like
	         * after it had been cycled through an n number of times.
	         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
	         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
	         * 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
	         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
	         * 
	         * Likewise,
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
	         * and the most interesting case, 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
	         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
	         * was able to go through one more time than anyone else
	         * 
	         * CHALLENGE
	         * For extra credit, make your method handle NEGATIVE n
	         * */
	         int temp;
	         for(int i = 0; i < n; i++){
	             temp = array[0];
	             for(int j = 1; j < array.length; j++){
	                 array[j-1] = array[j];
	             }
	             array[array.length-1] = temp;
	         }
	    }

}
