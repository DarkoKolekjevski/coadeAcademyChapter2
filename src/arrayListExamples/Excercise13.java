package arrayListExamples;

import java.util.ArrayList;

public class Excercise13 {

	public static void main(String[] args) {
		
		ArrayList<String>list1 = new ArrayList<>();
		
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("White");
		list1.add("Pink");
		
		System.out.println(list1);
		
		ArrayList<String>list2 = new ArrayList<>();
		
		list2.add("Red");
		list2.add("Green");
		list2.add("Purple");
		list2.add("Black");
		list2.add("Pink");
		
		System.out.println(list2);
		
		ArrayList<String>result = new ArrayList<>();
		
		for (String element : list1) {
			if(list2.contains(element)) {
				result.add("True");
			}else{
				result.add("False");
				
			}
			
			
		}
		System.out.println(result);
		
		
	}

}
