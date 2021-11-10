package setExamples;

import java.util.HashSet;

public class Execise11 {
	
	public static void main(String[] args) {
		
		HashSet<String>hashSet1 = new HashSet<>();
		
		hashSet1.add("Red");
		hashSet1.add("Green");
		hashSet1.add("Black");
		hashSet1.add("White");
		
		System.out.println("The first HashSet : " + hashSet1);
		
		HashSet<String>hashSet2 = new HashSet<>();
		
		hashSet2.add("Red");
		hashSet2.add("Green");
		hashSet2.add("Yellow");
		hashSet2.add("Pink");
		
	    System.out.println("The second HashSet : " + hashSet2);
	    
	    hashSet1.retainAll(hashSet2);
	    
	    System.out.println("Retained : " + hashSet1);
	    
	    
	}
	

}
