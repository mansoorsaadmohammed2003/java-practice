import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class data_time {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate date1=LocalDate.of(9999,12,10);
        System.out.println(date);
        System.out.println(date1);

        LocalTime time=LocalTime.now();
        LocalTime time1=LocalTime.of(21,35,20);
        System.out.println(time);
        System.out.println(time1);

        LocalTime t=LocalTime.now(ZoneId.of("Europe/Luxembourg"));
        System.out.println(t);

        // for (String i : ZoneId.getAvailableZoneIds()) {
        //     System.out.println(i);
        // }
        for(int i=0;i<time.length;i++){
            System.a
        }
    }
}
