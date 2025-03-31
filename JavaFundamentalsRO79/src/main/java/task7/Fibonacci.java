package task7;

/*
Write an application that will take a positive number from the user (type int)
and calculate the Fibonacci number at the indicated index. For example, if the number equals 5,
your program should print the fifth Fibonacci number. In Fibonacci sequence, each number is
the sum of the two preceding ones.
For example, the first few Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…

atentie la indexare - daca pornim de la 0 indexarea atunci nr 5 e 8, daca pornim de la 1 anunci e 5

 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr. pozitiv ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Numarul este negativ !!");
            return;
        } else {
            System.out.println(" Al " + n + " -al n-lea numar fibonnaci este  " + fibonacci(n));

        }
    }
//todo : recreati metoda fibonaccci in mod recursiv;
// recursiv - o tehnica prin care metoda se reapeleaza pe ea insasi pentru a inlocui procesul repetitiv
    private static int fibonacci(int n) {
        // a primul predecesor
        // b al doilea predecesor

        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {

            int next = a + b;
            // se actualizeaza predecesorii
            // a,b , next
            //a,a,b, next
            //a,a,a, b, next
            // ....
a = b;
b = next;

        }
        return b;

    }
}
