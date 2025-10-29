import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = input.nextDouble();

        
        final double OVERTIME_MULTIPLIER = 1.5;
        final double REGULAR_HOURS = 40.0;
        final double MAX_RATE = 200.00;

        
        if (payRate > MAX_RATE) {
            System.out.println("Error: Pay rate cannot exceed " + MAX_RATE);
            input.close();
            return;
        }
        double regularPay;
        double overtimePay = 0.0;

        if (hoursWorked > REGULAR_HOURS) {
            regularPay = REGULAR_HOURS * payRate;
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            overtimePay = overtimeHours * payRate * OVERTIME_MULTIPLIER;
        } else {
            regularPay = hoursWorked * payRate;
        }
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
    }
}
