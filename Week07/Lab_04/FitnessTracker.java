import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int DAILY_STEP_GOAL;
        int numberOfSteps;

        DAILY_STEP_GOAL = 10000;

        System.out.println("What is the number of steps you've taken today so far?");
        numberOfSteps = scan.nextInt();

        if (numberOfSteps < (DAILY_STEP_GOAL/10)) {
            System.out.println("Way to get a good start!");

        } else if ( numberOfSteps < (DAILY_STEP_GOAL/2)) {

            System.out.println("You're almost halfway there");

        } else {

            System.out.println("You're over halfway there!");
        }
        scan.close();
    }
}