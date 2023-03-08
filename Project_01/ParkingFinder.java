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
        
        
        System.out.println("Give me a long");
        seed = scan.nextLong();

        generator = new Random(seed);

        System.out.println("How much time do you need to be parked for?");
        parkingTime = scan.nextInt();

        carX = generator.nextInt(99);
        carY = generator.nextInt(99);

        System.out.println("The position of your vehicle is: X:" + carX + " Y:" + carY);

        //firstSpot = new ParkingSpot("Lenox Ave", carX , carY);
        //firstSpot.setCostPerInterval(cost : 0.25);
        // secondSpot = new ParkingSpot("Russel Way", randomX = generator.nextInt(99), randomY = generator.nextInt(99));
        // thirdSpot = new ParkingSpot("Cherry Lane", randomX = generator.nextInt(99), randomY = generator.nextInt(99));
        // fourthSpot = new ParkingSpot("Wisteria Lane", randomX = generator.nextInt(99), randomY = generator.nextInt(99));

        //System.out.println(firstSpot);
        // System.out.println(secondSpot.toString());
        // System.out.println(thirdSpot.toString());
        // System.out.println(fourthSpot.toString());
        ParkingSpot spot = new ParkingSpot("Beacon St.", 1, 85);
        System.out.println(spot);

        scan.close();
    }
    
}