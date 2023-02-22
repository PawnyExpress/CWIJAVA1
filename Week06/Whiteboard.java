import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Whiteboard {
    public static void main(String[] args) {
        String title, sentence;  
        int index;
        double currency, percentage;
        Random generator;
        NumberFormat currencyFormatter, percentageFormatter;
        Scanner scan = new Scanner(System.in);

        currencyFormatter = NumberFormat.getCurrencyInstance();
        percentageFormatter = NumberFormat.getPercentInstance();
        percentageFormatter.setMinimumFractionDigits(2);
        
        generator = new Random();

        currency = 100 * generator.nextDouble();
        System.out.println("I have " + currencyFormatter.format(currency) + " in the bank");
        System.out.println(currency);

        percentage = generator.nextDouble();
        System.out.println("I have " + percentageFormatter.format(percentage) + " of my health remaining");
        System.out.println(percentage);

        title = "CPSC-121";
        title = title + ": Computer Science I";

        //System.out.println(title.length());

        //System.out.println("Please enter a Sentence:");
        //sentence = scan.nextLine();

        
        //Print the last 5 characters read in, in reverse order.
        //index = sentence.length() - 1;
        //System.out.print(sentence.charAt(index));
        //index--;
        //System.out.print(sentence.charAt(index));
        //index--;
        //System.out.print(sentence.charAt(index));
        //index--;
        //System.out.print(sentence.charAt(index));
        //index--;
        //System.out.print(sentence.charAt(index));

        //System.out.println(sentence.charAt(5));
        //System.out.println(Math.PI);

    }
}