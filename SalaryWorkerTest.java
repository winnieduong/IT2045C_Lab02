import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Doe", "456", "Ms.", 1985, 25.0, 52000.0);
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Doe", "456", "Ms.", 1985, 25.0, 52000.0);
        salaryWorker.displayWeeklyPay(40);
    }
}
