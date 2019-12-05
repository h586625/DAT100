package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppgave4 {

	public static void main(String[] args) {
		
		 // 3690 sekunder skal gi som svar 1 timer, 1 minutter og 30 sekunder.
		String sekunderInput = showInputDialog(null, "Tast inn et antall sekunder");
		int antallSekunder = Integer.parseInt(sekunderInput);
		
		String tidUtskrift = "";
		
		// Det er 3600 sekunder i en time og 60 sekunder i et minutt.
		int sekunderOmTilTimer = antallSekunder / 60 / 60;
		int sekunderOmTilMinutter = antallSekunder / 60 % 60;
		int restSekunder = antallSekunder % 60;
		
		tidUtskrift = sekunderOmTilTimer + " timer, " + 
		sekunderOmTilMinutter + " minutter og " + restSekunder + " sekunder.";
		
		showMessageDialog(null, tidUtskrift);
	}

}
