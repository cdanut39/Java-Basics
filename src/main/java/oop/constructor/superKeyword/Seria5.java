package oop.constructor.superKeyword;

public class Seria5 extends Bmw{
    String HeadUpDisplay;

    public Seria5(int maxSpeed, String model) {
        /**
         * by default orice constructor va avea o prima linie super(), ce va apela constructorul default din clasa parinte si din aceasta cauza se afiseaza
         * Inside default constructor -Parent class
         * Inside parametrized constructor -child class
         */
//        super(maxSpeed, model);
        System.out.println("Inside parametrized constructor -child class");
    }

    public Seria5() {
        System.out.println("Inside default constructor -Child class");
    }

    public Seria5(int maxSpeed, String model, String HUD) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        HeadUpDisplay = HUD;
    }
}

class Main {
    public static void main(String[] args) {
        Bmw bmw=new Seria5(250,"520d");
    }
}