
public class Rute {
	// a)
	private Punkt[] punkter;
	
	public Rute(int n) {
		punkter = new Punkt[n];
	}
	
	// b)
	public int antall() {
		int antall = 0;
		for(Punkt pkt : punkter) {
			if(pkt != null) {
				antall++;
			}
		}
		return antall;
	}
	
	// c)
	public boolean leggTil(Punkt p) {
		for(Punkt pkt : punkter) {
			if(pkt == null) {
				pkt = p;
				return true;
			}
		}
		return false;
	}
	
	// d)
	public boolean leggTilPunkt(double breddegrad, double lengdegrad, double hoyde) {
		// GLEMTE Å GJENBRUKE leggTil()
		return leggTil(new Punkt(breddegrad, lengdegrad, hoyde));
	}
	
	// e)
	public Punkt[] komprimer() {
		int antall = antall();
		Punkt[] komprimertArr = new Punkt[antall];
		
		for(int i = 0; i<punkter.antall; i++) {
			komprimertArr[i] = punkter[i];
		}
		
		return komprimertArr;
	}
}
