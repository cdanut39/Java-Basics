package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Cristi");
        names.add("Danut");
        names.add("Matei");
        names.add("Mircea");
        names.add("Vasile");
        names.add("Mihai");
        names.add("Georgian");
        System.out.println(names);
        System.out.println(((TreeSet<String>) names).ceiling("Vasile"));
    }

}
