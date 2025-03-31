package task2;

/*
Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
Your application should read two variables: weight (in kilograms, type float) and height (in centimeters, type int).
BMI should be calculated given following formula: BMI = weight/height ^2
The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.

input Weight, height
The optimal BMI range is from 18.5 to 24.9, smaller or larger value it"s not-optimal
Your program should write "BMI Optimal" or BMI not Optimal

Algoritm convertim height din m in cm
calculam BMI dupa formula

Output verificam daca BMI e in intervalul inchis

*/

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

// citire

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti valoarea greutatii in kg ");
        double weight = scanner.nextDouble();
        System.out.print("Introduceti valoarea inaltimii in cm ");
        double height = scanner.nextDouble();


        //Algoritm

        // todo: extrageti calcul BMI intr-o metoda care sa intoarca un double - ii dam parametri 2 variabile
        double heightInMeters = height/100;
        double bmi = weight/Math.pow(heightInMeters,2);//heightInMeters
        double bmi2 = weight/Math.pow(height/100,2);


        //Afisare
        //todo:extrageti verificarea conditionala intr-o metoda care sa intoarca un boolean
        //todo: utilizati switch in loc de if

        if (bmi>=18.5 && bmi<=24.9) {
            System.out.println("BMI its optimal ->" + bmi);

        } else {
            System.out.println("BMI its not optimal ->" + bmi);
        }

    }
}
