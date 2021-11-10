package setExamples;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercise7 {

	public static void main(String[] args) {
		
		HashSet<String>hashSet = new HashSet<>();
		
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Yellow");
		hashSet.add("Pink");
		
		System.out.println("The original HashSet : " + hashSet);
		
		String[]newArray = new String[hashSet.size()];
		hashSet.toArray(newArray);
		
		System.out.println("Array elements : " );
		for (String element : newArray) {
			System.out.println(element);
			
		}
	}

}
