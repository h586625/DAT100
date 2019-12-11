
public class GPSBeregninger {
	public double hoyestepunkt(Rute rute) {
		Punkt[] punkter = rute.komprimer();
		double hoyestepkt = 0.0;
		for(Punkt pkt : r) {
			if(hoyestepkt < pkt.getHoyde()) {
				hoyestepkt = pkt.getHoyde();
				// kunne også brukt Double.max()
			}
		}
		return hoyestepkt;
	}
	
	public double lengde(Rute rute) {
		Punkt[] punkter = rute.komprimer();
		double l = 0;
		for(int i = 0; i < punkter.length-1; i++) {
			l += avstand(punkter[i], punkter[i+1]);
		}
		return l;
	}
	
	public Rute korteste(Rute rute1, Rute rute2) {
		if(lengde(rute1) < lengde(rute2)) {
			return rute1;
		} else {
			return rute2;
		}
	}
}

