package arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise11 {

	public static void main(String[] args) {
		
		ArrayList<String>colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("White");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		
		System.out.println("Original list : " + colors);
		
		Collections.sort(colors);
		System.out.println("Sort list : " + colors);
		
		Collections.reverse(colors);
		System.out.println("Reverse List : " + colors);
	}

}
