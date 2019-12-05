package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5c {

	public static void main(String[] args) {
		String poengsumTxt;
		int poengsum;
		char karakter;

		for (byte i = 1; i <= 10; i++) {
			poengsumTxt = showInputDialog(null, "Skriv inn din poengsum.");

			if (!poengsumTxt.isEmpty()) {
				poengsum = Integer.parseInt(poengsumTxt);
			} else {
				showMessageDialog(null, "Du må skrive inn poengsummen din.");
				continue;
			}

			if (poengsum > 100 || poengsum < 0) {
				showMessageDialog(null, "Din poengsum er ugyldig. Gyldig poengsum er 0-100.");
				continue;
			}

			if (poengsum >= 90) {
				karakter = 'A';
			} else if (poengsum >= 80) {
				karakter = 'B';
			} else if (poengsum >= 60) {
				karakter = 'C';
			} else if (poengsum >= 50) {
				karakter = 'D';
			} else if (poengsum >= 40) {
				karakter = 'E';
			} else {
				karakter = 'F';
			}

			showMessageDialog(null, "Du har fått karakteren " + karakter + ".");
		}
	}

}
