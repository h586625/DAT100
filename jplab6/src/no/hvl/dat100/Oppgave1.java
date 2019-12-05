
package no.hvl.dat100;

public class Oppgave1 {

    // a)
    public static void skrivUt(int[] tabell) {
        System.out.println("OPPGAVE A");

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
    }

    // b)
    public static void summer(int[] tabell) {
        System.out.println("\n\nOPPGAVE B");

        int sum = 0;
        int i = 0;

        for (i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        System.out.println("for-l�kke: " + sum);

        i = 0;
        sum = 0;
        while (i < tabell.length) {
            sum += tabell[i];
            i++;
        }
        System.out.println("while-l�kke: " + sum);

        sum = 0;
        for (int el : tabell) {
            sum += el;
        }
        System.out.println("utvidet for-l�kke: " + sum);
    }

    // c)
    public static boolean finnesTall(int[] tabell, int tall) {
        System.out.println("\nOPPGAVE C");

        boolean fantTall = false;
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                fantTall = true;
                break;
            }
        }
        System.out.println("Fant tall: " + fantTall);
        return fantTall;
    }

    // d)
    public static int posisjonTall(int[] tabell, int tall) {
        System.out.println("\nOPPGAVE D");

        int returTall = -1;
        int index = 0;
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                returTall = tabell[i];
                index = i;
                System.out.println("index: " + index);
                break;
            }
        }
        System.out.println("Tall: " + returTall);
        return returTall;
    }

    // e)
    public static int[] reverser(int[] tabell) {
        System.out.println("\nOPPGAVE E");

        int[] reversertTabell = new int[tabell.length];

        for (int i = 0; i < tabell.length; i++) {
            reversertTabell[i] = tabell[(tabell.length - 1) - i];
            System.out.print(reversertTabell[i]);
        }

        return reversertTabell;
    }

    // f)
    public static int[] erSortert(int[] tabell) {
        System.out.println();
        System.out.println("\nOPPGAVE F");

        // Plukksortering (hva er engelsk betegnelse?)
        int tabellLength = tabell.length;
        int[] sortertTabell = new int[tabellLength];
        for (int tallNr = 0; tallNr < tabellLength; tallNr++) {
            // Vi antar at minste posisjonen er i indeks 0 (setter det som standard).
            // Da slipper vi � iterere hele tabellen, og heller "n-1" ganger per element.
            int minPos = 0;

            // Variabel minPos er satt til 0 som standard, s� vi kan derfor starte � iterere
            // fra indeks 1
            // og se etter alle andre muligheter etter indeks 0.
            // Vi sammenlikner alle tallene med det ene tallet vi har tilgjengelig fra
            // �verste l�kke.
            // Er f.eks. tallet i indeks 4 mindre enn n�v�rende minste posisjon, s� tilegner
            // vi ny verdi.
            for (int posNr = 1; posNr < tabellLength; posNr++) {
                if (tabell[posNr] < tabell[minPos]) {
                    minPos = posNr;
                }
                System.out.print("\nminPos: " + minPos + " posNr: " + posNr + " verdi: " + tabell[posNr]);
            }

            // Tilegner verdi til sortert tabell basert p� funnet ovenfor.
            sortertTabell[tallNr] = tabell[minPos];
            // Sletter minimumsverdien ved � gi plassen i tabellen en maksimalverdi.
            tabell[minPos] = Integer.MAX_VALUE;
            System.out.print("\nSortert: " + sortertTabell[tallNr] + " ");
        }
        return tabell;
    }

    public static void main(String[] args) {
        int heltallTabell[] = { 6, 5, 10, 20, 3, 1 };

        skrivUt(heltallTabell);
        summer(heltallTabell);
        finnesTall(heltallTabell, 20);
        posisjonTall(heltallTabell, 4);
        reverser(heltallTabell);
        erSortert(heltallTabell);
    }

}

