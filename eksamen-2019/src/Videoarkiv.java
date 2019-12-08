
public class Videoarkiv {
	private Video[] vTab;
	private int antall;
	
	public Videoarkiv(int maksAntall) {
		vTab = new Video[maksAntall];
		antall = 0;
	}
	
	public void leggTil(Video v) {
		if(antall == vTab.length) {
			System.out.println("Det er ikke mer plass i videoarkivet.");
		} else {
			vTab[antall] = v;
			antall++;
		}
	}
	
	public int finnTotalTid() {
		int tid = 0;
		
		for(int i = 0; i<antall; i++) {
			tid += vTab[i].getSekund();
		}
		
		return tid;
	}
	
	public void listAlle(String produsent) {
		int antallForProdusent = 0;
		System.out.println("Videoer produsert av " + produsent + ":");
		for(int i = 0; i<antall; i++) {
			// forgot to use "equals" instead of "=="
			if(vTab[i].getProdusent().equals(produsent)) {
				System.out.println("-" + vTab[i].getTittel());
				antallForProdusent++;
			}
		}
		System.out.println("\nAntall videoer: " + antallForProdusent);
	}
	
	// example of deleting element in index 1:
	// example array: 1, 2, 3, 4
	// step 1: 1, 4, 3, 4
	// step 2: 1, 4, 3, null
	// step 3: antall--;
	public void slett(String tittel) {
		int funnet = -1;
		
		for(int i = 0; i<antall; i++) {
			if(vTab[i].getTittel().equals(tittel)) {
				funnet = i;
				vTab[i] = vTab[antall-1];
				vTab[antall-1] = null;
				antall--;
			}
		}
		
		if(funnet == -1) {
			System.out.println("Arkivet inneholder ingen film med tittel: " + tittel);
		}
	}
	
	void bestePar(int tidsgrense) {
		// Summen av to videoer som er så nærme tidsgrensen som mulig,
		// men som ikke overstiger den.
		// Skriv ut dersom det ikke finnes noe par med samlet tid innenfor grensen.
		
		// F.eks.
		// Tider: 14, 5, 13, 9, 8
		// Tidsgrense: 16
		// Videoene 5 og 9 passer da best.
		
		// Utskrift: <tittelNr1> og <tittelNr2> passer best.
		
		// -må teste hvert element mot alle andre
		// -dersom den nye differansen er > enn den gamle og samtidig < tidsgrense,
		//  så lagrer vi ny differanse
		// -gi feilmelding dersom ingen par treffer tidsgrensen
		
		// e.g. 0, 1, 2, 3, 4
		// 0 + 1, 0 + 2, 0 + 3, 0 + 4
		
		int minsteDifferanse = tidsgrense;
		int indeks1 = 0;
		int indeks2 = 1;
		
		for(int i = 0; i < antall-1; i++) { // we obviously don't need to calculate for the last index
			for(int j = i+1; j < antall; j++) {
				int tidsDifferanse = tidsgrense - (vTab[i].getSekund()+vTab[j].getSekund());
				if(tidsDifferanse > 0 && tidsDifferanse < minsteDifferanse) {
					minsteDifferanse = tidsDifferanse;
					indeks1 = i;
					indeks2 = j;
				}
			}
		}
		
		if(minsteDifferanse == tidsgrense) {
			System.out.println("Det finnes dessverre ingen par med filmer som treffer innenfor tidsgrensen din.");
		} else {
			System.out.println("Utskrift: " + vTab[indeks1].getTittel() + " og " + vTab[indeks2].getTittel() + " passer best.");
		}
	}
	
	public static void main(String[] args) {
		Videoarkiv videoArkiv = new Videoarkiv(100);
		videoArkiv.leggTil(new Video("Film A", "Ole Olsen", 200));
		videoArkiv.leggTil(new Video("Løkker i Java", "Ole Olsen", 100));
		videoArkiv.leggTil(new Video("Film B", "Chrisriis", 300));
		
		videoArkiv.listAlle("Ole Olsen");
		videoArkiv.bestePar(10*60);
		videoArkiv.slett("Løkker i Java");
	}

}
