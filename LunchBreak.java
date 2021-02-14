package PB_Exam_15_16_June_2019;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double movieTime = Integer.parseInt(scanner.nextLine());
        double pause = Integer.parseInt(scanner.nextLine());

        double lunchTime = pause/8.00;
        double relaxTime = pause/4.00;

        double freeTime =  pause - lunchTime - relaxTime;

        if (freeTime >= movieTime){
            double timeLeft = Math.ceil(freeTime - movieTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, timeLeft);
        }
        else{
            double neededTime = Math.ceil(movieTime - freeTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, neededTime);
        }
    }
}