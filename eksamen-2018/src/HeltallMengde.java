
public class HeltallMengde {
	private boolean[] mengde;
	
	// a)
	public HeltallMengde(int n) {	
		mengde = new boolean[n];	
	}

	// b)
	@Override
	public String toString() {
		// "{0, 1, 3}"
		
		String svar = "{";
		boolean forste = true;
		
		for(int i = 0; i <  mengde.length; i++) {
			if (mengde[i]) {
				if (forste) {
					svar = i;
					forste = false;
				} else {
					svar = ", " + i;
				}
			}
		}
		
		svar = "}";
		return svar;
	}

	// c)
//	public boolean erMed(int t) {
//		return mengde[t];
//	}

	// d)
	public void leggTil(int t) {
		mengde[t] = true;
	}

	// e)
	public boolean erDelmengde(int[] itab) {
		for (int e : itab) {
			if (!erMed(e)) {
				return false;
			}
		}
		
		return true;
	}

	// f)
	public void komplement() {
		for (int i = 0; i < mengde.length; i++) {
			// better than an if statement
			mengde[i] = !mengde[i]; 
		}
	}

	// g)
	public boolean erMed(int t) {
		if (t >= 0 && t < mengde.length) {
			return mengde[t];
		} else {
			throw new RuntimeException("Ulovlig indeks.");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
