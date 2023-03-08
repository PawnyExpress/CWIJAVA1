import java.util.Scanner;

public class DoDemo {
    public static void main(String[] args) {
        //Indeterminate
        Scanner scan;
        boolean doAgain;

        scan = new Scanner(System.in);

        do {
            System.out.println("Hello There!");
            System.out.println("would you like another greeting?");
            doAgain = scan.next().trim().toLowerCase().charAt(0) == 'y';
        } while (doAgain) ;

        scan.close();
    }
}
