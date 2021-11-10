package arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise10 {

	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		
		System.out.println("Original arrays: "+  numbers);
		
		Collections.shuffle(numbers);
		
		
		System.out.println("Modifaed array: " + numbers);
	}

}
