
/*
 *  Two-dimensional array tasks
 */
public class Oppgave5 {

	public static boolean erPositiv(int[][] mat, int r, int k) {
		if (mat[r][k] > 0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean erPositivRekke(int[][] mat, int r) {
		for(int i = 0; i < mat[r].length; i++) {
			if (mat[r][i] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int antallNuller(int[][] mat) {
		int zeros = 0;
		
		// took me a while to get it right
		// do more of these to memorize it
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == 0) {
					zeros++;
				}
			}
		}
		
		return zeros;
	}
	
	public static boolean erKvadratisk(int[][] mat) {
		for(int i = 0; i < mat.length; i++) {
			if(mat.length != mat[i].length) {
				return false;
			}
		}
		
		return true;
	}
	
	// We can assume the matrix is quadratic
	public static int spor(int[][] mat) {
		// [0][0], [1][1], [2][2], ...
		int sum = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(i == j) {
					sum += mat[i][j];
				}
			}
		}
		
		// better solution:
		// for(int i = 0; i < mat.length; i++) {
		//     sum += mat[i][i];
		// }
		
		return sum;
	}
	
	public static void main(String[] args) {
		// not part of the exam, but for testing purposes:
		int[][] mat = {
			{ 1, 4, -7 },
			{ 2, -5, 8 },
			{ 3, 6, 0 }
		};
		
		System.out.println(erPositiv(mat, 0, 2));
		System.out.println(erPositivRekke(mat, 2));
		System.out.println(antallNuller(mat));
		System.out.println(erKvadratisk(mat));
		System.out.println(spor(mat));
	}

}
