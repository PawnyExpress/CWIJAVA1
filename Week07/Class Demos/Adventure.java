import java.util.Random;
import java.util.Scanner;

public class Adventure{
    public static void main(String[] args) {
        final int MAX_HIT_POINTS;
        Scanner scan;
        Random generator;
        String name, description;
        int hitPoints, armorClass, damage, round, healing, dieRoll;
        
        generator = new Random();
        scan = new Scanner(System.in);

        System.out.println("Please enter character name");
        name = scan.nextLine();
       //name = "Arrutodanee";
        System.out.println("Please enter initial hit points:");
        
        hitPoints = MAX_HIT_POINTS = 17;;// = 21;
        System.out.println("Please enter your armor class:");
        //armorClass = scan.nextInt();
        armorClass = 15;
        description = "";


        //attacked by troll
        round = 1;
        System.out.println("Round " + round);
        dieRoll = generator.nextInt(20) + 1;

        if (dieRoll == 20) {
            System.out.println(name + " got critically hit!");
            damage = generator.nextInt(6) + 5 + generator.nextInt(6) + 5; //rolled d6
            hitPoints -= damage;
            description = "Troll hit for ";
            description += damage;
            description += ". ";
            description += name;
            description += " now has ";
            description += hitPoints;
            description += " hp left.";
        } else if (dieRoll >= armorClass) { //Arru just got hit
            damage = generator.nextInt(6) + 5; //rolled d6
            hitPoints -= damage;
            description = "Troll hit for ";
            description += damage;
            description += ". ";
            description += name;
            description += " now has ";
            description += hitPoints;
            description += " hp left.";
        } else { //Troll missed Arru
                System.out.println("The troll missed " + name + ".");
        }
        

        if (dieRoll >= armorClass) { //Arru just got hit
            damage = generator.nextInt(6) + 5; //rolled d6
            hitPoints -= damage;
            description = "Troll hit for ";
            description += damage;
            description += ". ";
            description += name;
            description += " now has ";
            description += hitPoints;
            description += " hp left.";
        } else { //Troll missed Arru
            System.out.println("The troll missed " + name + ".");
        }

        //damage = generator.nextInt(6) + 5; //rolled d6
        healing = generator.nextInt(4) + 1;
        //hitPoints -= damage;

        
        //description = "Troll hit for ";
        //description += damage;
        //escription += ". ";
        //description += name;
        //description += " now has ";
        //description += hitPoints;
        //description += " hp left.";


        System.out.println(description); 
    
        //round++;
        //damage = generator.nextInt(6) + 5; //rolled d6
        //hitPoints -= damage;
        //System.out.println("Round " + round);
        //System.out.println("Troll hit for " + damage + ". " + name + " now has " + hitPoints + " hp left");

        //chug healing potion
        //round++;
        //damage = generator.nextInt(6) + 5; //rolled d6
        //hitPoints -= damage;
        if (hitPoints < MAX_HIT_POINTS) {
            healing = generator.nextInt(4) + 1;
            hitPoints += healing;
            if (hitPoints > MAX_HIT_POINTS) {
                hitPoints = MAX_HIT_POINTS;
            }
            System.out.println(name + " chuggs a potion for " + healing + " points of healing"); 
        } else {
            System.out.println("No healing required!");
        }
        //healing = generator.nextInt(4) + 1;
        //hitPoints += healing;
        System.out.println("Round " + round);
        System.out.println("You drink a potion for: +" + healing + " hp");
        //System.out.println("Troll hit for " + damage + ". " + name + " now has " + hitPoints + " hp left");

        scan.close();

    }

}