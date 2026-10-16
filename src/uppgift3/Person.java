package uppgift3;

// Importerar LocalDate för att kunna spara ett datum.
import java.time.LocalDate;

// Klassen Person representerar en person.
public class Person {

    // Personens födelsedatum.
    // En person har alltid ett födelsedatum, så det skickas in i konstruktorn.
    private LocalDate fodelsedatum;

    // Personens namn.
    // Det kan sättas senare, därför är det inte med i konstruktorn.
    private String namn;

    // Personens gatuadress.
    private String gatuAdress;

    // Personens postnummer.
    private String postNummer;

    // Personens postort.
    private String postort;

    // Konstruktorn tar bara emot födelsedatum.
    public Person(LocalDate fodelsedatum) {

        // Sparar födelsedatumet i objektet.
        this.fodelsedatum = fodelsedatum;
    }

    // Setter för namn.
    // Används för att ge personen ett namn.
    public void setNamn(String namn) {
        this.namn = namn;
    }

    // Getter för namn.
    // Returnerar personens namn.
    public String getNamn() {
        return namn;
    }

    // Setter för att byta hela adressen.
    // Metoden tar emot gatuadress, postnummer och postort.
    public void bytAdress(String gatuAdress, String postNummer, String postort) {
        this.gatuAdress = gatuAdress;
        this.postNummer = postNummer;
        this.postort = postort;
    }

    // Getter för gatuadress.
    public String getGatuAdress() {
        return gatuAdress;
    }

    // Getter för postnummer.
    public String getPostNummer() {
        return postNummer;
    }

    // Getter för postort.
    public String getPostort() {
        return postort;
    }

    // Returnerar personens hela adress som text.
    public String getFullAdress() {
        return gatuAdress + ", " + postNummer + " " + postort;
    }
}
