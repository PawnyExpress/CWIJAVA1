import java.util.Random;
import java.util.Scanner;

import edu.cwi.parking.ParkingSpot;

public class ParkingFinder {
    public static void main(String[] args) {
        ParkingSpot tempspot, firstSpot, secondSpot, thirdSpot, fourthSpot;
        Scanner scan;
        long seed;
        int parkingTime, carX, carY, randomX, randomY;
        Random generator;
        


        scan = new Scanner(System.in);
        
        
        System.out.println("Enter a random seed");
        seed = scan.nextLong();

        generator = new Random(seed);

        System.out.println("How much time do you need to be parked for?");
        parkingTime = scan.nextInt();

        carX = generator.nextInt(100);
        carY = generator.nextInt(100);

        System.out.println("The position of your vehicle is: X:" + carX + " Y:" + carY);

        firstSpot = new ParkingSpot("Lenox Ave", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        secondSpot = new ParkingSpot("Russel Way", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        thirdSpot = new ParkingSpot("Cherry Lane", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        thirdSpot.setCostPerInterval(0.30);
        fourthSpot = new ParkingSpot("Wisteria Lane", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        fourthSpot.setCostPerInterval(0.30);

        System.out.println(firstSpot);
        System.out.println(secondSpot.toString());
        System.out.println(thirdSpot.toString());
        System.out.println(fourthSpot.toString());
        

        scan.close();
    }
    
}