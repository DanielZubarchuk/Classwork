package sort8;

import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
		System.out.println("- - - SELECTION SORT - - -");
		System.out.println(Arrays.toString(arrayToSort));
		selectionSort(copy(arrayToSort));
	}
	
	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
	}
	
	public static void bubbleSort(int[] array){
	    System.out.println("Bubble sort with "+Arrays.toString(array));
	    for(int i=0; i < array.length-1; i++){
	        for(int j=1; j < array.length-i; j++){
	            if(array[j-1] > array[j]){
	                swap(array,j-1,j);
	                System.out.println("becomes "+Arrays.toString(array));
	            }
	        }
	System.out.println("Ends as "+Arrays.toString(array));
	    }
	}
	
	public static int[] mergeSort(int[] array){
	    if(array.length==1)return array;
	    int half = array.length/2;//rounds down
	    int[] firstHalf = new int[half];
	    int[] secondHalf = new int[array.length - half];
	    for(int i=0; i<firstHalf.length; i++){
	        firstHalf[i]=array[i];
	    }
	    for(int i=0; i<secondHalf.length; i++){
	        secondHalf[i]=array[i+firstHalf.length];
	    }
	    return merge(mergeSort(firstHalf),mergeSort(secondHalf));
	}
	 
	public static int[] merge(int[] a, int[] b){
		return b;
	    //code not shown
	}

}