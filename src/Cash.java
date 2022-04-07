import java.time.LocalTime;

public class Cash {

    public double fullorsave(LocalTime time1) {
        LocalTime t = LocalTime.of(9,30,00);
        LocalTime t1 = LocalTime.of(16,01,00);
        LocalTime t2 = LocalTime.of(19,31,00);
        if (time1.isBefore(t)) {
            return 5000;
        } else if (time1.isBefore(t1)) {
            return 5000*0.8;
        } else if (time1.isBefore(t2)) {
            return 5000;
        } else  {
            return 5000*0.8;
        }


    }
}
