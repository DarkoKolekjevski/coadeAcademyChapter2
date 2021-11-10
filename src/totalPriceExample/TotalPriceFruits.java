package totalPriceExample;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxbExample.Fruit;
import jaxbExample.Fruits;

public class TotalPriceFruits {

	public static void main(String[] args) {

		System.out.println("Total Price : " + totalPrice("C:\\Users\\User\\Documents\\fruits.xml"));
	}

	private static Integer totalPrice(String filepath) {

		File file = new File(filepath);
		Fruits f = new Fruits();
		Integer totalPrice = 0;

		try {
			JAXBContext context = JAXBContext.newInstance(Fruits.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			f = (Fruits) unmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Fruit fruit : f.getFruits()) {
			Integer price = 0;
			if (fruit.getPrice().endsWith("mkd")) {

				Integer x = getPriceAsInt(fruit.getPrice());
				totalPrice = totalPrice + x;
			}
		}
		return totalPrice;
	}
	public static Integer getPriceAsInt(String priceWithMkd) {
		
		char[] listFromString = priceWithMkd.toCharArray();
		Integer lentgh = listFromString.length;
		String value = priceWithMkd.substring(0, lentgh - 3);

		Integer x = Integer.parseInt(value);
		return x;
		
		
	}
	

}
