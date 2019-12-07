
public class Spyd extends Resultat {
	private static final double TUSEN_POENG_MENN = 77.20;
	private static final double TUSEN_POENG_KVINNER = 60;
	private static final double POENG_PER_METER = 15;
	
	private double lengde;
	
	public Spyd(String navn, char kjønn, double lengde) {
		// Almost forgot super()
		super(navn, kjønn);
		this.lengde = lengde;
	}
	
	public double getLengde() {
		return lengde;
	}

	public void setLengde(double lengde) {
		this.lengde = lengde;
	}
	
	public int poeng() {
		int p = 0;
		
		// Remember to use single quotes for "char"!
		// I was so close, but gave up on the math formula
		// after being tired and frustrated, and watched the answer instead :/
		if (getKjønn() == 'M') {
			// 1000 + ((lengde - 77.20) * 15)
			p = (int) (1000 + (lengde - TUSEN_POENG_MENN) * POENG_PER_METER);
		}
		
		if(getKjønn() == 'K') {
			p = (int) (1000 + (lengde - TUSEN_POENG_KVINNER) * POENG_PER_METER);
		}
		
		return p;
	}
	
	@Override
	public String toString() {
		return "Navn: " + getNavn() + ", kjønn: " + getKjønn() + ", lengde: " + getLengde();
	}
}
