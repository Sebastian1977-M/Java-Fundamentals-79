package com.sda.arrays.methods;

public class MainMethods {
    public static void main(String[] args) {
  //evitam duplicarea codului
         //ajuta la scalabilitate
         //impartire pe responsabilitati
/*
        String name = "ION";
        System.out.println("ati fost conectat cu succes!");
        System.out.println("Bun venit"+name);

        String name = "Maria";
        System.out.println("ati fost conectat cu succes!");
        System.out.println("Bun venit"+name);

        String name = "Mihai";
        System.out.println("ati fost conectat cu succes!");
        System.out.println("Bun venit"+name);
*/
        //apelul metodei: numele metodei+argumente
        greetingMessage( "Ioana");
        greetingMessage("Gigel");
        greetingMessage("Nicolae");
        String name1 = "Violeta";
        greetingMessage(name1);


        System.out.println("\nSuma numerelor:");
        int a = 6;
        double b = 2.2;


        double result = Utils.sum(a,b);
        System.out.println("result = " + result);

        System.out.println(Utils.sum(3,10.1));
        System.out.println(Utils.sum(5,2));

        result = Utils.sum(b,a);
        System.out.println("result = " + result);

        System.out.println(Utils.sum(a, a, 10));

        System.out.println(Utils.sum(Utils.sum(a, a, 10), result));

        double[] numbers = {5.2, 7.1, 9.5, 7.43};
        System.out.println(Utils.sum(numbers));

        // apel metoda cu vararg
        // vararg ne permite sa avem numar variabil de argumente
        System.out.println("Varargs");
        System.out.println(Utils.sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Utils.sum(10,15,20,50,40));
        System.out.println(Utils.sum(100));
        System.out.println(Utils.sum());

        String message = Utils.sum("Suma folosind parametrul vararg = ", 10,20,30);
        System.out.println(message);

    }

    // declararea metodei
    //modificatorul de acces - public e metoda implicita
    // "static" e modificator de comportament
    // "void" - tipul de returnare
    //"void" nu returneaza nimic doar executa
    // nume metoda "main" cu litera mica + parantezele rotunde  - parametrii (cei care se vor schimba si pentru care apelam
    //comportamentul respectiv
    public static void greetingMessage (String name){
        System.out.println("ati fost conectat cu succes!");
        System.out.println("Bun venit"+name);

    }
}
