public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.printf("Weekly Salary: %.2f%n", calculateWeeklyPay(hoursWorked));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML() {
        return "<salaryWorker>" + super.toXML() + "<annualSalary>" + annualSalary + "</annualSalary></salaryWorker>";
    }

    @Override
    public String toJSON() {
        return "{" + super.toJSON() + ", \"annualSalary\": " + annualSalary + "}";
    }
}
