package main.java.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfMonthExists());
        System.out.println(getMonthsWithTheSameDaysAmount());
        System.out.println(getMonthsWithTheSameSeason());
        System.out.println("Here you have some additional info about months;-)");
        System.out.println(printEvenDaysMonths());
        System.out.println(printOddDaysMonths());

    }

    public static String checkIfMonthExists() {
        System.out.println("Enter a month to check if it exists in the list:");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        for (Months month : Months.values()) {
            if (word.equalsIgnoreCase(String.valueOf(month)))
                return "The month you entered is found in the list";
        }
        return "No month found";
    }

    public static int getMonthsWithTheSameDaysAmount() {
        System.out.println("Enter your month for finding the ones having the same days amount:");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        Months theMonth = null;
        try {
            theMonth = Months.valueOf(text.toUpperCase());
        } catch (Exception e) {
            System.out.println("No month found");
            return 0;
        }
        Integer monthDaysAmount = theMonth.getDaysAmount();
        System.out.println("Months with the same number of days: ");
        for (Months month : Months.values()) {
            if (monthDaysAmount == month.getDaysAmount()) {
                System.out.println(month);
            }
        }
        return 0;
    }
    public static int getMonthsWithTheSameSeason() {
        System.out.println("Enter your month for finding the ones having the same season");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        Months thisMonth;
        try {
            thisMonth = Months.valueOf(text.toUpperCase());
        } catch (Exception e) {
            System.out.println("Oops, you entered the wrong text:(");
            return 0;
        }
        Seasons thisSeason = Seasons.valueOf(thisMonth.getSeason());
        System.out.println("Months with the same season: ");
        for (Months month : Months.values()) {
            if (thisSeason.toString().equalsIgnoreCase(month.getSeason().toString())) {
                System.out.println(month);
            }
        }
    return 0;
    }

    public static int printEvenDaysMonths() {
        System.out.println("These are months with even numbers of the days:");
        for (Months months22 : Months.values()) {
            if (months22.getDaysAmount() % 2 == 0) {
                System.out.println(months22);
            }
        }
        return 0;
    }
    public static int printOddDaysMonths() {
        System.out.println(" These are months with odd numbers of the days:");
        for (Months months22 : Months.values()) {
            if (months22.getDaysAmount() % 2 != 0) {
                System.out.println(months22);
            }
        }
        return 0;
    }
}




