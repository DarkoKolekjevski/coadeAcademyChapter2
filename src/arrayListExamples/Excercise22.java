package arrayListExamples;

import java.util.ArrayList;

public class Excercise22 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String>list = new ArrayList<>();
		
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("Yellow");
		list.add("Purple");
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("Index : " + i + " Value : " + list.get(i));
			
			
		}
		Integer index = 0;
		for (String string : list) {
			System.out.println("Index : " + index + " Value : " + string);
			index++;
		}
	}

}
