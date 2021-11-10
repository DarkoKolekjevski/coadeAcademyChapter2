package conditionsLoops;

public class SwichCaseExample {

	public static void main(String[] args) {
		
		Integer num = 3;
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
			
		case 1:
			System.out.println("One");
			break;
			
		case 2:
			System.out.println("Two");
			break;
			
		case 3:
			System.out.println("Tree");
			break;
				
		case 4:
			System.out.println("Four");
			break;
			
			default:
			System.out.println("The umber dosen't exsist");
			break;
		}
		String numbers = "two";
		
		switch (numbers) {
		case "one":
			System.out.println(1);			
			break;
			
		case "two":
			System.out.println(2);
			break;
			
		case "three":
			System.out.println(3);
			
		default:
			System.out.println("The number dosen't exsist");
			break;
		}
		
	}

}
