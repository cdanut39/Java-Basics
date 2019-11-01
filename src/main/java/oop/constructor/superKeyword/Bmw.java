package oop.constructor.superKeyword;

public class Bmw {

    int maxSpeed;
    public static final String name="BMW";
    String model;

    public Bmw() {
        System.out.println("Inside default constructor -Parent class");
    }

    public Bmw(int maxSpeed, String model) {
        System.out.println("Inside parametrized constructor -Parent class");
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

}
