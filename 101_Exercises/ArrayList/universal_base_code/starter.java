import pkg.*;
import java.util.*;
import java.util.Random;

class starter {
	//Methods go here

	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("How many values added to the ArrayList?");
	int n = sc.nextInt();
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.addValuesArrayList(n, arr);
	arr.printArrayList(arr);
	

	}
}
