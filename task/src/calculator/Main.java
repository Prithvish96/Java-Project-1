package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      STAGE 1 -Displaying Price List
//        System.out.println("Prices:");
//        System.out.println("Bubblegum: $2");
//        System.out.println("Toffee: $0.2");
//        System.out.println("Ice cream: $5");
//        System.out.println("Milk chocolate: $4");
//        System.out.println("Doughnut: $2.5");
//        System.out.println("Pancake: $3.2");

//      STAGE 2 - Displaying Earnings
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");

        int income = 202+118+2250+1680+1075+80;
        System.out.println("\nIncome: $" + income);

//      STAGE 3 - Taking User input and displaying Net Income
        Scanner sc = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenseInput = sc.nextInt();
        System.out.println("Other expenses:");
        int otherExpenseInput = sc.nextInt();

        int netIncome = income - (staffExpenseInput + otherExpenseInput);
        System.out.printf("Net income: %d", netIncome);

        sc.close();
    }
}