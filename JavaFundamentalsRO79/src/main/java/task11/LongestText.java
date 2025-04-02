package task11;

import java.util.Scanner;

public class LongestText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestText = null; // inițializăm cu null pentru a verifica mai ușor mai târziu

        while (true) {
            System.out.println("Introduceți un text (sau 'GATA!' pentru oprirea programului):");
            String inputText = scanner.nextLine();

            if (inputText.equals("GATA!")) {
                break; // ieșim din buclă dacă utilizatorul a introdus "GATA!"
            }

            if (inputText.isEmpty()) {
                continue; // ignorăm intrările goale
            }

            // Verificăm lungimea textului curent și actualizăm cel mai lung text
            if (longestText == null || inputText.length() > longestText.length()) {
                longestText = inputText;
            }
        }

        // Verificăm dacă am primit vreun text
        if (longestText != null) {
            System.out.println("Cel mai lung text este: " + longestText);
        } else {
            System.out.println("Nu a fost procesat niciun text!");
        }

        scanner.close(); // Închidem scannerul pentru a elibera resursele
    }
}
