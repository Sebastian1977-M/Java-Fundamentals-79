package com.sda;

import java.util.Scanner;

public class Main {
    // main sau psvm pentru generarea metodei main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg:");
        int number1 = sc.nextInt();
        System.out.println("Numarul intreg citit = " + number1);

        System.out.println("Introduceti un numar real:");
        double number2 = sc.nextDouble();
        System.out.println("Numarul real citit = " + number2);

        System.out.println("Introduceti un cuvant:");
        String word = sc.next();
        System.out.println("Cuvantul citit = " + word);

        sc.nextLine();
        System.out.println("Introduceti un mesaj:");
        String message = sc.nextLine();
        System.out.println("Mesajul citit = " + message);

        sc.close();
    }
}