package no.hvl.dat100;

import easygraphics.EasyGraphics;
import static javax.swing.JOptionPane.*;

public class Oppgave6bc extends EasyGraphics {

	private static final long serialVersionUID = 169356086115108239L;

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		String txt = showInputDialog(null, "Skriv inn en prosentverdi.");
		double prosentVerdi = Integer.parseInt(txt) / 100.0;
		double stripeWidth = 200 * prosentVerdi;
		double stripeHeight = 50 * prosentVerdi;
		int stripeWidth2 = (int) stripeWidth;
		int stripeHeight2 = (int) stripeHeight;
		double x = 50 * prosentVerdi;
		int x2 = (int) x;
		double y1 = 50 * prosentVerdi;
		double y2 = 100 * prosentVerdi;
		double y3 = 150 * prosentVerdi;
		int y1_2 = (int) y1;
		int y2_2 = (int) y2;
		int y3_2 = (int) y3;
				
	    makeWindow("Det tyske flagget");
	
	    setColor(0, 0, 0);
	    fillRectangle(x2, y1_2, stripeWidth2, stripeHeight2);
	    setColor(255, 0, 0);
	    fillRectangle(x2, y2_2, stripeWidth2, stripeHeight2);
	    setColor(255, 255, 0);
	    fillRectangle(x2, y3_2, stripeWidth2, stripeHeight2);
	}

}