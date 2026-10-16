package uppgift2;

// Klassen Student representerar en student.
public class Student {

    // Studentens förnamn.
    // private betyder att variabeln bara kan användas inuti denna klass.
    private String fornamn;

    // Studentens efternamn.
    private String efternamn;

    // Namnet på skolan som studenten studerar på.
    private String skola;

    // Studentens ålder.
    private int alder;

    // Konstruktorn körs när ett nytt Student-objekt skapas.
    // Den tar emot förnamn, efternamn, skola och ålder.
    public Student(String fornamn, String efternamn, String skola, int alder) {

        // this.fornamn betyder klassens variabel fornamn.
        // fornamn till höger är värdet som skickades in.
        this.fornamn = fornamn;

        // Sparar efternamnet.
        this.efternamn = efternamn;

        // Sparar skolans namn.
        this.skola = skola;

        // Sparar åldern.
        this.alder = alder;
    }

    // Getter för förnamn.
    // Returnerar studentens förnamn.
    public String getFornamn() {
        return fornamn;
    }

    // Setter för förnamn.
    // Gör det möjligt att ändra förnamnet senare.
    public void setFornamn(String fornamn) {
        this.fornamn = fornamn;
    }

    // Getter för efternamn.
    // Returnerar studentens efternamn.
    public String getEfternamn() {
        return efternamn;
    }

    // Setter för efternamn.
    // Gör det möjligt att ändra efternamnet senare.
    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    // Getter för skola.
    // Returnerar namnet på skolan.
    public String getSkola() {
        return skola;
    }

    // Setter för skola.
    // Gör det möjligt att ändra skolans namn senare.
    public void setSkola(String skola) {
        this.skola = skola;
    }

    // Getter för ålder.
    // Returnerar studentens ålder.
    public int getAlder() {
        return alder;
    }

    // Setter för ålder.
    // Gör det möjligt att ändra åldern senare.
    public void setAlder(int alder) {
        this.alder = alder;
    }
}
