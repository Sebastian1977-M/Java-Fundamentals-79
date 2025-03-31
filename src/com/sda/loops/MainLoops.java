package com.sda.loops;

import java.util.Scanner;

public class MainLoops {
    public static void main(String[] args) {
        //afisati toate nr. intregi de la 0 la un nr. citit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int number = scanner.nextInt();
        String input;
        do {
            System.out.println("Do you want to stop the execution ? (yes/no)");
            input = scanner.next();

            if (input.toLowerCase().equals("yes")) {
                System.out.println("Execution stopped.");
            }
        } while (!input.toLowerCase().equals("yes"));

        scanner.close();
        System.out.println("Numar citit" + number);


        for (int i = 0; i <= number;i++){
            System.out.println(i);
        }

        System.out.println("parcurgere descrescatoare");
        for (int i = number; i >= 0;i--) {
            System.out.println(i);
        }
        System.out.println("pas din 3 in 3");
        for (int i = 0; i <= number;i+=3){ // i=i+3
            System.out.println(i);
        }
        System.out.println("FOR");
        // declararea si initializarea iteratorului i
        //  conditia de oprire = atunci cand devine falsa, se incheie structura repetitiva
        // actualizarea iteratorului = pasul
        System.out.println("WHILE");
        //whilwe intai verifica conditia;
        // executa doar daca conditia e adevarata
        int i = 0;
        while (i <= number){
            System.out.println(i);
            i++;
        }
        System.out.println("i = " +i);
        System.out.println("DO-WHILE");
        i = 0;
        // Do-While intai executa instructiunile din DO apoi verifica conditia din While
        do {
            System.out.println(i);
            i++;

        }while (i <= number);

    }
}
