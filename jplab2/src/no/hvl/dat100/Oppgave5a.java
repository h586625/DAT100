package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5a {

	public static void main(String[] args) {
		String poengsumTxt = showInputDialog(null, "Skriv inn din poengsum.");
		int poengsum = Integer.parseInt(poengsumTxt);
		char karakter;

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
