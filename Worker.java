public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hourlyPayRate * hoursWorked;
        } else {
            double regularPay = hourlyPayRate * 40;
            double overtimePay = hourlyPayRate * 1.5 * (hoursWorked - 40);
            return regularPay + overtimePay;
        }
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = hourlyPayRate * regularHours;
        double overtimePay = hourlyPayRate * 1.5 * overtimeHours;

        System.out.printf("Regular Hours: %.2f, Regular Pay: %.2f, Overtime Hours: %.2f, Overtime Pay: %.2f, Total Pay: %.2f%n",
                regularHours, regularPay, overtimeHours, overtimePay, regularPay + overtimePay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toXML() {
        return "<worker>" + super.toXML() + "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate></worker>";
    }

    @Override
    public String toJSON() {
        return "{" + super.toJSON() + ", \"hourlyPayRate\": " + hourlyPayRate + "}";
    }
}
