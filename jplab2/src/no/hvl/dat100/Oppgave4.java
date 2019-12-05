package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {

	public static void main(String[] args) {
		String inntektTxt = showInputDialog(null, "Skriv inn din inntekt og få beregnet din trinnskatt.");
		int inntekt = Integer.parseInt(inntektTxt);
		float trinnSkatt;

		if (inntekt >= 934051) {
			trinnSkatt = inntekt *= 0.1452;
		} else if (inntekt >= 580651) {
			trinnSkatt = inntekt *= 0.1152;
		} else if (inntekt >= 230951) {
			trinnSkatt = inntekt *= 0.0241;
		} else if (inntekt >= 164101) {
			trinnSkatt = inntekt *= 0.0093;
		} else {
			trinnSkatt = 0;
		}

		showMessageDialog(null, "Din trinnskatt er " + trinnSkatt + " kroner.");
	}

}
