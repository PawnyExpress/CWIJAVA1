import java.util.Scanner;

public class Adventure{
    public static void main(String[] args) {
        final int MAX_HIT_POINTS;
        Scanner scan;
        String name, description;
        int hitPoints, armorClass, damage, round, healing;

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
        damage = 7;
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
        hitPoints -= damage;
        System.out.println("Round " + round);
        System.out.println("Troll hit for " + damage + ". " + name + " now has " + hitPoints + " hp left");

        //chug healing potion
        round++;
        hitPoints -= damage;
        healing = 10;
        hitPoints += healing;
        System.out.println("Round " + round);
        System.out.println("Troll hit for " + damage + ". " + name + " now has " + hitPoints + " hp left");

    }

}