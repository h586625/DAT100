
public class Flyavganger {
    private Flyavgang[] tab;

    // GLEMTE STATIC!

    public Flyavganger(int tabSize) {
        this.tab = new Flyavgang[tabSize];
    }

    public static boolean erNull(int p) {
        if (tab[p] == null) {
            return true;
        } else {
            return false;
        }
    }

    public static int antall() {
        int i;
        // Glemte å definere Flyavgang datatype
        for (i = 0; i < tab.length; i++) {
            if (!erNull(i)) {
                i++;
            }
        }
        return i;
    }

    public static void visinfo() {
        for (int i = 0; i < tab.length; i++) {
            if (!erNull(i)) {
                System.out.println(tab[i].toString());
            }
        }
    }

    public static boolean setStatus(int nummer, char status) {
        for (int i = 0; i < tab.length; i++) {
            if (!erNull(i) && tab[i].getNummer() == nummer) {
                tab[i].setStatus(status);
                return true;
            }
        }
        return false;
    }

    public static boolean settinn(Flyavgang flyavgang) {
        for (int i = 0; i < tab.length; i++) {
            if (erNull(i)) {
                tab[i] = flyavgang;
                return true;
            }
        }
        return false;
    }

    public static boolean slett(int nummer) {
        for (int i = 0; i < tab.length; i++) {
            if (!erNull(i) && tab[i].getNummer() == nummer) {
                tab[i] = null;
                return true;
            }
        }
        return false;
    }
}
