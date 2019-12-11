
public class SnarestMulig extends Bestilling {
    private int maxtid;

    public SnarestMulig(int kontaktnummer, String kundenavn, String adresse, int maxtid) {
        super(kontaktnummer, kundenavn, adresse);
        this.maxtid = maxtid;
    }

    @Override
    public void skrivUt() {
        super.skrivUt();
        System.out.println(maxtid);
    }
}