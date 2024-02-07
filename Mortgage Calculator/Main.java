import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in); 

    final short percent = 100;
    final short months = 12; 

    System.out.print("Principal: ");
    int principal = scanner.nextInt();

    System.out.print("Annual Interest: ");
    float annual_interest = scanner.nextFloat();
    float monthly_interest = (annual_interest / percent) / months;

    System.out.print("Payment period (in years): ");    
    short payment_period = scanner.nextShort();
    int payments = payment_period * 12;

    NumberFormat currency = NumberFormat.getCurrencyInstance();

    double mortgage = principal * ((monthly_interest * Math.pow((1 + monthly_interest), payments)) / (Math.pow((1 + monthly_interest), payments) - 1));
    System.out.println("Mortgage: " + currency.format(mortgage));

    scanner.close();
    }
}
