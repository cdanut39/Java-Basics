package generics.genericclass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Phone<T1, T2> {

    String phoneImei;
    T1 brand;
    T2 screenSize;

    public Phone() {

    }

    public Phone(String phoneImei, T1 brand, T2 screenSize) {
        this.phoneImei = phoneImei;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getPhoneImei() {
        return phoneImei;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    public T1 getBrand() {
        return brand;
    }

    public void setBrand(T1 brand) {
        this.brand = brand;
    }


    public T2 getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(T2 screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneImei='" + phoneImei + '\'' +
                ", brand=" + brand +
                ", screenSize=" + screenSize +
                '}';
    }

    public <T1> Set<T1> addPhonesAndDisplay(Set<T1> phones) {
        Set<T1> result = phones;
        Iterator<T1> itr=result.iterator();
        while(itr.hasNext()){
           T1 phone= itr.next();
            System.out.println(phone.toString());
        }

        return result;

    }
}
