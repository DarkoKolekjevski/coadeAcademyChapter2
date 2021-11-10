package setExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		
		HashSet<String>set = new HashSet<>();
		
		set.add("White");
		set.add("Black");
		set.add("Red");
		set.add("Blue");
		//Ako dodademe ista vrednost,bidejkji e set ke ja ignorira
		//a akododademe null vrednost ke ja dodade,bidejkji podrzuva null vrednost
		set.add("Blue");
		set.add(null);
		
		Iterator<String> i = set.iterator();
		
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
		}
		ArrayList<String>list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		

	}

}
