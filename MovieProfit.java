package PB_Exam_15_16_June_2019;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double ticketPricePerDay = tickets * price;
        double income = days * ticketPricePerDay;
        double profitPercentage = income * percentage/100;
        double profit = income - profitPercentage;

        System.out.printf("The profit from the movie %s is %.2f lv.", name, profit);
    }
}
