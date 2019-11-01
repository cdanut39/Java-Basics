package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSedanCar {

    public static void main(String[] args) {
        ArrayList<SedanCar> cars = new ArrayList<>();

        SedanCar audi = new SedanCar("Audi", "A4", 210, Color.BLACK, 175, 2016);
        SedanCar bmw = new SedanCar("BMW", "520d", 220, Color.GREY, 190, 2014);
        SedanCar mercedes = new SedanCar("Mercedes", "E220", 200, Color.BLUE, 180, 2019);
        SedanCar vw = new SedanCar("VW", "Passat", 190, Color.RED, 140, 2010);

        cars.add(audi);
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(vw);
        sortByYear(cars);
        sortByMaxSpeed(cars);

        sortByPower(cars);
    }

    private static void sortByPower(ArrayList<SedanCar> cars) {
        System.out.println("Sorting by power using Lambda");
        cars.sort((SedanCar car1, SedanCar car2)->car1.getHorsePower()-car2.getHorsePower());
        cars.forEach(car->System.out.println(car.getName()+" - "+car.getHorsePower()));
    }


    private static void sortByYear(ArrayList<SedanCar> cars) {
        YearCompare compareByYear = new YearCompare();
        Collections.sort(cars, compareByYear);

        System.out.println("Sorting by year asc using external Comparator class");
        for (SedanCar car : cars) {
            System.out.println(car.getName() + " -" + car.getYear());
        }
    }

    private static void sortByMaxSpeed(ArrayList<SedanCar> cars) {
        Comparator<SedanCar> compareByMaxSpeed = new Comparator<SedanCar>() {
            @Override
            public int compare(SedanCar car1, SedanCar car2) {
                if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
                    return 1;
                } else if (car1.getMaxSpeed() < car2.getMaxSpeed()) {
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(cars, compareByMaxSpeed);
        System.out.println("Sorting by maxSpeed asc with inner Class");
        for (SedanCar car : cars) {
            System.out.println(car.getName() + " -" + car.getMaxSpeed());
        }
    }


}
