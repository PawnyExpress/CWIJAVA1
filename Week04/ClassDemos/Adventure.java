import java.util.Random;
import java.util.Scanner;

public class Adventure{
    public static void main(String[] args) {
        final int MAX_HIT_POINTS;
        Scanner scan;
        Random generator;
        String name, description;
        int hitPoints, armorClass, damage, round, healing;
        
        generator = new Random();
        scan = new Scanner(System.in);

        System.out.println("Please enter character name");
        name = scan.nextLine();
       //name = "Arrutodanee";
        System.out.println("Please enter initial hit points:");
        
        hitPoints = MAX_HIT_POINTS = scan.nextInt();;// = 21;
        System.out.println("Please enter your armor class:");
        armorClass = scan.nextInt();
        //armorClass = 15;
        description = "";
        //attacked by troll
        round = 1;
        damage = generator.nextInt(6) + 5; //rolled d6
        healing = generator.nextInt(4) + 1;
        hitPoints -= damage;

        System.out.println("Round " + round);
        description = "Troll hit for ";
        description += damage;
        description += ". ";
        description += name;
        description += " now has ";
        description += hitPoints;
        description += " hp left.";
        System.out.println(description); 
    
        round++;
        damage = generator.nextInt(6) + 5; //rolled d6
        hitPoints -= damage;
        System.out.println("Round " + round);
        System.out.println("Troll hit for " + damage + ". " + name + " now has " + hitPoints + " hp left");

        //chug healing potion
        round++;
        damage = generator.nextInt(6) + 5; //rolled d6
        hitPoints -= damage;
        healing = generator.nextInt(4) + 1;
        hitPoints += healing;
        System.out.println("Round " + round);
        System.out.println("You drink a potion for: +" + healing + " hp");
        System.out.println("Troll hit for " + damage + ". " + name + " now has " + hitPoints + " hp left");

    }

}