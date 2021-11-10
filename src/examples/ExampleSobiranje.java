package examples;

public class ExampleSobiranje {

	public static void main(String[] args) {
		
		Integer a = 5;
		Integer b = 6;
		Integer c = 12;
		
		Integer result = 0;
		Integer res = 0;
		
		result = sobiranje(a,b,c);
		System.out.println(result);
		
		res = odzemanje(c,b,a);
		System.out.println(res);
		
	}
	public static Integer sobiranje(Integer x,Integer y,Integer z) {
		return x+y+z;
	}
	public static Integer odzemanje(Integer x,Integer y,Integer z) {
		return x-y-z;
	}


}
