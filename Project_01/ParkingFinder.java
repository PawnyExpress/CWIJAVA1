import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import edu.cwi.parking.ParkingSpot;

public class ParkingFinder {
    public static void main(String[] args) {
        ParkingSpot tempspot, firstSpot, secondSpot, thirdSpot, fourthSpot;
        Scanner scan;
        long seed;
        int parkingTime, carX, carY, randomX, randomY, distanceOne, distanceTwo,distanceThree,distanceFour;
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
        distanceOne = Math.abs(carX - firstSpot.getLocationX() ) + Math.abs(carY - firstSpot.getLocationY());
        secondSpot = new ParkingSpot("Russel Way", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        distanceTwo = Math.abs(carX - secondSpot.getLocationX() ) + Math.abs(carY - secondSpot.getLocationY());
        thirdSpot = new ParkingSpot("Cherry Lane", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        thirdSpot.setCostPerInterval(0.30);
        distanceThree = Math.abs(carX - thirdSpot.getLocationX() ) + Math.abs(carY - thirdSpot.getLocationY());
        fourthSpot = new ParkingSpot("Wisteria Lane", randomX = generator.nextInt(100), randomY = generator.nextInt(100));
        fourthSpot.setCostPerInterval(0.30);
        distanceFour = Math.abs(carX - fourthSpot.getLocationX() ) + Math.abs(carY - fourthSpot.getLocationY());

        System.out.println(firstSpot);
        System.out.println(distanceOne);
        System.out.println(secondSpot.toString());
        System.out.println(distanceTwo);
        System.out.println(thirdSpot.toString());
        System.out.println(distanceThree);
        System.out.println(fourthSpot.toString());
        System.out.println(distanceFour);
        

        scan.close();
    }
    
}