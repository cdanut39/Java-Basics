package generics.genericclass;


class MyClass<T> {
    T ob;

    MyClass(T o1) {
        ob = o1;
    }

    T getob() {
        return ob;
    }
}

class MySubclass<T, V> extends MyClass<T> {
    V ob2;

    MySubclass(T o1, V o2) {
        super(o1);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}

public class MainExtendGenericClass {
    public static void main(String args[]) {
        MySubclass<String, Integer> x = new MySubclass<>("Value is: ", 99);
        String key=x.getob();
        int value=x.getob2();
        System.out.print(key);
        System.out.println(value);
    }

}
