import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
      
        int a, b, c;
        double firstRoot, secondRoot, sqrtTerm;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quadratic Formula Solver: a x^2 + b x + c");
        System.out.println("Please ensure b^2 - 4ac isn't negative");

        System.out.println("Please enter 'a' value");
        a = scan.nextInt();

        System.out.println("Please enter 'b' value");
        b = scan.nextInt();

        System.out.println("Please enter 'c' value");
        c = scan.nextInt();

        sqrtTerm = Math.sqrt(Math.pow(b, 2) - 4 * a * c) ;

        firstRoot =(-b + sqrtTerm) / (2 * a);

        secondRoot = (-b - sqrtTerm) / (2 * a);

        System.out.println("The First root is: " + firstRoot);
        System.out.println("The Second Root is: " + secondRoot);

        scan.close();
    }
}