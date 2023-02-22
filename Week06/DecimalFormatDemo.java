import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        
        DecimalFormat formatter;
        double numOne, numTwo;
        String pattern;

        numOne = 1367512.56;
        numTwo = -42.4321;

        pattern = ",###.##;[#]";

        formatter = new DecimalFormat(pattern);

        System.out.println("numOne: " + numOne + "\nFormatted: " + formatter.format(numOne));
        System.out.println("numTwo: " + numTwo + "\nFormatted: " + formatter.format(numTwo));
    }
}