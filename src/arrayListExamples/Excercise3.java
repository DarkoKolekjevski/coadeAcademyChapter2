package arrayListExamples;

import java.util.ArrayList;

public class Excercise3 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("White");
		list.add("Black");
		list.add("Red");
		
		System.out.println("First array: " + list);
		
		list.add(0,"Blue");
		
		System.out.println("Modified list :" + list);

	}

}
