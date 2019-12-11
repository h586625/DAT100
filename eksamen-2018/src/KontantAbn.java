
public class KontantAbn extends Abonnement {
	private double balanse;
	
	public KontantAbn(String navn, int f�dselsnummer, int telefonnummer, double minuttpris, double balanse) {
		super(navn, f�dselsnummer, telefonnummer, minuttpris);
		this.balanse = balanse;
	}
	
	@Override
	public double pris(int tlfnummer, int samtalelengde) {
		return super.getMinuttpris() * samtalelengde;
	}
}
