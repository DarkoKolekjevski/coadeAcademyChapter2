package arrayListExamples;

import java.util.ArrayList;

public class Excercise7 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");

		// Example 1:

		System.out.println("Original array:" + colors);

		colors.contains("Red");

		System.out.println(colors.contains("Red"));

		System.out.println(ifContains(colors, "Red"));

		// Example 2:

		if (colors.contains("Red")) {
			System.out.println("We found the color");
		} else {
			System.out.println("Color don't exsist");
		}

		// Example 3: with method,and cooling that method in main method

		String result = ifContains(colors, "Red");
		System.out.println(result);
		System.out.println(ifContains(colors, "Red"));
	}

	public static String ifContains(ArrayList<String> list, String element) {

		if (list.isEmpty()) {
			return "List is empty";
		} else {
			for (String boja : list) {
				if (boja == element) {
					return "Color exsist in list";
				}
			}
			return "Color don't exsist";
		}
	}
}
