package uppgift1;

// Klassen Matratt representerar en maträtt på menyn.
public class Matratt {

    // Maträttens namn, till exempel "Pasta Carbonara".
    private String namn;

    // Maträttens pris i kronor.
    private double pris;

    // Typ av maträtt: Vegetarisk, Vegansk eller Kött.
    private String typ;

    // Antal kalorier i maträtten.
    private int kalorier;

    // Konstruktorn skapar en ny maträtt.
    public Matratt(String namn, double pris, String typ, int kalorier) {
        this.namn = namn;
        this.pris = pris;
        this.typ = typ;
        this.kalorier = kalorier;
    }

    // Returnerar maträttens namn.
    public String getNamn() {
        return namn;
    }

    // Returnerar maträttens pris.
    public double getPris() {
        return pris;
    }

    // Returnerar maträttens typ.
    public String getTyp() {
        return typ;
    }

    // Returnerar antal kalorier.
    public int getKalorier() {
        return kalorier;
    }

    // Skriver ut maträtten som text.
    @Override
    public String toString() {
        return namn + " - " + pris + " kr - " + typ + " - " + kalorier + " kcal";
    }
}
