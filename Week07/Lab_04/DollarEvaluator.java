import java.util.Scanner;

public class DollarEvaluator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollarAmount;

        System.out.println("How much money do you have?");
        dollarAmount = scan.nextInt();

        if (dollarAmount == 0) {
            System.out.println("Sorry kid. You're broke!");

        } else if (dollarAmount >= 100) {

                System.out.println("Looks to me like you're rich!");

         }else {

                System.out.println("You've got some spending money!");
        }

        scan.close();
    }
}
