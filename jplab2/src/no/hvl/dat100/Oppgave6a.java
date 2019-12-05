package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave6a {

	public static void main(String[] args) {

		/*
		 * This program should calculate the volume of a box, but there's a bug
		 * somewhere. Use the Eclipse debugger to find out what's wrong.
		 * https://github.com/dat100hib/dat100public/blob/master/eclipse/debugging.md
		 */
		int b, h, d;
		String btext, htext, dtext;

		// les inn høyde, bredde, dybde
		htext = JOptionPane.showInputDialog("Angi høyde:");
		btext = JOptionPane.showInputDialog("Angi bredde:");
		dtext = JOptionPane.showInputDialog("Angi dybde:");

		// konverter fra tekst til heltal

		h = Integer.parseInt(htext);
		b = Integer.parseInt(btext);
		d = Integer.parseInt(htext);

		int volum = b * h * d;

		String respons = "Volum [" + htext + "," + btext + "," + dtext + "] = " + volum;

		JOptionPane.showMessageDialog(null, respons);
	}
}
