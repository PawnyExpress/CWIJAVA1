import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

import edu.cwi.parking.ParkingSpot;

public class ParkingFinder {
    public static void main(String[] args) {
        ParkingSpot firstSpot, secondSpot, thirdSpot, fourthSpot;
        Scanner scan;
        long seed;
        int parkingTime, carX, carY, randomX, randomY, distanceOne, distanceTwo, distanceThree, distanceFour, interval, disComOne, disComTwo;
        Random generator;
        NumberFormat formatter;
              
        formatter = NumberFormat.getCurrencyInstance();
        scan = new Scanner(System.in);
              
        System.out.println("Enter a random seed");
        seed = scan.nextLong();

        generator = new Random(seed);

        System.out.println("How much time do you need to be parked for?");
        parkingTime = scan.nextInt();

        carX = generator.nextInt(100);
        carY = generator.nextInt(100);

        System.out.println("The position of your vehicle is: X:" + carX + " Y:" + carY + "\n");

        interval = (int)Math.ceil((double)parkingTime / 10);

        firstSpot = new ParkingSpot("Lenox Ave", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        distanceOne = Math.abs(carX - firstSpot.getLocationX() ) + Math.abs(carY - firstSpot.getLocationY());
        
        secondSpot = new ParkingSpot("Russel Way", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        distanceTwo = Math.abs(carX - secondSpot.getLocationX() ) + Math.abs(carY - secondSpot.getLocationY());

        thirdSpot = new ParkingSpot("Cherry Lane", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        thirdSpot.setCostPerInterval(0.30);
        distanceThree = Math.abs(carX - thirdSpot.getLocationX() ) + Math.abs(carY - thirdSpot.getLocationY());
        
        fourthSpot = new ParkingSpot("Wisteria Lane", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        fourthSpot.setCostPerInterval(0.30);
        distanceFour = Math.abs(carX - fourthSpot.getLocationX() ) + Math.abs(carY - fourthSpot.getLocationY());

        disComOne = Math.min(distanceOne, distanceTwo);
        disComTwo = Math.min(distanceThree, distanceFour);

        

        System.out.println("Spot 1: " + firstSpot.toString());
        System.out.println("        Distance to spot 1 is: " + distanceOne);
        System.out.println("        Total Cost for Spot 1: " + formatter.format(interval * firstSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Spot 2: " + secondSpot.toString());
        System.out.println("        Distance to spot 2 is: "+ distanceTwo);
        System.out.println("        Total Cost for Spot 2: " + formatter.format(interval * secondSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Spot 3: " + thirdSpot.toString());
        System.out.println("        Distance to spot 3 is: " + distanceThree);
        System.out.println("        Total Cost for Spot 3: " + formatter.format(interval * thirdSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Spot 4: " + fourthSpot.toString());
        System.out.println("        Distance to spot 4 is: " + distanceFour);
        System.out.println("        Total Cost for Spot 4: " + formatter.format(interval * fourthSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Distance to closest spot: " + Math.min(disComOne, disComTwo));

        if (distanceOne < distanceTwo && distanceOne < distanceThree && distanceOne < distanceFour) {
            System.out.println("Closest spot is: " + firstSpot );
        } else if (distanceTwo < distanceOne && distanceTwo < distanceThree && distanceTwo < distanceFour) {
            System.out.println("Closest spot is: " + secondSpot );
        } else if (distanceThree < distanceOne && distanceThree < distanceTwo && distanceThree < distanceFour){
            System.out.println("Closest spot is: " + thirdSpot );
        } else {
            System.out.println("Closest spot is: " + fourthSpot );
        }
        System.out.println();

        scan.close();
    }
    
}   
