
public class FlyAvgang {
	public final static int LEDIG = 1;
	public final static int OPPTATT = 2;
	public final static int CHECKEDIN = 3;
	public final static int BOARDED = 4;
	
	private int[][] flyavgang;
	
	// her kommer resten av Java-koden
	
	// a)
	public FlyAvgang(int r, int p) {
		flyavgang = new int[r][p];
		
		for (int[] rad : flyavgang) {
//			for (int plass : rad) {
//				rad[plass] = LEDIG;
//			}
			
			// above won't work because "plass" in the inner
			// enhanced for loop will just be a copy of 
			// the element in the array,
			// so it won't affect the array itself
		
			for(int j = 0; j < rad.length; j++) {
				rad[j] = LEDIG;
			}
		}
	}
	
	// b)
	public void print() {
		int i = 0;
		for (int[] rad : flyavgang) {
			for (int plass : rad) { 
				// risky business, see above, 
				// but we don't change anything in this case
				if(rad[plass] == LEDIG) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
			}
			i++;
			System.out.println(" " + i);
		}
	}
	
	// c)
	public void setStatus(int r, int p, int status) {
		flyavgang[r][p] = status;
	}
	
	// d)
	public boolean reserver(int r, int p ) {
		int seteStatus = flyavgang[r][p];
		if(seteStatus == LEDIG) {
			seteStatus = OPPTATT;
			return true;
		} else {
			return false;
		}
	}
	
	// e)
	public String printcard(int r, int p, String navn) {
		int seteStatus = flyavgang[r][p];
//		char plassKode;
//		if (p == 0) {
//			plassKode = 'A';
//		} else if(p == 1) {
//			plassKode = 'B';
//		} else if(p == 2) {
//			plassKode = 'C';
//		} else {
//			plassKode = 'D';
//		}
		
		if(seteStatus == CHECKEDIN) {
			//return "Navn: " + navn + ", Rad: " + flyavgang[r]+1 + ", Plass: " + plassKode;
			// better solution:
			return navn + "\n" + (r+1) + Character.toString((char) ('A' + p));
		} else {
			return "hei";
		}
	}
	
	// f)
	boolean boardingcompleted() {
		for (int[] rad : flyavgang) {
			for(int j = 0; j < rad.length; j++) { 
				if(rad[j] != 1 || rad[j] != 4) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		FlyAvgang flyavgang = new FlyAvgang(6, 4);
		flyavgang.print();
		flyavgang.setStatus(0, 2, 3);
		System.out.println(flyavgang.printcard(0, 2, "Chris"));
	}

}
