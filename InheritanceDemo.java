import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Creating Workers
        Worker worker1 = new Worker("John", "Doe", "123", "Mr.", 1990, 20.0);
        Worker worker2 = new Worker("Jane", "Doe", "456", "Ms.", 1992, 25.0);
        Worker worker3 = new Worker("James", "Smith", "789", "Mr.", 1985, 30.0);

        // Creating Salary Workers
        SalaryWorker salaryWorker1 = new SalaryWorker("Michael", "Jordan", "234", "Mr.", 1963, 0, 52000);
        SalaryWorker salaryWorker2 = new SalaryWorker("Sarah", "Connor", "567", "Ms.", 1984, 0, 78000);
        SalaryWorker salaryWorker3 = new SalaryWorker("Clark", "Kent", "890", "Mr.", 1978, 0, 104000);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        // Simulating 3 weekly pay periods
        double[] hours = {40, 50, 40};

        for (int week = 0; week < hours.length; week++) {
            System.out.println("Week " + (week + 1) + ":");
            for (Worker worker : workers) {
                worker.displayWeeklyPay(hours[week]);
            }
            System.out.println();
        }
    }
}
