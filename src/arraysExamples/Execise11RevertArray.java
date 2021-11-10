package arraysExamples;

import java.util.Arrays;

public class Execise11RevertArray {
	
	public static void main(String[] args) {
		
		Integer niza[] = {1789, 2035, 1889, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456,9999};
		
		revertArray(niza);
		
	}

	private static void revertArray(Integer[] niza) {
		
		System.out.println("Originalna niza :" + Arrays.toString(niza));
		for (int i = 0; i < niza.length / 2; i++) {
			
			Integer temp = niza[i];
			System.out.println("Temp =" + temp);
			
			niza[i] = niza[niza.length - i -1];
			System.out.println("Niza[" + i +"] =" + niza[i]);

			niza[niza.length - i - 1] = temp;
			System.out.println("Niza ["+ (niza.length - i - 1) +"] =" + niza[niza.length - i - 1]);
			
			System.out.println(Arrays.toString(niza));

			
		}
	}

}
