package com.sda.loops;

public class ContineExample {
    public static void main(String[] args) {
        //parcurgeti un interval citit si afisati numerele pare folosite de instructiunea Continue
        //Tema - parcurgeti un interval citit si afisati numerele pare FARA folosite de instructiunea Continue
        //Tema - cititi intervalul folosind Scanner
        //parcurgem cu for
        //vweificam cu IF daca nr e par
        //daca nr este par il afisam
        //inchidem if; inchidem for

        int min = 2;
        int max = 10;
        for (int i = min; i < max; i++) {
            if (i % 2 != 0) { //verifica daca nr. este impar
                continue; // sare peste iteratia curenta (sare peste numerele impare)
            }

            System.out.println(i);
        }
    }
}
