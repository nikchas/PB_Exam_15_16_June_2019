package PB_Exam_15_16_June_2019;

import java.util.Scanner;

public class MoovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double timeForShooting = Integer.parseInt(scanner.nextLine());
        double amountOfScenes = Integer.parseInt(scanner.nextLine());
        double timeForScene = Integer.parseInt(scanner.nextLine());

        double preparation = 0.15*timeForShooting;
        timeForShooting = timeForShooting - preparation;
        double a = amountOfScenes * timeForScene;
        if(timeForShooting > a){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeForShooting-a);
        }
        else{
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", a-timeForShooting);
        }
    }
}
