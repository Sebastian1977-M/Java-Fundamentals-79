package com.sda.conditionals;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti o zi a saptamanii:");
        String day = sc.next();
        System.out.println("ziua citita = " + day);

        sc.close();

        // basic switch
        System.out.println("SWITCH 1");

        int dayNo = 0;
        switch (day) {
            case "luni":
                System.out.println("Work day");
                dayNo = 1;
                break;
            case "marti":
                System.out.println("Work day");
                dayNo = 2;
                break;
            case "miercuri":
                System.out.println("Work day");
                dayNo = 3;
                break;
            case "joi":
                System.out.println("Work day");
                dayNo = 4;
                break;
            case "vineri":
                System.out.println("Work day");
                dayNo = 5;
                break;
            case "sambata":
                System.out.println("Weekend");
                dayNo = 6;
                break;
            case "duminica":
                System.out.println("Weekend");
                dayNo = 7;
                break;
        }

        System.out.println("dayNo = " + dayNo);

        System.out.println("SWITCH 2");
        switch (day) {
            case "luni":
            case "marti":
            case "miercuri":
            case "joi":
            case "vineri":
                System.out.println("Work day");
                break;
            case "sambata":
            case "duminica":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Zi invalida");
        }

        // alta varianta de switch
        // "->" functioneaza astfel: returneaza o valoare si pune break
        System.out.println("SWITCH 3");
        String result = switch (day) {
            case "luni", "marti", "miercuri", "joi", "vineri" -> "Work day";
            case "sambata", "duminica" -> "Weekend";
            default -> "Zi invalida";
        };

        System.out.println(result);

        System.out.println("SWITCH 4");
        dayNo = 0;
        dayNo = switch (day) {
            case "luni" -> 1;
            case "marti" -> 2;
            case "miercuri" -> 3;
            case "joi" -> 4;
            case "vineri" -> 5;
            case "sambata" -> 6;
            case "duminica" -> 7;
            default -> 0;
        };

        System.out.println("dayNo = " + dayNo);

    }
}

