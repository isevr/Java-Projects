package Mortgage_Calculator;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in); 

    final short percent = 100;
    final short months = 12; 

    // check principal capital value with do-while
    int principal = 0;

    do {
        System.out.print("Principal ($1K - $1M): ");
        principal = scanner.nextInt(); 
    } while (!(principal > 1000 && principal <= 1_000_000));

    // check interest rate with do-while
    float annual_interest = 0;
    do {
        System.out.print("Annual Interest: ");
        annual_interest = scanner.nextFloat();
        if (annual_interest <= 0 || annual_interest > 30)
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
    } while (annual_interest <= 0 || annual_interest > 30);

    float monthly_interest = (annual_interest / percent) / months;

    // check payment period with while true
    int payment_period = 0;
    while (true) {
        System.out.print("Payment period (in years): ");    
        payment_period = scanner.nextShort();
        if (payment_period > 1 || payment_period < 30)
            break;
        System.out.println("Enter a value between 1 and 30.");
    } 

    int payments = payment_period * 12;

    NumberFormat currency = NumberFormat.getCurrencyInstance();

    double mortgage = principal * ((monthly_interest * Math.pow((1 + monthly_interest), payments)) / (Math.pow((1 + monthly_interest), payments) - 1));
    System.out.println("Mortgage: " + currency.format(mortgage));

    scanner.close();
    }
}
