package setExamples;

import java.util.HashSet;

public class Exercise6 {

	public static void main(String[] args) {
		
		HashSet<String>hashSet = new HashSet<>();
		
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Yellow");
		hashSet.add("Pink");
		
		System.out.println("Original HashSet list : " + hashSet);
		
		HashSet<String>newHashSet = new HashSet<>();
		
		newHashSet = (HashSet) hashSet.clone();
		System.out.println("Cloned HasSet list : " + newHashSet );
	}

}
