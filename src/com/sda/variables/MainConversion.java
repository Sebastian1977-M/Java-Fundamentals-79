package com.sda.variables;

class MainConversions{
    public static void main(String[] args) {
        System.out.println("Conversii implicite");

        System.out.println("1. short -> int");
        short shortNumber1 = 32767;
        int intNumber1 = shortNumber1;
        System.out.println(shortNumber1 + " " + intNumber1);

        System.out.println("2. char -> int");
        char z = 'z';
        int intZ = z;
        System.out.println(z + " " + intZ);

        // atentie la pierderi
        System.out.println("3. int -> float");
        int intNumber3 = 327679999;
        float floatNumber3 = intNumber3;
        System.out.println(intNumber3 + " " + floatNumber3);
        System.out.printf("%.2f\n",floatNumber3);
        // printf nu adauga rand nou la final

        System.out.println("4. long -> float");
        long longNumber4 = 999_999_999_999L;
        float floatNumber4 = longNumber4;
        System.out.println(longNumber4 + " " + floatNumber4);
        System.out.printf("%.2f\n",floatNumber4);

        System.out.println("5. long -> double");
        long longNumber5 = 999_999_999_999L;
        double doubleNumber5 = longNumber5;
        System.out.println(longNumber5 + " " + doubleNumber5);
        System.out.printf("%.2f\n",doubleNumber5);
        longNumber5 = 1234567890123456789L;
        doubleNumber5 = longNumber5;
        System.out.println(longNumber5 + " " + doubleNumber5);
        System.out.printf("%.2f %d\n",doubleNumber5,longNumber5);

        // TEMA: conversia de la float -> double
        System.out.println("6. float -> double");
        float floatNumber6 = 56.89f;
        double doubleNumber6 = floatNumber6;
        System.out.println(floatNumber6 + " " + doubleNumber6);

        System.out.println("Conversii explicite");

        System.out.println("7. long -> int");
        long longNumber7 = 123_456L;
        int intNumber7 = (int) longNumber7;
        System.out.println(longNumber7 + " " + intNumber7);

        // TEMA: conversia de la double -> int
        System.out.println("8. double -> int");
        double doubleNumber8 = 5.9;
        int intNumber8 = (int) doubleNumber8;
        System.out.println(doubleNumber8 + " " + intNumber8);

    }
}
