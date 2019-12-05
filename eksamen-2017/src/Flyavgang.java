public class Flyavgang {

    private int nummer;
    private String destinasjon;
    private String tid;
    private char status;

    public Flyavgang(int nummer, String destinasjon, String tid, char status) {
        this.nummer = nummer;
        this.destinasjon = destinasjon;
        this.tid = tid;
        this.status = status;
    }

    @Override
    public String toString() {
        String statusStr = "";

        if (getStatus() == "o") {
            statusStr = "on-time";
        } else if (getStatus() == "g") {
            statusStr = "go-to-gate";
        } else if (getStatus() == "b") {
            statusStr = "boarding";
        } else if (getStatus() == "c") {
            statusStr = "gate-closed";
        } else {
            statusStr = "-";
        }

        return getNummer() + " " + getDestinasjon() + " " + getTid() + " " + getStatus() + "\n";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
