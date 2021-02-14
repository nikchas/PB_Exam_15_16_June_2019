package PB_Exam_15_16_June_2019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double timeForEpisode = Double.parseDouble(scanner.nextLine());
        double ads = 0.2 * timeForEpisode;
        double fullEpisode = timeForEpisode + ads;
        int specialEpisode = seasons * 10;
        double sum = fullEpisode * episodes * seasons + specialEpisode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, sum);
    }
}