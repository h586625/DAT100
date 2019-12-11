
public class Oppgave1 {

	public static void main(String[] args) {
		// a)
		int a = 11;
		int b = 3;
		System.out.println(a*b); // 33
		System.out.println(a/b); // 3
		System.out.println(a%b); // 2
		System.out.println(a != b); // true
		
		// b)
		int tall = 16;
		if (tall > 0 || tall < 10) {
			System.out.println("Eple");
		}
		if(tall > 0 && tall < 10) {
			System.out.println("Banan");
		}
		System.out.println(mystisk(tall));
		// Eple
		// 21 (feil, var sløv) 8
		
		// c)
		System.out.print(1);
		try {
			System.out.print(2);
			int x = 1 / 0;
			System.out.print(3);
		} catch (ArithmeticException e) {
			System.out.print(4);
		}
		System.out.print(5);
		//1245
	}
	
	private static int mystisk(int x) {
		int tall = 3;
		if(x > 10) {
			tall = tall + 5;
		}
		return tall;
	}

}
