package com.sda.operators;

public class MainOperators {
    public static void main(String[] args) {
        // a + b -> expresie
        // a,b -> operanzi
        // + -> operator

        System.out.println("Operatori unari -> un singur operand");
        // operatorii de semn: +, -
        int n = -10;
        System.out.println(-n);

        // operatorul logic de negare: !
        // neaga valoarea de adevar a unei variabile sau expresii boolean
        // !true = false
        // !false = true
        boolean isColdOutside = false;
        System.out.println(!isColdOutside);

        boolean result = 10 > 0;
        System.out.println(!result);

        // operatorii aritmetici de incrementare / decrementare: ++, --
        // preincrementare / predecrementare: ++n, --n
        // postincrementare / postdecrementare: n++, n--

        int number = 4;
        System.out.println("Pre-incrementare: " + ++number); // 5
        System.out.println("Dupa pre-incrementare: " + number); // 5
        number = 4;
        System.out.println("Post-incrementare: " + number++); // 4
        System.out.println("Dupa post-incrementare: " + number); // 5

        // pre-incrementare / pre-decrementarea valoarea se modifica in cadrul aceleiasi operatii
        // post-incrementare / post-decrementare valoarea se modifica dupa efectuarea operatiei

        number = 4;
        System.out.println("Pre-decrementare: " + --number); // 3
        System.out.println("Dupa pre-decrementare: " + number); // 3
        number = 4;
        System.out.println("Post-decrementare: " + number--); // 4
        System.out.println("Dupa post-decrementare: " + number); // 3

        System.out.println("Operatori binari -> doi operanzi");
        // operatorii aritmetici: +, -, *, /, % (modulo = restul impartirii)
        int result1 = ((7 + 6) * 3) % 2;
        System.out.println(result1);

        // operatorii de comparatie: >, <, >=, <=, != (diferit), == (egalitate)
        // operatorii logici: && (si), || (sau)
        // un rezultat boolean
        int a = 5, b = 8;
        boolean result2 = (a != b) && (a > b);
        System.out.println(result2);

        int c = 10;
        result2 = (c == a *2) || (c < b);
        System.out.println(result2);

        // &&
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false =  false

        // daca expresia din stanga este falsa, atunci nu mai evalueaza urmatoarea expresie

        // ||
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false =  false

        // daca expresia din stanga este adevarata, atunci nu mai evalueaza urmatoarea expresie

        // operatorii de atribuire: =, +=, -=, *=, /=, %=
        int m = 50;
        m += 10; // m = m + 10;
        System.out.println(m);
        m %= 3; // m = m % 3;
        System.out.println(m);

        // operatorii pe biti: & (si), | (sau), ^ (xor = sau exclusiv), ~ (complement)
        // << (deplasare la stanga), >> (deplasare la dreapta cu semn), >>> (deplasare la dreapta fara semn)

        System.out.println("Operatorul ternar -> trei operanzi");
        // verificam care numar este mai mare dintre 2 numere
        a = 1000;
        b = 200;
        int result3 = (a > b) ? a : b;
        System.out.println(result3);
        // (conditie) ? rezultat_daca_conditia_este_adevarata : rezultat_daca_conditia_este_falsa

        double temperature = 1.5;
        String result4 = (temperature > 0) ? "Ploua" : "Ninge";
        System.out.println(result4);

        /* teste optionale:
        1. intro: https://docs.google.com/forms/d/1LhgzTfznDrx-xoCUbkPVn5qhJ_-FzaX84vwK4v60q6c/edit
        2. variabile, conversii: https://docs.google.com/forms/d/1QcOv6kLVbErFTXH7QtekDwuAoZ9agEIoz8Fw2gh0Jdk/edit
        3. operatori: https://docs.google.com/forms/d/1JCzeC954z3yGPVXDXlCg0j08YvSvlB7EGKn4RiJ-RHI/edit
         */

        //TEMA
        // analizati urmatoarele expresii:
        int x = 6;
        System.out.println(2 * x++ + x-- + x);
        // 2 * 6 + x-- + x = 12 + x-- + x
        // x = 7
        // 12 + 7 + x
        // x = 6
        // 19 + 6 = 25
        System.out.println("x = " + x);

        int y = 3;
        System.out.println(++x * y-- + ++y);
        // 7 * 3 + ++y
        // x = 7 ; y = 2
        // 21 + 3 = 24
        // x = 7 ; y = 3
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
