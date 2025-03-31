package com.sda.oop;

public class Product {
    // campuri = variabilele de instanta = caracteristicile care definesc obiectele
    // campurile dau starea obiectelor
    private String name;
    private double price;
    private int quantity;
    private boolean isAvailable;

    //camp cu valoare constanta
    // ststic - caracteristica comuna tuturor obiectelor clasei (tine de clasa nu de obiect)
    // final - indica faptul ca  valoarea nu mai poate fi modificata dupa initializare
public static final int VAT = 19;


    // constructor
    // metoda specializata pentru crearea obiectelor
    // this = instanta obiectului curent
    public Product(String name, double price, int quantity, boolean isAvailable) {
        this.name = name;
        setPrice(price);
        if (price>0){
            this.price = price;
        }
        this.price = price;
        setPrice(price);
        if (quantity >= 0) {
            this.quantity = quantity;
        }
        this.isAvailable = isAvailable;
    }

    public Product() {
        this.name = "N/A";
    }

    // setteri = metode pentru actualizarea valorilor campurilor
    // getteri = metode pentru preluarea valorilor campurilor
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price> 0){
        this.price = price;
    }

    public int getQuantity;() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // comportamentele = metodele
    public void discount(int discount) {
        // TEMA: calculati discountul folosind procentul de discount definit ca parametru in metoda
        if (discount < 0 || discount > 100) {
            System.out.println("Discount incorect");
        }
        price = price - (price * discount / 100);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

