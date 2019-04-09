package collection;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;

public class MapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> integerValues = new LinkedHashMap<>();
        integerValues.put("A", 10);
        integerValues.put("D", 1);
        integerValues.put("B", 100);
        integerValues.put("C", 0);
        System.out.print("Max value is: ");
        maxValue(integerValues);
        System.out.print("The keys are: ");
        takeKeys(integerValues);
        System.out.print("The values are: ");
        takeValues(integerValues);
        System.out.print("Printing the map in simple way: ");
        printMap(integerValues);
        System.out.println("Printing the map: ");
        printMapUsingEntrySet(integerValues);
        System.out.println("Printing the map: ");
        printMapUsingKey(integerValues);
        System.out.println("Keeping only distinct values");
        sortByValue(integerValues);
    }

    public static void maxValue(LinkedHashMap<String, Integer> map) {
        System.out.println(map.entrySet().stream().max(comparingByValue()).get());
    }

    public static void takeKeys(LinkedHashMap<String, Integer> map) {
        System.out.println(map.keySet());
    }

    public static void takeValues(LinkedHashMap<String, Integer> map) {
        System.out.println(map.values());
    }

    public static void printMap(LinkedHashMap<String, Integer> map) {
        System.out.println(map);
    }

    public static void printMapUsingEntrySet(LinkedHashMap<String, Integer> map) {
        int x = 0;
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key_" + x + " : " + entry.getKey() + " \tvalue_" + x + " : " + entry.getValue());
            x++;
        }
    }

    public static void printMapUsingKey(LinkedHashMap<String, Integer> map) {
        int x = 0;
        for (String key : map.keySet()) {
            System.out.println("key_" + x + " : " + key + " \tvalue_" + x + " : " + map.get(key));
            x++;
        }
    }

    public static void sortByValue(LinkedHashMap<String, Integer> map) {
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

}
