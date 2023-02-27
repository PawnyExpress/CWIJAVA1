import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        
        double xOne, yOne, xTwo, yTwo, distance;
        Scanner scan;
        DecimalFormat formatter;
        String pattern;

        pattern = "#.##";
        formatter = new DecimalFormat(pattern);

        scan = new Scanner(System.in);

        System.out.println("Please enter your X1 value");
        xOne = scan.nextDouble();

        System.out.println("Please enter your Y1 value");
        yOne = scan.nextDouble();

        System.out.println("Please enter your X2 value");
        xTwo = scan.nextDouble();

        System.out.println("Please enter your Y2 value");
        yTwo = scan.nextDouble();

        distance = Math.sqrt( Math.pow((xTwo - xOne), 2) + Math.pow((yTwo - yOne), 2));

        System.out.println("The distance between your two coordinates provided is: " + formatter.format(distance));

        scan.close();
    }
}
