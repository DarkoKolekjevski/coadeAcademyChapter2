package filesOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TexstFileToJava {

	public static void main(String[] args) throws IOException {

		String filePath = "resources/data.txt";

		HashMap<String, String> result = new HashMap<String, String>();

		BufferedReader br = null;

		File file = new File(filePath);
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				String[] elements = line.split("=");
				result.put(elements[0], elements[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Map = " + result);

		User u = new User();
		u.setName(result.get("name"));
		u.setSurname(result.get("Surname"));
//		u.setAddress(result.get("address"));
		u.setPhone(result.get("phone"));
		u.setEmail(result.get("email"));

		System.out.println(u.toString());
		HashMap<String, String> map = txtToMap(filePath);
		System.out.println(map);
		
		Set<String>keys = map.keySet();
		
		Address addressOfFile = new Address();
		addressOfFile.setCity(map.get("address.city"));
		addressOfFile.setNumber(Integer.parseInt(map.get("address.number")));
		addressOfFile.setStreet(map.get("address.street"));
		
		//Address object
        //Address addr2 = new Address("Skopje", 62, "Partizanska");
		
		//Address of object with values from file
		//User user2 = new User("Darko", "Kolekjevski", "079123456", addressOfFile, "mail@mail");
		//user2.getAddress().getNumber();
		
		ArrayList<Address>addresses = new ArrayList<>();
		
		Address doma = new Address("Skopje", 15, "Ilindenska");
		Address rabota = new Address("Skopje", 23, "Partizanska");
		
		User martin = new User();
		
		martin.setName("Martin");
		martin.setSurname("Tasevski");
		martin.setPhone("123456");
		martin.setEmail("mail@mail");
		martin.setListOfAddress(addresses);
		
		//Get first address from martin object
		//Address addr = martin.getListOfAddress().get(0);
	}

	public static HashMap<String, String> txtToMap(String filePath) throws IOException {
		
		HashMap<String, String> result = new HashMap<String, String>();
		BufferedReader br = null;
		File file = new File(filePath);
		br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while ((line = br.readLine()) != null) {
			String[] elements = line.split("=");
			result.put(elements[0], elements[1]);
		}
		return result;

	}
}
