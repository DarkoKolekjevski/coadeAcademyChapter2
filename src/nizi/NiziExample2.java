package nizi;

public class NiziExample2 {

	public static void main(String[] args) {
		
		Integer array[] = new Integer[10];
		
		//array = [0,1,2,3,4,5,6]
		
		for (int i = 0; i < array.length; i ++) { // i = 0 e startna tocka na ciklusot
			                                      // < array.length; se dodeka i e pomalo od dolzjinata na nizata
			                                      // i ++ faktor na progresija na ciklusot - ikrementiranje
			array[i]  = i+1;
			
			System.out.println("i=" +i);
			System.out.println("array[" + i + "]=" + array[i]);

		}
		
		array[0] = array[0] +10;
		array[1] = array[1] +10;
		
		for(int i=0; i < array.length; i++ ) {
			
			System.out.println("i =" +i);
			System.out.println("array[" + i + "]=" + array[i]);
 
			
			
		}

				
	}

}
