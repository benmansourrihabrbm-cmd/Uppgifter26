package uppgift2;

public class Main {

    public static void main(String[] args) {

        // Skapar ett Student-objekt.
        // Här skickar vi in förnamn, efternamn, skola och ålder.
        Student student = new Student("Rihab", "Benmansour", "Nackademin", 42);

        // Skriver ut studentens förnamn med getter.
        System.out.println("Förnamn: " + student.getFornamn());

        // Skriver ut studentens efternamn med getter.
        System.out.println("Efternamn: " + student.getEfternamn());

        // Skriver ut skolans namn med getter.
        System.out.println("Skola: " + student.getSkola());

        // Skriver ut studentens ålder med getter.
        System.out.println("Ålder: " + student.getAlder());
    }
}
