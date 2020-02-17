import java.util.*; 

public class TentaArrayList { 
	public static void main(String args[]) 
	{ 

		// Get the ArrayList 
		ArrayList<Integer> list = new ArrayList<Integer>(); 

		// Populate the ArrayList 
		list.add(0); 
		list.add(243); 
		list.add(134); 
		list.add(211); 
		list.add(987); 

		// Print the unsorted ArrayList 
		System.out.println("Unsorted ArrayList: "+ list); 

		// Sorting ArrayList in ascending Order 
		// using Collection.sort() method 
		Collections.sort(list, Collections.reverseOrder());

		// Print the sorted ArrayList 
		System.out.println("Sorted ArrayList "+ "Large to small : "+ list); 
	} 
} 
