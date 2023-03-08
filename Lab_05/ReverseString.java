import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int count;

        System.out.println("Please enter a string");
        input = scan.nextLine().trim();
        System.out.println(input);

        for (count = input.length() -1; count >= 0 ; count-- ) {
            
            System.out.print(input.charAt(count));
            scan.close();             
        }

    }
    
}

