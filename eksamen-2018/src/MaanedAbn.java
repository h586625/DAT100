
public class MaanedAbn extends Abonnement {
	private Abonnement[] gratis;
	
	public MaanedAbn(String navn, int fødselsnummer, int telefonnummer, double minuttpris, double balanse) {
		super(navn, fødselsnummer, telefonnummer, minuttpris);
		this.gratis = new Abonnement[4];
	}
	
	@Override
	double pris(int tlfnummer, int samtalelengde) {
		for(Abonnement nr : gratis) {
			if(tlfnummer == nr.getTelefonnummer()) {
				return 0;
			}
		}
		return super.getMinuttpris() * samtalelengde;
	}

}
