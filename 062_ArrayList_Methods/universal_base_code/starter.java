import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("How many values in the array?");
	int a = sc.nextInt();
	ArrayList <Integer> arr = new ArrayList<Integer>(one);
	for(int i=0; i<arr.size(); i++){
		int b = 1+ (int)(Math.random()*100);
		arr.set(i,b);
	}
	arr.toStringArrayList();
	arr.getArrayListMax();
	arr.getArrayListMin();
	arr.getArrayListAverage();
		
	}
}
