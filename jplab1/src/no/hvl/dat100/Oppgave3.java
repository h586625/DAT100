package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		String dag = showInputDialog(null, "Tast inn dag");
		String måned = showInputDialog(null, "Tast inn måned");
		String år = showInputDialog(null, "Tast inn år (xxxx)");
		
		String dato = dag + "." + måned + "." + år;
		
		showMessageDialog(null, dato);
		
	}

}
