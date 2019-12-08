
import static javax.swing.JOptionPane.*;

import java.util.Scanner;

public class Innlegg {
	// Used protected first, but it's possible to use private
	// if you use super.method() where applicable.
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg(String bruker, String dato) {
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}
	
	public void skrivUt() {
		System.out.println("Bruker: " + bruker);
		System.out.println("Dato: " + dato); 
		System.out.println("Likes: " + likes);
	}
	
	// f)
	public static void main(String[] args) {
		// Didn't do the required work necessary.
		// Bonus if you learn to use the Scanner class like shown below.
		Innlegg innlegg = null;
		Scanner tast = new Scanner(System.in);
		
		System.out.println("Enkel forklaring.");
		
		System.out.print("Bruker?");
		String bruker = tast.nextLine();
		
		System.out.print("Dato");
		String dato = tast.nextLine();
		
		System.out.println("1: Bilde \n2: Tekst \nValg? ");
		int valg = tast.nextInt();
		
		// nextLine doesn't work inside the if statements somehow???
		if(valg == 1) {
			System.out.print("Url? ");
			String url = tast.nextLine();
			innlegg = new Bilde(bruker, dato, url);
		} else if(valg == 2) {
			System.out.print("Tekst? ");
			String tekst = tast.nextLine();
			innlegg = new Tekst(bruker, dato, tekst);
		} else {
			System.out.println("Feilmelding.");
		}
		
		tast.close();
		
		if(innlegg != null) {
			innlegg.skrivUt();
		}
	}
}
