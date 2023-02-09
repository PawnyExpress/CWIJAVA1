package Lab02;
import java.util.Scanner;
public class ConvertToHours {
    public static void main(String[] args) {
        final int SECONDS_PER_MINUTE, MINUTES_PER_HOUR;
        final double SECONDS_PER_HOUR;

        int hours, minutes, seconds, secondsremnant ;
        double fractionalResult;
        
        SECONDS_PER_MINUTE = MINUTES_PER_HOUR = 60;
        SECONDS_PER_HOUR = 3600.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the total number of seconds: ");
        seconds = scan.nextInt();

        hours = seconds / MINUTES_PER_HOUR / SECONDS_PER_MINUTE;    

        minutes = seconds / MINUTES_PER_HOUR % SECONDS_PER_MINUTE;

        secondsremnant =  seconds % SECONDS_PER_MINUTE;

        fractionalResult = seconds / SECONDS_PER_HOUR; 

        System.out.println("Total Seconds: " + seconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + secondsremnant);
        System.out.println();
        System.out.println("Fractional Hours: " + fractionalResult);



    }
}
