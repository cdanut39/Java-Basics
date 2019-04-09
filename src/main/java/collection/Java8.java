package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8 {
    public static void main(String[] args) {
//        int[] integerList = new int[10];
//        Arrays.setAll(integerList, i -> i);


        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();
        System.out.println();

        String[] fruits = {"apple", "banana", "peach", "strawberry", "cherry", "avocado", "apricot", "pineapple"};

        System.out.println("\nStarts with a");
        Arrays.stream(fruits).filter(x -> x.startsWith("a")).sorted().forEach(x -> System.out.printf("-%s\n", x));


        List<String> fruits_startsWithA = Arrays.stream(fruits).filter(x -> x.startsWith("p")).sorted().collect(Collectors.toList());
        System.out.println("\nStarts with p");
        fruits_startsWithA.stream().forEach(x -> System.out.printf("-%s\n", x));
        System.out.println("\nContaining \"erry\"");

        Arrays.stream(fruits).filter(f -> f.contains("erry")).forEach(x -> System.out.printf("-%s\n", x));

        System.out.println();
        System.out.println("\nSorted and uppercase");

        Arrays.stream(fruits).map(String::toUpperCase).sorted().forEach(x -> System.out.printf("-%s\n", x));

        System.out.println("\nSorted in reverse order");
        Arrays.stream(fruits).sorted(Comparator.reverseOrder()).forEach(x -> System.out.printf("-%s\n", x));

        System.out.println("\nLongest word is: " + Arrays.stream(fruits).max(Comparator.comparing(String::length)).get());

        System.out.println("\nThe elements with length more than 6 characters are: ");
        Arrays.stream(fruits).filter(x -> x.length() > 6).forEach(x -> System.out.printf("-%s\n", x));

        System.out.println("\nSorting elements by length: ");
        Arrays.stream(fruits).sorted(Comparator.comparing(String::length)).forEach(x -> System.out.printf("-%s\n", x));



    }

}
