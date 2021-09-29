package doctorExample;

public class Hospital {

	public static void main(String[] args) {
		
		Surgeon s = new Surgeon();
		//method fromSurgeon class
		s.getSurgeonDetails();
		//override method		
		s.getDoctorDetails();
		
		Doctor d = new Surgeon();
		d.getDoctorDetails();
		
		Doctor doc = new Doctor();
		doc.getDoctorDetails();
		
		//this will not work due private fields in Doctor class
		//doc.name = "Sam";
		
		//getter example
		doc.setName("Sam");
		
		//setter example
		System.out.println(doc.getName());
		
		//Call method with parameter
		System.out.println(doc.getinfo("Tom"));
		
		Doctor newDoc = new Doctor();
		newDoc.setName("Zan");
		newDoc.setSurname("Mitrev");
		newDoc.setSpeciality("Cardiologist");
		
		System.out.println("===================================================================================================================================");
		
		System.out.println("Doctor info: \nname:"+ newDoc.getName() + "\nsurname:" + newDoc.getSurname() + "\nspeciality:" + newDoc.getSpeciality());
		
		Doctor darko = new Doctor("Cardiologist","Darko","Koekjevski");
		
		System.out.println(darko.toString());
		
		//Arrays
		
		Doctor doktori [] = {new Doctor("Stomatolog", "Tom", "Jonhs"),new Doctor("Zan", "Mitrev"),new Doctor("Lee", "Cooper")};
		
		for (Doctor doctor : doktori) {
			System.out.println("Ime prezime:" + doctor.getName() + " " + doctor.getSurname());
			
		}
	}

}
