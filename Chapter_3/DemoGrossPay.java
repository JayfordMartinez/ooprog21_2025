import java.util.Scanner;

class DemoGrossPay{

    
    public static void computeTotalEarnings(double workedHours){
        final double RATE_PER_HOUR = 22.75;
        double totalPay = workedHours * RATE_PER_HOUR;
        System.out.printf("Total Earnings: $%.2f\n", totalPay);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input the hours worked: ");
        double workedHours = input.nextDouble();

        computeTotalEarnings(workedHours);
        input.close();
    }
}
