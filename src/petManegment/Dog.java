package PetManegment;

public class Dog {
	
	private String breed;
	private String size;
	private Integer age;
	private String color;
	
	public String getinfo() {
		
		return "Dog breed :" +breed+ "Dog size :" +size+ "Dog age :" +age+ "Dog color :" +color;
	}
	public static void main(String[] args) {
		
		Dog maltese = new Dog();
		
		maltese.age =11;
		maltese.size = "medium";
		maltese.breed = "maltese";
		maltese.color = "white";
		
		String res = maltese.getinfo();
		
		System.out.println(res);
		
		System.out.println(maltese.getinfo());	
		
		
		
	}

}
