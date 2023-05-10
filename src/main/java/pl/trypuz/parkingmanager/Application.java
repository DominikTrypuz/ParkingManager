package pl.trypuz.parkingmanager;

import pl.trypuz.parkingmanager.utils.Descriptions;
import pl.trypuz.parkingmanager.services.RandomParkingPlace;

import java.util.Scanner;

public class Application {
    public static void startApp() {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;

        while (choose != 4) {
            Descriptions.showChooseDescription();
            choose = scanner.nextInt();

            switch (choose) {
                case 1 -> Descriptions.showParkingPlacesDescription();
                case 2 -> {
                    Descriptions.showCostDescription();
                    Descriptions.showTicketPriceDescription();
                }
                case 3 -> {
                    Descriptions.showTicketPriceDescription();
                    RandomParkingPlace.showRandomParkingPlace();
                    System.out.println("Thanks for your purchase!");
                }
                case 4 -> System.out.println("Goodbye. Have a nice day!");
                default -> System.out.println("Unsuitable action, please try again");
            }
        }
    }
}
