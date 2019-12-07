import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Oppgave3 {

    public static void les(String filnavn) throws FileNotFoundException {
        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);

        // Write code for a and b here.
        String line;

        while (leser.hasNextLine()) {
        	// We create a variable because nextLine will jump to the next line,
        	// even when used inside an if statement.
            line = leser.nextLine();
        	if (!line.contains("//")) {
                System.out.println(line);
            }
        }

        leser.close();
    }

    // lesCatch will always read the file independent of where it's used,
    // as long as it returns true,
    // so never use it directly inside e.g. an if statement.
    public static boolean lesCatch(String filnavn) {
        try {
            les(filnavn);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public static void lesForsok(int forsok) {
    	// Read the comments for lesCatch() to understand why we do this:
    	boolean lestInn= false;

        do {
        	String filnavnFraBruker = showInputDialog("Angi filnavn");
        	lestInn = lesCatch(filnavnFraBruker);
        	if (!lestInn) {
            	showMessageDialog(null, "Feil filnavn");
            	forsok--;
        	}
        } while (!lestInn && forsok > 0);
    }

    public static void main(String[] args) {
        Oppgave3.lesForsok(3);
    }
}
