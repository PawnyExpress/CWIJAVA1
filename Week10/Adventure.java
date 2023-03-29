import java.util.Random;
import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        final int MAX_HIT_POINTS;
        Scanner scan;
        Random generator;
        String name, description;
        int hitPoints, armorClass, damage, round, healing, dieRoll;
        double healthBar;
        
        generator = new Random();
        //scan = new Scanner(System.in);

        Character Arru;
        Arru = new Character();

        // Arru.setName("Arru");
        // Arru.setHitPoints(MAX_HIT_POINTS = 20);
        // Arru.setArmorClass(12);

        MAX_HIT_POINTS = 17;

        // Arru.setName("Arru");
        // Arru.setHitPoints(MAX_HIT_POINTS = 20);
        // Arru.setArmorClass(12);
        System.out.println(Arru);
        //AdventureUtils.printDescription(Arru)
        // System.out.println("Please enter character name");
        // name = scan.nextLine();
        //name = "Arrutodanee";
        //System.out.println("Please enter initial hit points:");
        
        //hitPoints = MAX_HIT_POINTS = 17;;// = 21;
        //System.out.println("Please enter your armor class:");
        //armorClass = scan.nextInt();
        //armorClass = 15;
        description = "";


        //attacked by troll
        round = 1;
        // do {
        //     System.out.println("Round " + round++);
        //     Arru.setHitPoints() < MAX_HIT_POINTS;
        //     dieRoll = generator.nextInt(20) + 1;
    
        //     if (dieRoll == 20) {
        //         System.out.println(Arru.getName + " got critically hit!");
        //         damage = generator.nextInt(6) + 5 + generator.nextInt(6) + 5; //rolled d6
        //         Arru.hitPoints -= damage;
        //         description = "Troll hit for ";
        //         description += damage;
        //         description += ". ";
        //         description += Arru.name;
        //         description += " now has ";
        //         description += hitPoints;
        //         description += " hp left.";
        //     } else if (dieRoll >= Arru.armorClass) { //Arru just got hit
        //         damage = generator.nextInt(6) + 5; //rolled d6
        //         Arru.hitPoints -= damage;
        //         description = "Troll hit for ";
        //         description += damage;
        //         description += ". ";
        //         description += Arru.name;
        //         description += " now has ";
        //         description += hitPoints;
        //         description += " hp left.";
        //     } else { //Troll missed Arru
        //             System.out.println("The troll missed " + Arru.getName + ".");
        //     }
        //     AdventureUtils.printDescription(Arru.name, Arru.hitPoints, Arru.armorClass);
        //     System.out.println();
        // } while (Arru.hitPoints > 0);
       
        

        // if (dieRoll >= armorClass) { //Arru just got hit
        //     damage = generator.nextInt(6) + 5; //rolled d6
        //     hitPoints -= damage;
        //     description = "Troll hit for ";
        //     description += damage;
        //     description += ". ";
        //     description += name;
        //     description += " now has ";
        //     description += hitPoints;
        //     description += " hp left.";
        // } else { //Troll missed Arru
        //     System.out.println("The troll missed " + name + ".");
        // }

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
        if (Arru.getHitPoints < MAX_HIT_POINTS) {
            healing = Adventure.dieRoll(AdventureUtils.Die.D4);
            Arru.setHitPoints(Arru.getHitPoints() + heling);
            if (Arru.hitPoints > MAX_HIT_POINTS) {
                Arru.hitPoints = MAX_HIT_POINTS;
            }
            System.out.println(Arru.name + " chuggs a potion for " + healing + " points of healing"); 
        } else {
            System.out.println("No healing required!");
        }
        //healing = generator.nextInt(4) + 1;
        //hitPoints += healing;
        //System.out.println("Round " + round);
        System.out.println("You drink a potion for: +" + healing + " hp");
        //System.out.println("Troll hit for " + damage + ". " + name + " now has " + hitPoints + " hp left");

        healthBar = (double)Arru.hitPoints / MAX_HIT_POINTS;

        System.out.println("Health Bar percent: " + healthBar);

        //System.out.println("My name is " + name + " and I have " + hitPoints + 
        //" hp and I have an armor class of " + armorClass );
        
        //System.out.println();

        //scan.close();

    }

    // private static void printDescription(String name, int hitPoints, int armorClass){
    //     System.out.println("My name is " + name + " and I have " + hitPoints + 
    //     " hp and I have an armor class of " + armorClass );
    // }
}
