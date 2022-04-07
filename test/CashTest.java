import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {
    @Test
    public void befninehalf() {
        var c = new Cash();
        LocalTime t1 = LocalTime.of(6, 30, 00);
        assertEquals(5000.0, c.fullorsave(t1));
    }

    @Test
    public void betfoursevenhalf() {
        var c = new Cash();
        LocalTime t2 = LocalTime.of(16, 30, 00);
        assertEquals(5000.0, c.fullorsave(t2));
    }

    @Test
    public void betninehalffour() {
        var c = new Cash();
        LocalTime t3 = LocalTime.of(12, 00, 00);
        assertEquals(4000.0, c.fullorsave(t3));
    }

    @Test
    public void afsevenhalf() {
        var c = new Cash();
        LocalTime t4 = LocalTime.of(22, 30, 00);
        assertEquals(4000.0, c.fullorsave(t4));
    }

    @Test
    public void ninehalf() {
        var c = new Cash();
        LocalTime t4 = LocalTime.of(9, 30, 00);
        assertEquals(4000.0, c.fullorsave(t4));
    }

    @Test
    public void four() {
        var c = new Cash();
        LocalTime t4 = LocalTime.of(16, 00, 00);
        assertEquals(4000.0, c.fullorsave(t4));
    }

    @Test
    public void sevrnhalf() {
        var c = new Cash();
        LocalTime t4 = LocalTime.of(19, 30, 00);
        assertEquals(5000.0, c.fullorsave(t4));
    }

}