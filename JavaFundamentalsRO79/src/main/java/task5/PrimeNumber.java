package task5;
/*Write an application that takes a positive number from the user (type int)
and prints all prime numbers greater than 1 and less than the given number.

verifica ca un nr e prim
for (verific daca un nr e prim) -> printati toate nr prime din interval
*/

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar pozitiv ");

        int number = scanner.nextInt();
        /* todo provocare
        creati un  pachet nou : utilities
        creati o clasa noua utilitara"Utility.java"
        definiti o metoda booleana de verificare ca un  nr este negativ
        hint: extrageti codul de mai jos intr-o metoda noua, intr-o classa noua si apelati metoda in cele 2 exercitii
         - task 4 si 5

         apelarea metodei arata in felul urmator: Utility.metoda(number)
         */
        if (number < 0) {
            System.out.println("Numarul introdus este negativ");
            return;
        }
        /* un nr prim are doar 2 divizori : 1 si pe el insusi
         */


        for (int i = 2; i < number; i++) {
            // verificare nr prim -> i
            int contor = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    contor++;

                }
            }
            if (contor == 0) {
                System.out.println(i);
            }
        }
    }
}