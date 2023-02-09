package Lab02;
import java.util.Scanner;
public class ConvertToSeconds {
    public static void main(String[] args) {
        final int SECONDS_PER_MINUTE, MINUTES_PER_HOUR;
        int hours, minutes, seconds, secondsConversion;
    
        SECONDS_PER_MINUTE = 60;
        MINUTES_PER_HOUR = SECONDS_PER_MINUTE;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of hours: ");
        hours = scan.nextInt();

        System.out.println("Enter the number of minutes: ");
        minutes = scan.nextInt();

        System.out.println("Enter the number of seconds: ");
        seconds = scan.nextInt();

        secondsConversion = ((hours * MINUTES_PER_HOUR * SECONDS_PER_MINUTE) 
                            + (minutes * SECONDS_PER_MINUTE) + seconds);

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Total Seconds: " + secondsConversion);

    }
}
