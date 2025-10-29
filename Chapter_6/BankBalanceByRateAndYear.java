import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();
        double[] rates = {0.02, 0.03, 0.04, 0.05};

        
        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            double balance = initialBalance;

            System.out.printf("%n Your initial balance of $%.1f at an interest rate of %.2f%n",
                    initialBalance, rate);

            
            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * rate);
                System.out.printf("After year %d balance is $%.10f%n", year, balance);
            }
        }

        System.out.println("\n----jGRASP: Operation complete.");
        input.close();
    }
}
