import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        
        double sideA, sideB, sideC, perimeterHalved, area;
        Scanner scan;
        DecimalFormat formatter;
        String pattern;

        pattern = ".###";
        formatter = new DecimalFormat(pattern);

        scan = new Scanner(System.in);

        System.out.println("Please enter the length \"a\" on your triangle");
        sideA = scan.nextDouble();

        System.out.println("Please enter the length \"b\" on your triangle");
        sideB = scan.nextDouble();

        System.out.println("Please enter the length \"c\" on your triangle");
        sideC = scan.nextDouble();

        perimeterHalved = (sideA + sideB + sideC) / 2;

        area = Math.sqrt(perimeterHalved * (perimeterHalved - sideA) * (perimeterHalved - sideB) * (perimeterHalved - sideC));

        System.out.println("The area of your triangle is: " + formatter.format(area));



        scan.close();
    }
}