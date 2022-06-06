//lab 55
import java.util.*;

class starter {
	public static void main(String args[]) {
	
	System.out.println("-----------------ORIGINAL (3 ARRAYLISTS)-----------------");
	ArrayList<Integer>arr = new ArrayList<Integer>(100);
	for(int i =0; i<arr.size(); i++){
		int a= ((int)(Math.random()*100));
		arr.set(i,a);
		System.out.print(arr.get(i) + ", ");
	}
	
	System.out.println("-----------------WITH BUBBLE-----------------");
	bubbleSort(arr);
	for(int i=0; i<arr.size(); i++){
		System.out.print(arr.get(i) + ", ");
	}
	
	System.out.println("-----------------WITH SELECTION-----------------");
	selectionSort(arr);
	for(int i=0; i<arr.size(); i++){
		System.out.print(arr.get(i) + ", ");
	}
	
	System.out.println("-----------------WITH INSERTION-----------------");
	insertionSort(arr);
	for(int i =0; i<arr.size(); i++){
		System.out.print(arr.get(i)+ ", ");
	}

	int median = arr.size()/2;
	System.out.println("The median of the ArrayList is: "+ arr.get(median));
	}

	public static void bubbleSort(ArrayList<Integer> arr){
		for(int i=0; i<arr.size()-1; i++){
			for(int j =0; j<arr.size()-i-1; j++){
				if(arr.get(j)>arr.get(j+1)){
					int x = arr.get(j+1);
					arr.add(j, x);
					//arr.get(j)=arr.get(j+1);
					//arr.get(j+1) =x;
				}
			}
		}
	}
	public static void selectionSort(ArrayList<Integer>arr){
		int i;
		int j;
		int min_index;
		
		for(i=0; i<arr.size(); i++){
			min_index=i;
			for(j=i+1; j<arr.size(); j++){
				if(arr.get(j)<arr.get(min_index)){
					min_index=j;
				}
			}
			int x = arr.get(min_index);
			arr.add(i,x);
			//arr.get(i)= arr.get(min_index);
			//arr.get(min_index) = x;
		}
	}

	public static void insertionSort(ArrayList<Integer>arr){
		int i;
		int j;
		int key;
		
		for(i=1; i<arr.size(); i++){
			key =arr.get(i);
			j=i-1;
			
			while(j>= 0 && arr.get(j)>key){
				arr.add(j+1, key); 
				j=j-1;
			}
			//arr.get(j+1)=key;
		}
	}
}
