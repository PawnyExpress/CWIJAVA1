import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeSurfaceArea {
    public static void main(String[] args) {
        
        Scanner scan;
        double radius, volume, area;
        DecimalFormat formatter;
        String pattern;

        scan = new Scanner(System.in);
        pattern = "#.####";
        formatter = new DecimalFormat(pattern);

        System.out.println("Please provide the radius of your sphere");
        radius = scan.nextDouble();

        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        area = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("The volume of your sphere is: " + formatter.format(volume) + "\n");
        
        System.out.println("The Surface Area of your sphere is: " + formatter.format(area) + "\n");

        scan.close();
    }
}
