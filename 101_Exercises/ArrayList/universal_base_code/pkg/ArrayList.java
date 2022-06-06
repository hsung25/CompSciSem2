package pkg;
import java.util.Scanner;
import java.util.Random;


public class ArrayMethods {

	public static void printArrayList(ArrayList<Integer> arr){
		this.arr=arr;
		for(int x =0; x<arr.size(); x++){
				System.out.println(arr.get(x)+ " ");
			}
	}
	
	public static void addValuesArrayList(int n, ArrayList<Integer> arr){
		int n;
		this.arr= arr;
		this.n=n;
		for(int x=0; x<arr.size(); x++){
			int n = 1+Math.floor(Math.random()*100);
			arr.add(x,n);
	}
}

