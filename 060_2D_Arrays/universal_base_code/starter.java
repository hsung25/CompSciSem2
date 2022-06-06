import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("How many rows do you want in your array?");
	int a = sc.nextInt();
	System.out.println("How many columns do you want in your array?");
	int b = sc.nextInt();
	
	int[][]arr = new int [a][b];
	for(int i=0; i<arr.length; i++){
		for(int j=0; j<arr[0].length; j++){
			int x = Math.floor(Math.random()*9+1);
			arr[a][b] = x;
			}
	}
	
	a

		
	}
}
