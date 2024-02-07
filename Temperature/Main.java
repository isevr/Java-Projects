package Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the temperature today: ");
        float temp = scanner.nextFloat();

        // if (temp > 30)
        //     System.out.println("It's a hot day, drink a lot of water");

        // else if (temp > 15 && temp <= 30)
        //     System.out.println("It's a nice day! Have fun!");

        // else
        //     System.out.println("It's cold today, dress well");


        String dayType = temp > 30 ? "It's a hot day, drink a lot of water" : 
        (temp >= 15 ? "It's a nice day! Have fun!" : "It's cold today, dress well");

        System.out.println(dayType);
    

        scanner.close();

    }
}