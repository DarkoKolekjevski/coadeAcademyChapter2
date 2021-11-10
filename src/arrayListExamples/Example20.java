package arrayListExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example20 {
	
	public static void main(String[] args) {
		
		
		String array[] = {"Java","PHP","C","C++"};
		
		ArrayList<String> newList = new ArrayList<>(Arrays.asList(array));
		System.out.println(newList);
	}

}
