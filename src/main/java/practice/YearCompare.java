package practice;

import java.util.Comparator;

public class YearCompare implements Comparator<SedanCar> {

    @Override
    public int compare(SedanCar car1, SedanCar car2) {
        if(car1.getYear()>car2.getYear()){
            return 1;
        }
        else if(car1.getYear()<car2.getYear()){
            return -1;
        }
        else
            return 0;
    }
}
