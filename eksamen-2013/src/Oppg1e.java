
public class Oppg1e {

	public static void main(String[] args) {
		// It will throw the ArithmeticException
		try {
			int x = 3;
			x = x / 0;
			System.out.println(x);
		}
		catch (NullPointerException ex) {
			System.out.println("Unntak nr. 1 kastet.");
		}
		catch (ArithmeticException ex) {
			System.out.println("Unntak nr. 2 kastet.");
		}
	}
}
