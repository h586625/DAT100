package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {

	public static void main(String[] args) {
		String heltallTxt = showInputDialog(null, "Skriv inn et heltall større enn 0.");
		int heltall = Integer.parseInt(heltallTxt);
		int nFac = heltall;

		if (heltall > 0) {
			for (int i = 1; i < heltall; i++) {
				nFac *= i;
			}
			showMessageDialog(null, "n fakultet av " + heltall + " er: " + nFac);
		} else {
			showMessageDialog(null, "Heltallet må være større enn 0.");
		}
	}

}
