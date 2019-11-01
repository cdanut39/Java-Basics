package oop.constructor.thisKeyword;


public class Person {

    int age;
    String name;

    public Person() {
        this("C");
        System.out.println("Default constructor");
    }

    public Person(int age) {
        this.age = age;
        System.out.println("Constructor with Integer param: " + age);
    }

    public Person(String name) {
        this.name=name;
        System.out.println("Constructor with String param: " + name);
    }

    public Person(String name, int age) {
        this(age);
        this.name = name;
        System.out.println("Constructor with String: " + name + " and Integer param: " +age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "i=" + age +
                ", s='" + name + '\'' +
                '}';
    }
}
