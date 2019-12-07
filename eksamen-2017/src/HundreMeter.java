
public class HundreMeter extends Resultat {
	private static final double TUSEN_POENG_MENN = 10.40;
	private static final double TUSEN_POENG_KVINNER = 11.6;
	private static final double POENG_PER_SEKUND = 240;
	
	public double tid;
	
	public HundreMeter(String navn, char kjønn, double tid) {
		// Almost forgot super()
		super(navn, kjønn);
		this.tid = tid;
	}
	
	public double getTid() {
		return tid;
	}

	public void setTid(double tid) {
		this.tid = tid;
	}
	
	public int poeng() {
		int p = 0;

		// forgot that in this case, we need to give bonus points as
		// the time gets less, not higher
		if (getKjønn() == 'M') {
			// 1000 + ((tid - 10.40) * 240)
			p = (int) (1000 + (TUSEN_POENG_MENN - tid) * POENG_PER_SEKUND);
		}
		
		if(getKjønn() == 'K') {
			p = (int) (1000 + (TUSEN_POENG_KVINNER - tid) * POENG_PER_SEKUND);
		}
		
		return p;
	}
	
	@Override
	public String toString() {
		return "Navn: " + getNavn() + ", kjønn: " + getKjønn() + ", tid: " + getTid();
	}
}
