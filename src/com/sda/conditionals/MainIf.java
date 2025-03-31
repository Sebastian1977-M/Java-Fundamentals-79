package com.sda.conditionals;

public class MainIf {
    public static void main(String[] args) {
        double temperature = 0;

        //expresia verificata in IF este o valoare booleana - true/false;
        System.out.println("IF");
                if(temperature>0) {
                    System.out.println("Temperaturi pozitive");
                }

        System.out.println("Temperaturi este"+ temperature);

        System.out.println("IF - Else");
        if(temperature > 0) {
            System.out.println("Temperaturi pozitive");
        }else {
            System.out.println("Temperaturi negative sau 0");
            System.out.println("Ne imbragam gros");
        }

            System.out.println("IF - ELSE - IF");
        temperature = 45;
        if(temperature>0 && temperature> -20) {//(-infinit,0)
            System.out.println("Temperaturi negative");
        } else if (temperature<21){ //[0,21)
            System.out.println("Temperaturi medii");
        } else { //[21, infinit)
            System.out.println("Temperaturi mari");

        }
        if (temperature < 0) { // (-infinit, 0)
            System.out.println("Temperaturi negative");
        } else if (temperature < 21) { // [0,21)
            System.out.println("Temperaturi medii");
        } else if (temperature < 35){ // [21,35)
            System.out.println("Temperaturi mari");
        } else { // [35, infinit)
            System.out.println("Temperaturi caniculare");
        }


        System.out.println();
        boolean isTrue = true;
        if (isTrue) {
            System.out.println("Executam instructiuni");

            // Tema
            //Cititi temperaturi folosind Scanner
            // cu if sa verificati daca un nr e mai mare ca 100 si sa fie par


            // TEMA:
            // 1. cititi temperatura folosind Scanner
            // 2. verificati daca un numar citit folosind Scanner
            // este mai mare decat 100 si este par
        }
        }
    }

