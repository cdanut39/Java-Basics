package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "peach", "strawberry", "cherry", "avocado", "apricot", "pineapple"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "peach", "strawberry", "cherry", "avocado", "apricot", "pineapple"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("banana", "apple", "peach", "strawberry", "cherry", "avocado", "apricot", "pineapple"));

        if (list1.equals(list2)) {
            System.out.println("Liste egale");
        } else {
            System.out.println("Liste diferite");
        }

        if (list1.equals(list3)) {
            System.out.println("Liste egale");
        } else {
            System.out.println("Liste diferite");
        }
    }
}
