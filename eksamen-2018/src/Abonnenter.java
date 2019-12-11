import java.util.HashMap;

public class Abonnenter {
	private HashMap<Integer, Abonnement> abonnenter;
	
	public Abonnenter() {
		abonnenter = new HashMap<Integer, Abonnement>();
	}
	
	public double finnPris(int tlfnr1, int tlfnr2, int lengde) {
		Abonnement abonnent1 = abonnenter.get(tlfnr1);
		Abonnement abonnent2 = abonnenter.get(tlfnr2);
		
		if(abonnent1 != null && abonnent2 != null) {
			return abonnent1.pris(tlfnr2, lengde);
		} else {
			return 0.0;
		}
	}
}
