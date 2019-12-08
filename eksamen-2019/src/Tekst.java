
public class Tekst extends Innlegg {
	private String tekst;
	
	public Tekst(String bruker, String dato, String tekst) {
		super(bruker, dato);
		this.tekst = tekst;
	}
	
	@Override
	public void skrivUt() {
		// This makes it possible to avoid using protected for super-class variables
		super.skrivUt();
		System.out.println("Tekst: " + tekst);
	}
}
