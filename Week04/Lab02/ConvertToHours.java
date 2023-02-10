package Lab02;
import java.util.Scanner;
public class ConvertToHours {
    public static void main(String[] args) {
        //Constant declarations for my constant values.
        final int SECONDS_PER_MINUTE, MINUTES_PER_HOUR, SECONDS_PER_HOUR;
        //variable declaration
        int hours, minutes, seconds, secondsremnant;
        
        SECONDS_PER_MINUTE = MINUTES_PER_HOUR = 60;
        SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

        //Scanner is used in order to get necessary input.
        Scanner scan = new Scanner(System.in);
        //Message for user to enter an integer.
        System.out.println("Enter the total number of seconds: ");
        //takes the integer entered by user.
        seconds = scan.nextInt();
        //calculations needed to determine proper outputs.
        hours = seconds / MINUTES_PER_HOUR / SECONDS_PER_MINUTE;    

        minutes = seconds / MINUTES_PER_HOUR % SECONDS_PER_MINUTE;

        secondsremnant =  seconds % SECONDS_PER_MINUTE;

        //Print statements needed in order to acquire my calculation outputs.

        System.out.println("Total Seconds: " + seconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + secondsremnant);
        System.out.println();
        System.out.println("Fractional Hours: " + (double)seconds / SECONDS_PER_HOUR);



    }
}
