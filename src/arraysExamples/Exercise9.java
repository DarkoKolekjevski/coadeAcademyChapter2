package arraysExamples;

import java.util.Arrays;

public class Exercise9 {

	public static void main(String[] args) {
		
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		//Insert an element in 3rd position of the array (index->2, value_>5)
		
		int index_position = 2;
		int newValue = 5;
		
		System.out.println("Original Array :" + Arrays.toString(my_array));
		
		for (int i = my_array.length -1; i > index_position; i--) {
			my_array[i] = my_array[i-1];
			
		}
		my_array[index_position] = newValue;
		System.out.println("New Array :" + Arrays.toString(my_array));
	}

}
