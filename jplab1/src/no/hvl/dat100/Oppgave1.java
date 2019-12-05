package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {

	public static void main(String[] args) {
		String tallTxt1 = showInputDialog("Oppgi lengden til rektangelet");
		int tall1 = parseInt(tallTxt1);
		String tallTxt2 = showInputDialog("Oppgi bredden til rektangelet");
		int tall2 = parseInt(tallTxt2);
		showMessageDialog(null, "Arealet til rektangelet er: " + (tall1 * tall2));
	}
}
