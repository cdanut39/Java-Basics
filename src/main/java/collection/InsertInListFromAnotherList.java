package collection;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class InsertInListFromAnotherList {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>(Arrays.asList("+", "+", "Marfin Bank", "+", "+", "Bank Leumi", "+", "Credit Agricole", "+","+", "UniCredit Bank", "Piraeus Bank"));
        List<String> listB = new ArrayList<>(Arrays.asList("CEC Bank", "Banca Transilvania", "Raiffeisen Bank", "Banca Romaneasca", "BCR", "ING Bank", "BRD"));
        List<String> rates = new ArrayList<>(Arrays.asList("1.685,2", "1.694,8", "1.694,8", "1.694,8", "1.757,9", "1.698,5", "1.702,6", "1.749,3",
                "1.702,6", "1.745,3", "1.757,8", "1.809,6"));

        for (int b = 0; b < listB.size(); b++) {
            for (int a = 0; a < listA.size(); a++) {
                if (listA.get(a).equals("+")) {
                    listA.set(a, listB.get(b));
                    listB.remove(b);
                }
            }
        }
        System.out.println(listA.size());
        System.out.println("All banks: " + listA);


        System.out.println(rates.size());
        System.out.println("Monthly rates: " + rates);

        List<String> doubles = keepOnlyNumbers(rates);
        List<String> doubles1 = removeLastCharacter(doubles);
        List<Integer> integers = getIntegers(doubles1);

        Map<String, Integer> map = new LinkedHashMap<>();
        Iterator<String> it1 = listA.iterator();
        Iterator<Integer> it2 = integers.iterator();
        while (it1.hasNext() && it2.hasNext()) {
            map.put(it1.next(), it2.next());
        }

        System.out.println(map);

        Map<String, Integer> sorted = sortByValue(map);
        Iterator<String> countryIterator1 = sorted.keySet().iterator();
        System.out.println();
        while (countryIterator1.hasNext()) {
            String bank = countryIterator1.next();
            System.out.printf(" %-30.30s %-30.30s%n ",bank,sorted.get(bank) );
        }

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        LinkedHashMap<String, Integer> collect = map
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));
        return collect;
    }

    private static List<Integer> getIntegers(List<String> doubles1) {
        List<Integer> integers=new LinkedList<>();
        for(String s:doubles1){
            int i=Integer.parseInt(s);
            integers.add(i);
        }
        return integers;
    }

    private static List<String> keepOnlyNumbers(List<String> rates) {
        List<String> doubles=new LinkedList<>();
        for (String s : rates) {
            if (s.contains(".")||(s.contains(","))) {
                doubles.add(s.replaceAll("\\D", ""));
            }
        }
        return doubles;
    }

    private static List<String> removeLastCharacter(List<String> doubles) {
        List<String> doubles1=new LinkedList<>();
        for (String s:doubles){
            int i = s.length() - 1;
            String substring = s.substring(i);
            s = s.replace(substring, "");
            doubles1.add(s);
        }
        return doubles1;
    }
}