package pkg;
// import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class ArrayLists {

	public void toStringArrayList(ArrayList<Integer>arr) {
		// this.arr=arr;
		for(int i =0; i<arr.size(); i++){
				System.out.println(arr.get(i)+ " ");
			}
	}
	
	public int getArrayListAverage(ArrayList<Integer>arr){
		// this.arr=arr;
		int sum = 0;
		for(int i =0; i<arr.size(); i++){
			sum=sum+arr.get(i);
		}
		int average= sum/arr.size();
		return average;
			
	}
	
	public int getArrayListMax(ArrayList<Integer>arr){
		// this.arr=arr;
		int max;
		for(int i =0; i<arr.size(); i++){
			for(int j=i+1; j<arr.size(); j++){
				if(arr.get(i)>arr.get(j)){
					max= arr.get(i);
				}
				else{
					max = arr.get(j);
				}
			}
		}
		return max;
	}
	public int getArrayListMin(int[]arr){
		// this.arr=arr;
		int min;
		for(int i=0; i<arr.size(); i++){
			for(int j =i+1; j<arr.size(); j++){
				if(arr.get(i)<arr.get(j)){
					min = arr.get(i);
				}
				else{
					min = arr.get(j);
				}
			}
		}
		return min;
	}
		
	

}

