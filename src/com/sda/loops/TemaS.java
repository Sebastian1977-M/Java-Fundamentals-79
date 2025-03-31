package com.sda.loops;

import java.util.Scanner;

public class TemaS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numere 0 pt a opri citirea");
        while (true) {
            int number = sc.nextInt();
            if (number % 2 == 0 && number >= 2 && number < 27) {
                System.out.println("Numarul par =" + number);
                break;
            } else {
                System.out.println("Introdu alt Numar");
                {
                    int number1 = sc.nextInt();
                    {
                        if (number1 % 2 == 0 && number1 >= 2 && number1 < 27) ;
                    }
                    System.out.println("Numarul par =" + number1);
                }
                sc.close();
            }
        }
    }
}


