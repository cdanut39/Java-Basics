package generics.genericclass;

import java.util.HashSet;
import java.util.Set;

public class User {

    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        Samsung s2=new Samsung();
        Set<Samsung> samsungSet=new HashSet<>();
        samsungSet.add(s1);
        samsungSet.add(s2);
        Phone<Samsung, Double> phone = new Phone<>("ASD124324A", s1, 5.6);
        Double phoneScreenSize = phone.getScreenSize();
        System.out.println(phoneScreenSize);
        Set<Samsung> samsungs=phone.addPhonesAndDisplay(samsungSet);
//        Set<Integer> intsa=phone.addPhonesAndDisplay(integers);
        samsungs.toArray();


    }
}
