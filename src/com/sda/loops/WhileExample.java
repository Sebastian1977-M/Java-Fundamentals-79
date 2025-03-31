package com.sda.loops;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        //cititi toate nr. introd de utilizator pana cand introduca nr. 0
        //folositi break
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numere (0 pt a opri citirea");
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {

                break;//forteaza iesirea din bucla while
            }
            System.out.println(number);

        }
        sc.close();
    }
}
