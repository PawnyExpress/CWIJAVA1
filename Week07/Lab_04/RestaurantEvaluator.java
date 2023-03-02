import java.util.Scanner;

public class RestaurantEvaluator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean fish, pizza, vegan;
        String answer;



        System.out.println("Answer true or false, does the restaurant offer fish entrees?");
        fish = scan.nextBoolean();
        System.out.println("Answer true or false, does the restaurant offer pizza as an option?");
        pizza = scan.nextBoolean();
        System.out.println("Answer true or false, does the restaurant offer any vegan options?");
        vegan = scan.nextBoolean();

        //if ((fish || pizza) && vegan){
        //    System.out.println("Let's go!");
        //} else {
        //    System.out.println("Sorry, we'll have to think of somewhere else");
        //}

        
        answer = ((fish || pizza) && vegan) ? "Let's go!" : "Sorry, we'll have to think of somewhere else" ;
        System.out.println(answer);

        scan.close();
    }
    
}