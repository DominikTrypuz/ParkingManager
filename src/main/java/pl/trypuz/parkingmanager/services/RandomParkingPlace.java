package pl.trypuz.parkingmanager.services;

public class RandomParkingPlace {

    public static void showRandomParkingPlace() {
        java.util.Random generator = new java.util.Random();
        char[] randomChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int randomCharNumber = generator.nextInt(randomChar.length);
        int randomNumber = generator.nextInt(1, 6);

        System.out.println("Your place: " + (randomChar[randomCharNumber] + "" + randomNumber));
    }
}
