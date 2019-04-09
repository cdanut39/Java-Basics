package collection;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> listOnCondition = new LinkedList<>();
        names.add("Cristi");
        names.add(1, "Danut");
        names.add("Matei");
        names.add(3, "Mircea");
        names.add("Vasile");
        names.add(0, "Mihai");
        names.add(1, "Georgian");
        names.add("Mihai");
        System.out.println("Iterating with get(): ");
        iterateUsingGet(names);
        System.out.println("\nIterating with forEach: ");
        iterateUsingForEach(names);
        System.out.println("\nIterating with iterator: ");
        iterateUsingIterator(names);
        System.out.println("\nIterating using Java 8: ");
        iterateUsingJava8(names);
        System.out.println("\nAdd in a new list based on a condition");
        addInListOnCondition(names, listOnCondition);
        System.out.println("\nRemove from list based on a condition");
        removeOnCondition(names,"Mihai");
        System.out.println("\nAfter replacing last element");
        replaceLast(names, "ReplacedName");
        System.out.println("\nAfter swapping first and last elements");
        swapTwoElements(names, 0, names.size()-1);

    }

    public static void iterateUsingGet(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println("-" + names.get(i));
        }
    }

    public static void iterateUsingForEach(List<String> names) {
        for (String name : names) {
            System.out.println("-" + name);
        }
    }

    public static void iterateUsingIterator(List<String> names) {
        Iterator it = names.iterator();
        while (it.hasNext()) {
            System.out.println("-" + it.next());
        }
    }

    public static void iterateUsingJava8(List<String> names) {
        names.forEach(name -> System.out.println("-" + name));
    }

    public static void replaceLast(List<String> names, String name) {
        names.set(names.size() - 1, name);
        System.out.println(names);
    }

    public static void addInListOnCondition(List<String> names, List<String> listOnCondition) {
        names.stream().filter(name -> name.startsWith("M")).forEach(listOnCondition::add);
        System.out.println(listOnCondition);
    }

    public static void removeOnCondition(List<String> listOnCondition, String name) {
        listOnCondition.removeIf(x -> x.equals(name));
        System.out.println(listOnCondition);
    }

    public static void swapTwoElements(List<String> names, int i, int j){
        Collections.swap(names,i,j);
        System.out.println(names);
    }
}
