package java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5, 4, 2, -6, 8, 5);
        example1(ints);
        example2(ints);
        example3(ints);
        example4(ints);
        example5(ints);
        System.out.println(LocalDate.now());


    }

    public static void example1(List<Integer> list) {
        int reduce = list.stream().distinct().reduce(0, Integer::sum);
        System.out.println(reduce);
    }

    public static void example2(List<Integer> list) {
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        list.stream().sorted().distinct().forEach(System.out::print);

    }

    public static void example3(List<Integer> list) {
        int result = list.stream().filter(x -> x % 2 == 0).findAny().orElse(0);
        System.out.println("\n" + result);
    }

    public static void example4(List<Integer> list) {
        boolean result = list.stream().allMatch(x -> x > 0);
        System.out.println("\n" + result);
    }

    public static void example5(List<Integer> list) {
        int max = list.stream().max(Comparator.comparingInt(Integer::valueOf)).orElse(Integer.MAX_VALUE);
        System.out.println("\n" + max);
    }

}
