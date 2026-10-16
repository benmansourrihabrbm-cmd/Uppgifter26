package uppgift1;

// Importerar ArrayList, som används för att lagra maträtter.
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Skapar en lista för maträtter.
        ArrayList<Matratt> meny = new ArrayList<>();

        // Skapar några maträtter och lägger till dem i listan.
        meny.add(new Matratt("Pasta Carbonara", 95.00, "Kött", 650));
        meny.add(new Matratt("Vegetarisk Lasagne", 89.00, "Vegetarisk", 520));
        meny.add(new Matratt("Vegansk Curry", 85.00, "Vegansk", 480));
        meny.add(new Matratt("Köttbullar med potatis", 99.00, "Kött", 700));
        meny.add(new Matratt("Falafelrulle", 75.00, "Vegansk", 450));

        // Skriver ut rubriken för dagens lunchmeny.
        System.out.println("===== DAGENS LUNCHMENY =====");

        // Går igenom alla maträtter i listan.
        for (Matratt matratt : meny) {
            // Skriver ut varje maträtt.
            System.out.println(matratt);
        }

        // Skriver ut en avslutande linje.
        System.out.println("============================");
    }
}
