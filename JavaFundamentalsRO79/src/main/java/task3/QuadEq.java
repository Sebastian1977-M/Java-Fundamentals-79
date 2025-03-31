package task3;

import java.util.Scanner;

/*
Write a program for solving a quadratic equation.
 The program should take three integers (coefficients of the quadratic equation a, b, c)
 and calculate the roots of the equation a * x^2 +b*x +c = 0


 If delta ∆ comes out negative, print "Delta negative" and exit the program.
 Formulas you'll' need:

 - delta = b^2 -4*a*c
  - x1 = (-b - radical (delta)) / 2*a
  - x2 = (-b + radical (delta)) / 2*a

  Input a,b.c,

  Algoritm:
  - calcul delta
  - calcul x1; x2
  -

  Output:
  x1, x2, delta
  inlocuiti valorile cu rezultatele obtinute pentru a verifica egalitatea cu 0


 */
public class QuadEq {
    //psvm
    public static void main(String[] args) {

        // citire

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti valoarea coeficientului a:" );
        double a = scanner.nextDouble();

        System.out.print("Introduceti valoarea coeficientului b:" );
        double b = scanner.nextDouble();

        System.out.print("Introduceti valoarea coeficientului c:" );
        double c = scanner.nextDouble();


        //algoritm
        double delta = Math.pow(b, 2) - 4 * a * c;

        if(delta<0) {
            System.out.println("delta este negativ");
            return;
        }

        double x1, x2;
        if (delta==0) {
            x1 = x2 = (-b) / 2 * a;
        } else{
            x1 = (-b - +Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }



        //afisare

        System.out.println("Delta: " + delta);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

        double eq1 = a * Math.pow(x1, 2) + b * x1 + c;
        double eq2 = a * Math.pow(x2, 2) + b * x2 + c;
        if (eq1 == 0 && eq2 == 0){
            System.out.println("E bine: " + eq1 + "" + eq2);
    } else {
            System.out.println("Nu e bine" + eq1 + eq2);
        }


    }


}
