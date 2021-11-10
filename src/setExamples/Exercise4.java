package setExamples;

import java.util.HashSet;

public class Exercise4 {

	public static void main(String[] args) {
		
		HashSet<String>hashSet = new HashSet<>();
		
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Yellow");
		hashSet.add("Pink");
		
		System.out.println("The original HashSet : " + hashSet);
		
		hashSet.removeAll(hashSet);
		
		System.out.println("After removal : " + hashSet);
	}

}
