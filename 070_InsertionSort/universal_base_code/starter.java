import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int[]arr=new int[200];
	for(int i=0; i<arr.length; i++){
		arr[i]= ((int)(Math.random()*200));
	}
	insertionSort(arr);
	for(int i=0; i<arr.length; i++){
		System.out.println(arr[i]);
	}
	}
	
	public static void insertionSort(int[]arr){
		int i; //outer
		int j; //inner
		int key; 
		
		for(i=1; i<arr.length; i++){
			key =arr[i];
			j=i-1;
			
			while(j>= 0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
}
