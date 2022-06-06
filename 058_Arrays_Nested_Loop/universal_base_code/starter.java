import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	// int [][]arr = new int [3][3];
	int[][]arr= {{0,3,2}, {2,3,4}, {1,3,4}};
		
	for(int i=1; i<arr.length; i++){
		for(int j=1; j<arr[0].length; j++){
			System.out.println(arr[i-1][j]+arr[i][j-1]);
		}
	}
	}
}
