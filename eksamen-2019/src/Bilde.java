
public class Bilde extends Innlegg {
	private String url;
	
	public Bilde(String bruker, String dato, String url) {
		super(bruker, dato);
		this.url = url;
	}
	
	@Override
	public void skrivUt() {
		// This makes it possible to avoid using protected for super-class variables
		super.skrivUt();
		System.out.println("URL: " + url);
	}
}
