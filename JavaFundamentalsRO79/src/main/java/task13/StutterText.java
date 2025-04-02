package task13;

import java.util.Scanner;

/*
Write an application that "stutters", that is, reads the user's text (type String),
and prints the given text, in which each word is printed twice.
For example, for the input: "This is my test" the application should print "This This is is my my test test".

Input
String line = "This is my test"
Algoritm
- citim sub forma de linie si split intr-unn array de string unde indexam fiecare cuvand
- in mod repetitiv o sa construim un nou string repetand fiecare cuvant de pe pzitia curenta


Output
"This This is is my my test test"




*/
public class StutterText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un text: ");
        String input = scanner.nextLine();

        String[] cuvinteArray = input.split(" ");
        System.out.println("array-ul de cuvinte este " + cuvinteArray);

        StringBuilder cuvinteDuplicate = new StringBuilder();//builder este o clasa obiecte care returneaza
        for (int i = 0; i < cuvinteArray.length; i++) {
            cuvinteDuplicate
                    .append(cuvinteArray[i])
                    .append(" ")
                    .append(cuvinteArray[i])
                    .append(" ");
            System.out.println("i = " + i + " " + cuvinteDuplicate.toString());

        }
        System.out.println(cuvinteDuplicate.toString().trim());// trim elimina spatiul alb din final

    }
}
