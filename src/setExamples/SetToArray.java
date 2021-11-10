package setExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetToArray {

	public static void main(String[] args) {
		
		HashSet<String>colorSet = new HashSet<>();
		
		colorSet.add("White");
		colorSet.add("Black");
		colorSet.add("Blue");
		colorSet.add("Blue");
		colorSet.add("Red");
		colorSet.add("Brown");
		
		
		ArrayList<String>colorsList = new ArrayList<>();
		colorsList = set2array(colorSet);
		System.out.println(colorsList);
		
		
		HashSet<Cars>carsSet = new HashSet<>();
		
		Cars Toyota = new Cars("Corolla", 2021 , "Toyota", "White", CarType.Sedan);
		Cars vw = new Cars("T-rock", 2021, "VW","Gray", CarType.SUV);
		
		carsSet.add(vw);
		carsSet.add(Toyota);
		
		ArrayList<Cars>carList = new ArrayList<>();
		carList = setToArrayCars(carsSet);
		System.out.println(carList);
	}
	public static ArrayList<String>set2array(HashSet<String>set){
		
		ArrayList<String>result = new ArrayList<>();
		
		Iterator<String>i = set.iterator();
		
		while (i.hasNext()) {
			
			result.add(i.next());
			
		}
		return result;
		
	}
	public static ArrayList<Cars>setToArrayCars(HashSet<Cars>set) {
		
		ArrayList<Cars>res = new ArrayList<>();
		
		Iterator<Cars>j = set.iterator();
		
		while(j.hasNext()) {
			res.add(j.next());
		}
		return res;
	}

}
