package pl.trypuz.parkingmanager.services;

import java.util.Random;

public class RandomNumberGenerator {
    public static Random generator = new Random();
    public static int randomNumber(){
        return generator.nextInt(47);
    }
}
