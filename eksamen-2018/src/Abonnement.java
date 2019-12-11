
abstract class Abonnement {
	private String navn;
	private int f�dselsnummer;
	private int telefonnummer;
	private double minuttpris;
	
	public Abonnement(String navn, int f�dselsnummer, int telefonnummer, double minuttpris) {
		this.navn = navn;
		this.f�dselsnummer = f�dselsnummer;
		this.telefonnummer = telefonnummer;
		this.minuttpris = minuttpris;
	}
	
	public String getNavn() {
		return this.navn;
	}
	
	public void setNavn(String n) {
		this.navn = n;
	}
	
	public int getF�dselsnummer() {
		return this.f�dselsnummer;
	}
	
	public void setF�dselsnummer(int f) {
		this.f�dselsnummer = f;
	}
	
	public int getTelefonnummer() {
		return this.telefonnummer;
	}
	
	public void setTelefonnummer(int t) {
		this.telefonnummer = t;
	}
	
	public double getMinuttpris() {
		return this.minuttpris;
	}
	
	public void setMinuttpris(double m) {
		this.minuttpris = m;
	}
	
	abstract double pris(int tlfnummer, int samtalelengde);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
