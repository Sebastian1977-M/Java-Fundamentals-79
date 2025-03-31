package com.sda.variables;

public class ConversionExample {
    public static void main(String[] args) {

        System.out.println("int -> byte"); // interval valori byte (-128; 127)
        int intNumber = 200;
        byte byteNumber = (byte) intNumber;
        System.out.println(intNumber + " " + byteNumber);

        // 200 - 128 = 72
        // 72 - 128 = -56

        // explicatie pe biti

        // transformam numarul 200 in baza 2 (impartim repetat la 2 si luam resturile de jos in sus): 1100 1000
        // un numar int este scris pe 32 de biti
        // 0000 0000 0000 0000 0000 0000 1100 1000
        // un numar byte este scris pe 8 biti
        // 1100 1000

        // primul bit de la stanga se numeste bitul de semn -> 0 - numar pozitiv; 1 - numar negativ
        // transformam numarul 1100 1000 din baza 2 in baza 10 folosind complementul 1, apoi complementul 2
        // 1. complement 1 = transformam 1 in 0 si 0 in 1:
        // 1100 1000 => 0011 0111
        // 2. complement 2 = adaugam 1 la complementul 1:
        // 0011 0111 + 1 = 0011 1000

        // fiecare bit reprezinta o putere a lui 2
        // 2^7  2^6  2^5  2^4  2^3  2^2  2^1  2^0
        //  0    0    1    1    1    0    0    0   = 2^5 + 2^4 + 2^3 = 32 + 16 + 8 = 56
        // pentru ca bitul de semn a fost initial 1 => -56
    }
}
