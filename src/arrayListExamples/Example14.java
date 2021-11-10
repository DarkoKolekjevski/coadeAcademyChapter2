package arrayListExamples;

import java.util.HashSet;

public class Example14 {
	    public static void main(String[] args) {
	        
	    	String[] array1 = {"Apple", "Mango", "Orange", "Apple", "Watermelon", "Peach"};
	 
	        String[] array2 = {"Dell", "HP", "Apple", "Lenovo", "Mac", "Apple"};
	 
	        HashSet<String> set = new HashSet<String>();
	 
	        for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i].equals(array2[j]))
	                {
	                    set.add(array2[i]);
	                }
	            }
	        }
	 
	        System.out.println(set);
	    }
	}

