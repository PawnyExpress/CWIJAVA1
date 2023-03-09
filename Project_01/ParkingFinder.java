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
        int parkingTime, carX, carY, ranX, ranY, distOne, distTwo, distThree, distFour, interval, disComOne, disComTwo;
        Random generator;
        NumberFormat formatter;
              
        formatter = NumberFormat.getCurrencyInstance();
        scan = new Scanner(System.in);
              
        System.out.println("Enter a random seed");
        seed = scan.nextLong();

        generator = new Random(seed);

        System.out.println("How much time do you need to be parked for? (minutes)");
        parkingTime = scan.nextInt();

        carX = generator.nextInt(100);
        carY = generator.nextInt(100);

        System.out.println("The position of your vehicle is: X:" + carX + " Y:" + carY + "\n");

        interval = (int)Math.ceil((double)parkingTime / 10);

        firstSpot = new ParkingSpot("Lenox Ave", ranX = generator.nextInt(100), ranY = generator.nextInt(100));
        distOne = Math.abs(carX - firstSpot.getLocationX() ) + Math.abs(carY - firstSpot.getLocationY());
        
        secondSpot = new ParkingSpot("Russel Way", ranX = generator.nextInt(100), ranY = generator.nextInt(100));
        distTwo = Math.abs(carX - secondSpot.getLocationX() ) + Math.abs(carY - secondSpot.getLocationY());

        thirdSpot = new ParkingSpot("Cherry Lane", ranX = generator.nextInt(100), ranY = generator.nextInt(100));
        thirdSpot.setCostPerInterval(0.30);
        distThree = Math.abs(carX - thirdSpot.getLocationX() ) + Math.abs(carY - thirdSpot.getLocationY());
        
        fourthSpot = new ParkingSpot("Wisteria Lane", ranX = generator.nextInt(100), ranY = generator.nextInt(100));
        fourthSpot.setCostPerInterval(0.30);
        distFour = Math.abs(carX - fourthSpot.getLocationX() ) + Math.abs(carY - fourthSpot.getLocationY());

        disComOne = Math.min(distOne, distTwo);
        disComTwo = Math.min(distThree, distFour);

        

        System.out.println("Spot 1: " + firstSpot.toString());
        System.out.println("        Distance to spot 1 is: " + distOne);
        System.out.println("        Total Cost for Spot 1: " + formatter.format(interval * firstSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Spot 2: " + secondSpot.toString());
        System.out.println("        Distance to spot 2 is: "+ distTwo);
        System.out.println("        Total Cost for Spot 2: " + formatter.format(interval * secondSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Spot 3: " + thirdSpot.toString());
        System.out.println("        Distance to spot 3 is: " + distThree);
        System.out.println("        Total Cost for Spot 3: " + formatter.format(interval * thirdSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Spot 4: " + fourthSpot.toString());
        System.out.println("        Distance to spot 4 is: " + distFour);
        System.out.println("        Total Cost for Spot 4: " + formatter.format(interval * fourthSpot.getCostPerInterval()));
        System.out.println();
        System.out.println("Distance to closest spot: " + Math.min(disComOne, disComTwo));

        if (distOne < distTwo && distOne < distThree && distOne < distFour) {
            System.out.println("Closest spot is: " + firstSpot );
        } else if (distTwo < distOne && distTwo < distThree && distTwo < distFour) {
            System.out.println("Closest spot is: " + secondSpot );
        } else if (distThree < distOne && distThree < distTwo && distThree < distFour){
            System.out.println("Closest spot is: " + thirdSpot );
        } else {
            System.out.println("Closest spot is: " + fourthSpot );
        }
        System.out.println();

        scan.close();
    }
    
}   
