package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMethods {

    public static void main(String[] args) {
        arrays_fill();
        arrays_setAll();
        arrays_asList();
    }

    public static void arrays_fill() {
        System.out.println("arrays.fill():");
        int[] a = new int[5];
        Arrays.fill(a, 10);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void arrays_setAll() {
        System.out.println("arrays.setAll():");
        int[] a = new int[5];
        Arrays.setAll(a, i -> i);
        Arrays.toString(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
    }

    public static void arrays_asList() {
        System.out.println("arrays.asList():");
        String[] stringArray = new String[]{"foo", "bar", "baz"};
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        stringList.remove("foo");
        for (String s : stringList) {
            System.out.println(s);
        }

    }
}
