
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scan;
        boolean playAgain;
        scan = new Scanner(System.in);
        PairOfDice myDice, comDice;
        int count1, count2, count3;
        
        
        myDice = new PairOfDice();
        comDice = new PairOfDice();

        count1 = 0;
        count2 = 0;
        count3 = 0;

        do {
            myDice.roll();
            comDice.roll();
            
            System.out.println("Your roll: " + myDice);
            System.out.println("Computer's roll: " + comDice);

            if (myDice.getTotal() < comDice.getTotal()) {
                System.out.println("You lose!");
                count1++;
            } else if (myDice.getTotal() == comDice.getTotal()){
                System.out.println("It's a Tie!");
                count2++;
            } else {
                System.out.println("You Win!");
                count3++;
            }
            
        
            
            System.out.println("Your wins: "+ count3 + " " + "Computer's wins: "+ count1 + " " + "Ties: " + " " + count2 );
            System.out.println("Do you want to roll again? (Y)es to continue, anything else to quit.");
            playAgain = scan.next().trim().toUpperCase().charAt(0) == 'Y';
        } while (playAgain);
        

        scan.close();
    }
}
