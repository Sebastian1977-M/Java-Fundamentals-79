package com.sda.oop;

public class Dog {
    private String breed;
    private String color;
    private int age;
    private double size;
    private boolean sterilized;

    public static final int LIFE_EXPECTANCY = 18;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public Dog(String breed, String color, int age, double size, boolean sterilized) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.size = size;
        this.sterilized = sterilized;

public void eat() {
            if (sterilized)
                System.out.println("mancare de catei sterilizati")
        } else{
            System.out.println("mancare de catei nesterilizati");
        }
        public String bark () {
            return "Ham Ham"
        }
public void sleep (hours + "" + age int age, int LIFE_EXPECTANCY)
        }
    }
}
@Override
public String toString() {
    return "Dog{" +
            "breed ='" + breed + '\'' +
            ", colors=" + colors+
            ", age=" + age +
            ", size =" + size +
            ", sterilized=" + sterilized+
            '}';