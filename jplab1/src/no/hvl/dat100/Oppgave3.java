package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		String dag = showInputDialog(null, "Tast inn dag");
		String m�ned = showInputDialog(null, "Tast inn m�ned");
		String �r = showInputDialog(null, "Tast inn �r (xxxx)");
		
		String dato = dag + "." + m�ned + "." + �r;
		
		showMessageDialog(null, dato);
		
	}

}
