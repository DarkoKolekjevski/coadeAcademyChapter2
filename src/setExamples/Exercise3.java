package setExamples;

import java.util.HashSet;

public class Exercise3 {

	public static void main(String[] args) {
		
		HashSet<String>hashSet = new HashSet<>();
		
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Yellow");
		hashSet.add("Pink");
		
		System.out.println("Original HashSet : " + hashSet);
		
		System.out.println("The size of HashSet : " + hashSet.size());
	}

}
