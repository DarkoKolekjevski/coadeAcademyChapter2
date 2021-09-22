package nizi;

public class NiziExample3 {
	
	public static void passByreferrence(String niza[]) {
		
		niza[0]="changed";
	}
	
	public static void main (String[] args) {
		
		String fruits[] = {"Apple","Mango","Orange"};
		
		System.out.println("Pred da ja povikame funkcijata:" +fruits[0]);
		
		passByreferrence(fruits);
		
		System.out.println("Otkako da ja povikame funkcijata:" +fruits[0]);
	}

}
