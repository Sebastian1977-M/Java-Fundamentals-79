package com.sda.variables;

public class MainVariables {
    public static void main(String[] args) {
        // tipuri de data - primitive + complexe (de referinta)

        // String - siruri de caractere
        // declararea varibilelor -> tip_de_data + nume_variabila;
        String firstName;

        // initializare variabila = prima atribuire -> nume_variabila = valoare;
        firstName = "Maria";

        System.out.println(firstName);

        // atribuire
        firstName = "Ana Maria";

        System.out.println(firstName);

        // declarare + initializare pe acelasi rand
        int age = 30;

        // concatenare
        System.out.println(firstName + " " + age);
        System.out.println(firstName + " are varsta de " + age + " de ani.");

        char a = 97; // caracterul corespunzator valorii din codul ASCII
        char b = 'b';
        System.out.println(a);
        System.out.println(b);

        int temperature = -1;
        char symbol = '\u2103'; // unicode
        System.out.println("Temperatura este " + temperature + symbol);

        System.out.println(a + b); // se realizeaza adunarea
        System.out.println(a + "" + b); // se realizeaza concatenarea

        // tipuri de data pentru numere intregi
        // implicit - int
        byte numberByte = -10;
        System.out.println(numberByte);

        short numberShort = 1000;
        System.out.println(numberShort);

        long numberLong = 10000000000000L;
        numberLong = 9_999_999_999_999L;
        System.out.println(numberLong);

        // tipuri de data pentru numere reale
        // implicit - double
        float numberFloat = 14.9F;
        System.out.println(numberFloat);

        double numberDouble = 123.57;
        System.out.println(numberDouble);

        // boolean - adevarat sau fals
        boolean isOnSale = true;
        System.out.println("isOnSale? = " + isOnSale);

        boolean isHotOutside = false;
        System.out.println("isHotOutside ? = " + isHotOutside);

        // final

    }
}
