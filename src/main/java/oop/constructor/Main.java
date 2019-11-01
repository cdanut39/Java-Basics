package oop.constructor;

public class Main {
    public static void main(String[] args) {
        Constructor constructor=new ChildConstructor();
        ChildConstructor childConstructor=new ChildConstructor();
        System.out.println(constructor.getA());
        System.out.println(childConstructor.getA());
        System.out.println(childConstructor.getAfromChildClass());
    }
}
