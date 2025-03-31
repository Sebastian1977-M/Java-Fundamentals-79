package com.sda.arrays;

public class MainArrays {
    public static void main(String[] args) {
        //array este o structura care stocheaza elem de aceklasi ti
        // are dimensiune fixa  - deci o declaram\
        //are lungime lungimea array - 1
        short[] arrayShort;
        arrayShort= new short[5];
// 5 elemente toate 0 arrayShort = {0,0,0,0,0}

        long[] arrayLong = new long[] {10000000L, 90000000L};
        // pozitii 0 si 1

        double[] arrayDouble = {5.2,6.9,2.5,9.7};//4 numere pozitii 0-3
        boolean[] arrayBoolean = new boolean[3];
// accesarea elementelor
        System.out.println("Elementul de pe pozitia 2 din array ="+ arrayDouble[2]);
        System.out.println(arrayShort[0]+ "" + arrayShort[1] + arrayShort[2]
                + arrayShort[3] + arrayShort[4]);
        System.out.println(arrayBoolean[0] + "" + arrayBoolean[1] + arrayBoolean[2]);

        //preluare lungime  array
        System.out.println("Lungime arrayDouble  ="+ arrayDouble.length);
        // parcurgeri
        System.out.println("Parcurgerea cu FOR: ");
        for (int i = 0; i<arrayDouble.length;i++) {
            System.out.println(arrayDouble.length + " ");
        }

        System.out.println("Parcurgere cu FOREACH");
        String[] grupa79 = { "Andreea", "Mihai","Sebi","Andrei", "Viorel","Steluta","Irene","Claudiu"};
                for (String cursant : grupa79) {
                    System.out.print(cursant + " ");
                }

        System.out.println("Cati cursanti au paticipat astazi la curs? " + grupa79.length);


}
}

