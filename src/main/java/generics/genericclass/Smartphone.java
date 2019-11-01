package generics.genericclass;

public class Smartphone<T1, T2> extends Phone<T1,T2> {

    public Smartphone() {
        super();
    }

    public Smartphone(String phoneImei, T1 brand, T2 screenSize) {
        super(phoneImei, brand, screenSize);
    }

    @Override
    public String getPhoneImei() {
        return super.getPhoneImei();
    }

    @Override
    public void setPhoneImei(String phoneImei) {
        super.setPhoneImei(phoneImei);
    }

    @Override
    public T1 getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(T1 brand) {
        super.setBrand(brand);
    }

    @Override
    public T2 getScreenSize() {
        return super.getScreenSize();
    }

    @Override
    public void setScreenSize(T2 screenSize) {
        super.setScreenSize(screenSize);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
