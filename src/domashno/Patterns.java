package domashno;

public class Patterns {

	public static void stars(int count) {
		for (int i = 0; i < count; i++)
			System.out.print("*");
	}

	public static void spaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	public static void main(String[] args) {

		int j = 5;

		for (int i = 0; i < j; i++) {
			stars(i);
			spaces(j - i - 1);
			spaces(j - i + 1);
			stars(2 * i);
			spaces(j - i);
			spaces(j - i - 1);
			stars(i);

			System.out.println();
		}
	}
}
