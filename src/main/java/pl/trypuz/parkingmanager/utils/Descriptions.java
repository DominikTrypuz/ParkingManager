package pl.trypuz.parkingmanager.utils;


import pl.trypuz.parkingmanager.services.RandomNumberGenerator;

public class Descriptions {

    public static void showWelcomeDescription() {
        System.out.println();
        System.out.println("Welcome in the best parking in all over the world!");
        System.out.println("We have " + (48 - RandomNumberGenerator.randomNumber()) + " free places at this moment");
    }

    public static void showChooseDescription() {
        System.out.println();
        System.out.println("Please, choose the number:");
        System.out.println("1.Show parking map " + "2.Show ticket price " + "3.Buy a ticket " + "4.Exit");
        System.out.println();
    }

    public static void showCostDescription() {
        System.out.println("If there are fewer car than 10, one ticket costs 10$");
        System.out.println("Otherwise ticket costs 15$");
        System.out.println("Now We have " + RandomNumberGenerator.randomNumber() + " vehicles");
    }

    public static void showParkingPlacesDescription() {
        System.out.println("  A B C D E F G H");
        System.out.println("1 * * * * * * * *");
        System.out.println("2 * * * * * * * *");
        System.out.println("3 * * * * * * * *");
        System.out.println("4 * * * * * * * *");
        System.out.println("5 * * * * * * * *");
        System.out.println("6 * * * * * * * *");
    }

    public static void showTicketPriceDescription() {
        if (RandomNumberGenerator.randomNumber() < 10) {
            System.out.println("Your ticket costs 10$");
        } else if (RandomNumberGenerator.randomNumber() > 10) {
            System.out.println("Your ticket costs 15$");
        } else {
            System.out.println("Your ticket costs 15$");
        }
    }

}
