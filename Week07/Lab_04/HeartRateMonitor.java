import java.util.Scanner;

public class HeartRateMonitor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int TARGET_LOWER_BOUND, TARGET_UPPER_BOUND;
        int heartRate;

        TARGET_LOWER_BOUND = 120;
        TARGET_UPPER_BOUND = 150;

        System.out.println("What is your current heart rate?");
        heartRate = scan.nextInt();

        if (heartRate >= TARGET_LOWER_BOUND && heartRate <= TARGET_UPPER_BOUND){
            System.out.println("You're right on track!");
        } else if (heartRate < TARGET_LOWER_BOUND){
            System.out.println("You're doing great, but try to push a bit!");
        } else {
            System.out.println("You're on fire! Slow down just a bit!");
        }

        scan.close();
    }
}
