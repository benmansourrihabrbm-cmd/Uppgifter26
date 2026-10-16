package uppgift3;

// Importerar LocalDate och en metod för att skapa datum.
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Skapar person 1.
        // Konstruktorn behöver bara födelsedatum.
        Person jag = new Person(LocalDate.of(1984, 5, 10));

        // Sätter namn på person 1.
        jag.setNamn("Rihab");

        // Sätter adress för person 1.
        jag.bytAdress("Kungsgatan 10", "111 22", "Stockholm");

        // Skapar person 2.
        Person kompis = new Person(LocalDate.of(1989, 8, 25));

        // Sätter namn på person 2.
        kompis.setNamn("Sara");

        // Sätter en annan adress för person 2.
        kompis.bytAdress("Storgatan 5", "114 55", "Stockholm");

        // Skriver ut information om mig.
        System.out.println("Person 1:");
        System.out.println("Namn: " + jag.getNamn());
        System.out.println("Adress: " + jag.getFullAdress());

        // Skriver ut information om kompisen.
        System.out.println("\nPerson 2:");
        System.out.println("Namn: " + kompis.getNamn());
        System.out.println("Adress: " + kompis.getFullAdress());

        // Nu flyttar jag in hos kompisen.
        // Jag får samma adress som kompisen.
        jag.bytAdress(
                kompis.getGatuAdress(),
                kompis.getPostNummer(),
                kompis.getPostort()
        );

        // Skriver ut den nya adressen efter flytten.
        System.out.println("\nEfter flytten:");
        System.out.println(jag.getNamn() + " bor nu hos " + kompis.getNamn() + ".");
        System.out.println(jag.getNamn() + "s nya adress: " + jag.getFullAdress());
    }
}
