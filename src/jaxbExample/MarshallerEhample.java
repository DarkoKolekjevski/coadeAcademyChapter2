package jaxbExample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallerEhample {

	public static void main(String[] args) { 
		
		
		try {
			JAXBContext context = JAXBContext.newInstance(Fruits.class); //Fruit.class);
			//context = JAXBContextFactory.class.c
			Marshaller jaxbMarshaler = context.createMarshaller();
			jaxbMarshaler.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			
			Fruit fruit = new Fruit();
			fruit.setId(1);
			fruit.setName("Banana");
			fruit.setPrice("50mkd");
			
			
			Fruit fruit2 = new Fruit();
			fruit2.setId(2);
			fruit2.setName("Orange");
			fruit2.setPrice("60mkd");
			
//			List<Fruit>list = new ArrayList<>();
//			list.add(fruit);
//			list.add(fruit2);
			Fruit fruit3 = new Fruit();
			fruit3.setId(3);
			fruit3.setName("Watermelon");
			fruit3.setPrice("60mkd");

			Fruit fruit4 = new Fruit();
			fruit4.setId(4);
			fruit4.setName("Mango");
			fruit4.setPrice("60mkd");
			
			Fruits fruits = new Fruits();
			
			fruits.getFruits().add(fruit);
			fruits.getFruits().add(fruit2);
			fruits.getFruits().add(fruit3);
			fruits.getFruits().add(fruit4);
			

			 
			jaxbMarshaler.marshal(fruits, new File ("C:\\Users\\User\\Documents\\fruits.xml"));//System.out);
			
		}catch(JAXBException e){
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
