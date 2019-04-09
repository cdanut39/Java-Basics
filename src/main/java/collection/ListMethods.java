package collection;

import java.util.*;

public class ListMethods {

    public static void main(String[] args) {
    loopWithIterator();
    }

    public static void loopWithIterator() {
        List<String> list1 = new ArrayList<>();
        {
            list1.add("red");
            list1.add("black");
            list1.add("blue");
            list1.add("yellow");

//            Collections.sort(list1);
            Collections.sort(list1,Collections.reverseOrder());
            Iterator<String> it = list1.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

    }
}
