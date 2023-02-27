import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        
        int numOne, numTwo;
        double sumOfCubes;
        Scanner scan;

        scan = new Scanner(System.in);

        System.out.println("Please enter the first integer value");
        numOne = scan.nextInt();

        System.out.println("Please enter the second integer value");
        numTwo = scan.nextInt();

        sumOfCubes = Math.pow(numOne, 3) + Math.pow(numTwo, 3);

        System.out.println("The sum of Cubes of your two integers values is: " + (int)sumOfCubes);

        scan.close();
    }
}
