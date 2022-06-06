import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int[]arr= new int[200];
	for(int i=0; i<arr.length; i++){
		arr[i]=((int)(Math.random()*200));
	}
	selectionSort(arr);
	
	for(int i=0; i<arr.length; i++){
		System.out.println(arr[i]);
	}
	}
	
	public static void selectionSort(int[]arr){
		int i; //outer
		int j; //inner
		int min_index;
		
		for(i =0; i<arr.length; i++){
			min_index =i;
			for(j=i+1; j<arr.length; j++){
				if(arr[j]<arr[min_index]){
					min_index=j;
				}
			}
			int x = arr[i];
			arr[i] =arr[min_index];
			arr[min_index] = x;
		}
	}
}
