import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "123", "Mr.", 1990, 20.0);
        assertEquals(800.0, worker.calculateWeeklyPay(40), 0.01);
        assertEquals(950.0, worker.calculateWeeklyPay(45), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "123", "Mr.", 1990, 20.0);
        worker.displayWeeklyPay(40);
        worker.displayWeeklyPay(50);
    }
}
