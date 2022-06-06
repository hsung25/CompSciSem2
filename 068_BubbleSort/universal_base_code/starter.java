import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int[]arr = new int[200];
	for(int i =0; i< arr.length; i++){
		arr[i]= ((int)(Math.random()*200));
	}
	bubbleSort(arr);
	
	for(int i=0; i<arr.length; i++){
		System.out.println(arr[i]);
	}
	}
	
	public static void bubbleSort(int[]arr){
		for(int i =0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					int x = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] =x; 
			}
		}
	}
	}
	
	


		
	}

