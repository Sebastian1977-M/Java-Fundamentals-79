
package com.sda.oop;

public class MainProduct {
    public static void main(String[] args) {
        // crearea obiectelor clasei Product
        // instantierea = atribuirea de valori concrete pentru campurile clasei cu scopul de a crea obiectul
        Product frigider = new Product();
        System.out.println(frigider);

        Product masinaDeSpalat = new Product("Masina de spalat Beko",1500,10,true);
        System.out.println(masinaDeSpalat);

        // accesarea si modificarea membrilor clasei
        masinaDeSpalat.discount(10);

        // varianta de dinaintea incapsularii
//        System.out.println(masinaDeSpalat.price);
//        frigider.name = "Frigider la promotie";
//        frigider.quantity = -100;
//        System.out.println(frigider);

        System.out.println(masinaDeSpalat.getPrice());
        System.out.println(frigider.getName());
        frigider.setName("Frigider la promotie");
        frigider.setQuantity(0);
        System.out.println(frigider);
        Product masinaDeSpalat = new Product("Hota Electrolux",-700,-31,false);
        System.out.println(Hota);

// un membru static nu are nevoie de un obiect pentru a putea fi apelat
        // un membru static se apeleaza prin numele Clasei
        //un membru non static (de instanta) se apeleaza prin numele Obiectului
        System.out.println("Valoare standard TVA="+ Product.VAT);


    }
}

/*
principii oop:
incapsulare - campurile private
mostenire
polimorfismul
abstractizarea
 */
