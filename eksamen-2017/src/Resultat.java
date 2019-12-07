
abstract class Resultat {

	private String navn;
	private char kjønn;

	public Resultat(String navn, char kjønn) {
		this.navn = navn;
		this.kjønn = kjønn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public char getKjønn() {
		return kjønn;
	}

	public void setKjønn(char kjønn) {
		this.kjønn = kjønn;
	}
	
	// forgot to use "abstract" instead of "static"
	public abstract int poeng();

	public static void main(String[] args) {
		Resultat[] resultater = new Resultat[10];
		resultater[0] = new Spyd("Chris", 'M', 100.0);
		resultater[1] = new HundreMeter("Lisa", 'K', 9.4);
		
		Resultat best = resultater[0];
		
		for(Resultat r : resultater) {
			if (r != null && (r.poeng() > best.poeng())) {
				best = r;
			}
		}
		
		System.out.println("Beste resultat: \n" + best.toString());
	}
}
