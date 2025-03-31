package task1;
/* Write an application that will read diameter of a circle (variable of type float)
and calculate perimeter of given circle.
Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
input = 12
Solution
out put rezultat perimetru = diametru*pi

// clasa = locul unde scrii un cod compilabil

clase ce executie -Runneabel Class - clasa care are in interior o metoda de executie "main": - scurtatura - "psvm"




clase de obiect - ObjectClass - ofera o definitie a unui concept;
ne permite sa definim caract unui obiect fie el palpabil (masina) sau abstract


*/


import java.util.Scanner;

public class CirclePerimeter {
    //clase ce executie -Runneabel Class - clasa care are in interior o metoda de executie;
    // "main": - scurtatura - "psvm"
    public static void main(String[] args) {
        //prescurtare pt met de afisare - "sout"


        System.out.println("Hi! My name its Dave");
// Input - citirea datelor de intrare de la consola



        Scanner scanner = new Scanner(System.in);
        // print nu coboara pe randul urmator
        System.out.print("introduceti valoarea diametrului: ");
        float diameter = scanner.nextFloat(); // se va uita pe streamulde intrare (consola) si va prelua inf de la tastatura
        System.out.println("Diametrul citit este:"+diameter+"\n");

        //Algoritm - calculam perimetrul - partea de algoritm
        //definirea manuala a lui PI
        float piManual = 3.14f;
        float perimeterManual = piManual *diameter;

        float piClass = (float) Math.PI;
        float perimeterClass = piClass*diameter;

        double perimeterDouble = Math.PI*diameter;
        System.out.println("Perimetrul calculat  pi definit manual este: " + perimeterManual);
        System.out.println("Perimetrul calculat  pi definit prin Clasa este: " + perimeterClass);
        System.out.println("Perimetrul calculat  pi definit prin Clasa este: " + perimeterDouble);

        //Ctr+clic st - pt intr


        //Output afisam rezultatul in urma algoritmului
        // inchideti Streamul de afisare
        //scanner.close();








    }


}
