
public class Tidspunkt extends Bestilling {
    private String dato;
    private String tidspunkt;

    public Tidspunkt(int kontaktnummer, String kundenavn, String adresse, String dato, String tidspunkt) {
        super(kontaktnummer, kundenavn, adresse);
        this.dato = dato;
        this.tidspunkt = tidspunkt;
    }

    @Override
    public void skrivUt() {
        super.skrivUt();
        System.out.println(dato);
        System.out.println(tidspunkt);
    }
}