import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Oppgave3 {

    public static void les(String filnavn) throws FileNotFoundException {
        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);

        // Her skal du skrive noe kode i deloppg. a og b.
        while (leser.hasNextLine()) {
            if (leser.nextLine().contains("//")) {
                System.out.println(leser.nextLine());
            }
        }

        leser.close();
    }

    public static boolean lesCatch(String filnavn) {
        try {
            les(filnavn);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public static void lesForsok(String filnavn, int forsok) {
        int i = 0;

        while (i < forsok) {
            if (!lesCatch(filnavn)) {
                showMessageDialog(null, "Feil");
                showInputDialog("Angi filnavn");
                i++;
            } else {
                lesCatch(filnavn);
            }
        }
    }

    public static void main(String[] args) {
        // C:\Users\chris\eclipse-workspace\DAT100-eksamen-2017\src\test.txt
        Oppgave3.lesForsok("\\test.txt", 3);
    }
}
