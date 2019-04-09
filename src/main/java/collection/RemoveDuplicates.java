package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "x", "y", "z"));
        removeDuplicatesFromSingleList(numbersList);
        removeDuplicatesInTwoLists(listOne, listTwo);

    }

    public static void removeDuplicatesFromSingleList(ArrayList<Integer> numbersList) {
        System.out.println("List containing duplicates: " + numbersList);

        HashSet<Integer> hashSet = new HashSet<>(numbersList);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }


    public static void removeDuplicatesInTwoLists(ArrayList<String> listOne, ArrayList<String> listTwo) {

        List<String> listTwoCopy = new ArrayList<>(listTwo);
        System.out.println("listOne BEFORE adding different elements from listTwo:\t"+listOne);
        System.out.println("Elements of listTwo:\t"+listTwo);
        listTwoCopy.removeAll(listOne);
        System.out.println("Elements which are in listTwo and not in listOne are:\t"+listTwoCopy);
        listOne.addAll(listTwoCopy);
        System.out.println("listOne AFTER adding different elements from listTwo:\t"+listOne);
    }
}