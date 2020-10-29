import java.util.Scanner;

public class Vorgang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        int counter = 0;
        String[] stati = {"n", "b", "s", "a", "t", "x"};
        String[] statiDefinition = {
                "Neuen Vorgang öffnen",
                "Vorgang abverfügt",
                "Vorgang geschlossen",
                "Vorgang archiviert",
                "Aktueller Status des Vorgangs",
                "Beenden"
        };

        do {
            System.out.println("Status eingeben: ");

            input = sc.next().toLowerCase();

            if (input.equals("t") && counter > 0) {
                System.out.println("Aktueller Status des Vorgangs: " + statiDefinition[counter - 1]);
            } else {
                if (!stati[counter].equals(input)) {
                    if (input.equals("x")) {
                        counter = 5;
                        System.out.println(statiDefinition[counter]);
                    } else {
                        System.out.println("FALSCHE EINGABE! Bitte Nochmal.");
                    }

                } else {
                    System.out.println(statiDefinition[counter]);
                    counter++;
                }
            }
        } while (!input.equals("x"));

    }
}
