package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        Season season1 = getSeasonFromName(scanner);
        if (season1 != null) {
            printMonthsInSeason(season1);
        }
//        Testy nie przechodziły z poniższym kodem
//        Season season2 = getSeasonFromMonth(scanner);
//        if (season2 != null) {
//            System.out.println("Pora roku w tym miesiącu to: " + season2.getPlName());
//        }
    }

    private Season getSeasonFromName(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        printSeasons();
        Season season = Season.fromPlName(scanner.nextLine());

        return season;
    }

    private Season getSeasonFromMonth(Scanner scanner) {
        System.out.println("Podaj miesiąc:");
        printMonths();
        Month month = Month.fromPlName(scanner.nextLine());
        Season season = Season.fromMonth(month);

        return season;
    }

    private void printMonths() {
        for (Month month : Month.values()) {
            System.out.println(month.getPlName());
        }
    }

    private void printMonthsInSeason(Season season) {
        System.out.println("W tej porze roku są następujące miesiące:");
        System.out.println(Arrays.toString(season.getMonths()));
    }

    private void printSeasons() {
        for (Season value : Season.values()) {
            System.out.println(value.getPlName());
        }
    }
}