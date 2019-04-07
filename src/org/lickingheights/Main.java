package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int month, year, day;
        boolean running = true;
        while (running = true)
            System.out.println("Monday's child is fair of face,\n" +
                    "Tuesday's child is full of grace,\n" +
                    "Wednesday's child is full of woe,\n" +
                    "Thursday's child has far to go.\n" +
                    "Friday's child is loving and giving,\n" +
                    "Saturday's child works hard for a living,\n" +
                    "But the child born on the Sabbath Day,\n" +
                    "Is fair and wise and good in every way.\n");
        System.out.println("What month were you born?");
        month = keyboard.nextInt();
        System.out.println("What day were you born?");
        day = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();

        daysofmonth(month);
        dayoftheweek(day, month, year);

    }

    public static String daysofmonth(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "There are 31 days in January";
                break;
            case 2:
                monthString = "There are either 28 days or 29 days in February";
                break;
            case 3:
                monthString = "There are 31 days in March";
                break;
            case 4:
                monthString = "There are 30 days in April";
                break;
            case 5:
                monthString = "There are 31 days in May";
                break;
            case 6:
                monthString = "There are 30 days in June";
                break;
            case 7:
                monthString = "There are 31 days in July";
                break;
            case 8:
                monthString = "There are 30 days in August";
                break;
            case 9:
                monthString = "There are 31 days in September";
                break;
            case 10:
                monthString = "There are 30 days in October";
                break;
            case 11:
                monthString = "There are 31 days in November";
                break;
            case 12:
                monthString = "There are 30 days in December";
                break;
        }
        System.out.println(monthString);
        return (monthString);
    }
}
