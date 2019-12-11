
import static javax.swing.JOptionPane.*;

public class Bestilling {
    private int kontaktnummer;
    private String kundenavn;
    private String adresse;
    
    public Bestilling(int kontaktnummer, String kundenavn, String adresse) {
        this.kontaktnummer = kontaktnummer;
        this.kundenavn = kundenavn;
        this.adresse = adresse;
    }

    public int getKontaktnummer() {
        return this.kontaktnummer;
    }

    public void setKontaktnummer(int nr) {
        this.kontaktnummer = nr;
    }

    public String getKundenavn() {
        return this.kundenavn;
    }

    public void setKundenavn(String navn) {
        this.kundenavn = navn;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void skrivUt() {
        System.out.println(kontaktnummer);
        System.out.println(kundenavn);
        System.out.println(adresse);
    }

    public static void main(String[] args) {
        int choice = Integer.parseInt(showInputDialog("Velg 1 for å opprette en SnarestMulig bestilling, eller 2 for et Tidspunkt."));
        Bestilling bestilling;
        int kundenummer = Integer.parseInt(showInputDialog("Skriv inn kundenummer.")); 
        String kundenavn = showInputDialog("Skriv inn kundenavn."); 
        String adresse = showInputDialog("Skriv inn adresse."); 
        
        if(choice == 1) {
            int maxtid = Integer.parseInt(showInputDialog("Skriv inn maxtid."));
            bestilling = new SnarestMulig(kundenummer, kundenavn, adresse, maxtid);
            bestilling.skrivUt();
        } else if(choice == 2) {
            String dato = showInputDialog("Skriv inn dato.");
            String tidspunkt = showInputDialog("Skriv inn tidspunkt.");
            bestilling = new Tidspunkt(kundenummer, kundenavn, adresse, dato, tidspunkt);
            bestilling.skrivUt();
        } else {
            System.out.println("Du må taste inn enten 1 eller 2.");
        }
    }
}