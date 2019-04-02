package Session8;
import java.time.*;
import java.util.ArrayList;
public class Leapyear {
    public static void Leap2(){
        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("1900-01-01"));
        for (int i=0; i<11; i++) {
            if (dates.get(i).isLeapYear()) {
                System.out.println(dates.get(i).getYear() + " la nam nhuan tinh theo cach 2");
            }
            dates.add(dates.get(i).plusYears(1));
        }
    }

    public static void Leap(){
        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("1900-02-28"));
        while (dates.get(0).getYear() <1910) {
            LocalDate check = dates.get(0).plusDays(1);
            if (check.getDayOfMonth() == 29) {
                System.out.println(dates.get(0).getYear()+" la nam nhuan");
            }
            LocalDate next = dates.get(0).plusYears(1);
            dates.clear();
            dates.add(next);
        }
//        LocalDate ngay = LocalDate.of(2010, 2, 28);
//        ngay = ngay.plusYears(1);
    }

    public static void main(String[] args){
        //Leap();
        Leap2();
    }
}
