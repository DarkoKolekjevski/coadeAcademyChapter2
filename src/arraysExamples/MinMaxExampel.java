package arraysExamples;

public class MinMaxExampel {

	public static void main(String[] args) {

		Integer niza[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29,149};
		minMax(niza);

	}

	public static void minMax(Integer minMax[]) {

		Integer max = minMax[0];
		Integer min = minMax[0];
		Integer size = minMax.length;

		for (int i = 1; i < minMax.length - 1; i = i + 2) {

			if ((i + 1) == size) {

				if (minMax[i] > max) {
					max = minMax[i];
				}
				if (minMax[i] < min) {
					min = minMax[i];
				}
				
			} else {
				
				if (minMax[i] > minMax[i + 1]) {

					if (minMax[i] > max) {
						max = minMax[i];
					}
					if (minMax[i + 1] < min) {
						min = minMax[i + 1];
					}
				}

				if (minMax[i] < minMax[i + 1]) {

					if (minMax[i] < min) {
						min = minMax[i];
					}
					if (minMax[i + 1] > max) {
						max = minMax[i + 1];
					}
				}

			}
			System.out.println("Minimumot vo nizata e :" + min);
			System.out.println("Naxsimumot vo nizata e :" + max);
		}

	}
}
