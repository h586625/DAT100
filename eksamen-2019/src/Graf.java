
public class Graf {
	private boolean[][] nabomatrise = {
			{ false, true, false, true, false, false },
			{ true, false, true, false, true, true },
			{ false, true, false, false, false, true },
			{ true, false, false, false, false, false },
			{ false, true, false, false, false, true },
			{ false, true, true, false, true, false } };
	
	
	// a)
	public boolean erNaboer(int u, int w) {
		if(nabomatrise[u] == nabomatrise[w]) {
			return true;
		}
		
		return false;
	}
	
	// b)
	public int grad(int v) {
		int grad = 0;
		
		for(int i = 0; i<nabomatrise[v].length; i++) {
			if(nabomatrise[v][i] == true) {
				grad++;
			}
		}
		
		return grad;
	}
	
	// c)
	// a node with an edge to itself
	public int antallLokker() {
		int antall = 0;
		
		for(int i = 0; i<nabomatrise.length; i++) {
			if(nabomatrise[i][i] == true) {
				antall++;
			}
		}

		return antall;
	}

	// d)
	// e.g. {0, 2, 4}
	// vi må gå gjennom alle elementer i s
	// vi må teste hvert element i s mot nabomatrisen[0][element i S]
	public boolean uavhengigMengde(int[] s) {
		for(int i = 0; i<s.length; i++) {
			int element = s[i];
			if(nabomatrise[0][element] == true) {
				return false;
			}
		}

		return true;
	}
	
	public static void main(String[] args) {
		//
	}
}
