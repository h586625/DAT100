import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Oppgave5 {
	public static void main(String[] args) {
		ArrayList<String> listeAvOrd = new ArrayList<String>();
		HashMap<String, Integer> fo = new HashMap<String, Integer>();
		
		listeAvOrd.add("er");
		listeAvOrd.add("det");
		listeAvOrd.add("alle");
		listeAvOrd.add("er");
		listeAvOrd.add("det");
		listeAvOrd.add("det");
		
		//b Lag frekvensoversikten
		for(String ord : listeAvOrd) {
			if(!fo.containsKey(ord)) {
				fo.put(ord, 1);
			} else {
				fo.put(ord, fo.get(ord)+1);
			}
			// System.out.println("Ord: " + ord + " - " + fo.get(ord));
		}
		
		//a Leser inn et ord fra bruker og skriver ut tilhørende frekvens
		Scanner tast = new Scanner(System.in);
		System.out.println("Skriv inn et ord.");
		String ord = tast.nextLine();
		tast.close();
		System.out.println(fo.get(ord));
	}
}
