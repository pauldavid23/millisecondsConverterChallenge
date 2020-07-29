package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the hour: ");

        if (scanner.hasNextInt()) {
            int hour = scanner.nextInt();
            scanner.nextLine();

            int phour = hour;

            System.out.println("Enter minutes: ");

            if (scanner.hasNextInt()) {
                int minutes = scanner.nextInt();
                scanner.nextLine();

                int pmin = minutes;

                System.out.println("Enter seconds: ");

                if (scanner.hasNextInt()) {
                    int seconds = scanner.nextInt();
                    scanner.nextLine();

                    int psec = seconds;

                    hour *= 3600000;
                    minutes *= 60000;
                    seconds *= 1000;

                    int total = hour + minutes + seconds;

                    System.out.println("There are " + total + " milliseconds in " + phour + " hour "
                    + pmin + " min/s " + psec + " secs"  );

                } else {
                    System.out.println("Invalid input!");
                }


            } else {
                System.out.println("Invalid input!");
            }




        } else {
            System.out.println("Invalid input!");
        }



    }
}
