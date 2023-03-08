package ClassDemos;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        int numberOfHellos, index;
        Scanner keyboard = new Scanner(System.in);
        String word;

        // System.out.println("How many times would you like me to say \"Hello\"?");
        // numberOfHellos = keyboard.nextInt();

        // while (numberOfHellos > 0) {
        //     System.out.println("Hello There!");
        //     numberOfHellos--;
        // }

        System.out.println("Please enter a word");
            word = keyboard.nextLine();

        index = 0;

        while (index < word.length()) {
            System.out.println(word.charAt(index));
            index++;
        }

        word.charAt(index);
        

        keyboard.close();
    }
}
