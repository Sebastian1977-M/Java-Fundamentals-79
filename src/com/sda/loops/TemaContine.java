package com.sda.loops;

import java.util.Scanner;

public class TemaContine {
    public static void main(String[] args) {
        int min = 1;
        int max = 27;
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                System.out.println("Numarul par este = " + i);
            }
        }
    }
}