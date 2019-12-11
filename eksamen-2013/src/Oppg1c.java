
public class Oppg1c {

	public static void main(String[] args) {
		AnnenKlasse a = new AnnenKlasse();
		AnnenKlasse b = new AnnenKlasse(2);
		System.out.println(a.regnUt()); // 1
		// regnUt() parameteret gjør ingenting mht. utregningen
		System.out.println(b.regnUt(3)); // 64
		System.out.println(b.regnUt(10)); // 64
	}
}
