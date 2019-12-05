package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
		String tallTxt1 = showInputDialog(null, "Tast inn et heltall");
		String tallTxt2 = showInputDialog(null, "Tast inn et heltall");
		String tallTxt3 = showInputDialog(null, "Tast inn et heltall");
		String tallTxt4 = showInputDialog(null, "Tast inn et heltall");
		
		int tall1, tall2, tall3, tall4;
		tall1 = Integer.parseInt(tallTxt1);
		tall2 = Integer.parseInt(tallTxt2);
		tall3 = Integer.parseInt(tallTxt3);
		tall4 = Integer.parseInt(tallTxt4);
		
		int min1 = Math.min(tall1, tall2);
		int min2 = Math.min(tall3, tall4);
		int minFinal = Math.min(min1, min2);
		showMessageDialog(null, minFinal);
		
	}

}
