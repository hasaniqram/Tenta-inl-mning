import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TentaArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> List = new ArrayList<Integer>();

		List.add(0);
		List.add(10);
		List.add(100);
		List.add(200);
		List.add(300);
		List.add(500);
		List.add(600);
		List.add(700);

		// print arrlist 
		System.out.println("List: "+ List);
		int size = List.size(); 

		// print the size of arrlist 
		System.out.println("length of list = "+ size); 
	}
}