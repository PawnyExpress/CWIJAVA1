import java.util.*;


public class Whiteboard {
    public static void main(String[] args) {
        Random generator = new Random(1234);
        Scanner scan = new Scanner(System.in);
        String testing = "Here we are!"; 
        
        int randomIntegers;
        double randomDouble, randomPercent;
        boolean isHeads;

        /*  Enemy Alien
         *  0.0-.3999   40% Move
         *  .40-.6999   30% Fire Lasers
         *  .70-.8999   20% Evade
         *  .90-.9999   10% Collide 
         */

        randomIntegers = generator.nextInt(20) + 1;
        randomDouble = 19 * generator.nextDouble() + 1;
        randomPercent = generator.nextDouble();
        isHeads =generator.nextBoolean();

        System.out.println(randomIntegers);
        System.out.println(randomDouble);
        System.out.println(randomPercent);
        System.out.println("It was Heads: " + isHeads);
    }
}