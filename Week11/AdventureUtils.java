import java.util.Random;

public class AdventureUtils {

    public enum Die {D2, D4, D6, D8, D10, D12, D20, D100}


    public static void monsterAttack(Character character){
       
       monsterAttack(character, 0);
    }

    public static void monsterAttack(Character character, int attackBonus) {
        monsterAttack(character, attackBonus, "Monster");
    }

    public static void monsterAttack(Character character, int attackBonus, String monsterName) {
       monsterAttack(character, attackBonus, monsterName, Die.D6);
       
        // int dieRoll, damage;   
        // String description;
        // dieRoll = rollDie(Die.D20);
    
        // if (dieRoll == 20) {
        //     System.out.println(character.getName() + " got critically hit!");
        //     damage = rollDie(Die.D6) + rollDie(Die.D6) + 4; //rolled d6
        //     //character.setHitPoints(character.getHitPoints() - damage);
        //     character.takeDamage(damage);
        //     description = monsterName + "hit for " + damage + ".";
        // } else if (dieRoll + attackBonus >= character.getArmorClass()) { //Arru just got hit
        //     damage = rollDie(Die.D6) + 4; //rolled d6
        //     //character.setHitPoints(character.getHitPoints() - damage);
        //     character.takeDamage(damage);
        //     description = monsterName + " hit for " + damage + ".";  
        // } else { //Troll missed Arru
        //         description = ("The troll missed " + character.getName() + ".");
                
        // }
        // System.out.println(description);
    }

    public static void monsterAttack(Character character, int attackBonus, String monsterName, Die damageDie) {
        Monster monster = new Monster(monsterName, attackBonus, damageDie);
        monsterAttack(character, monster);
        
        // int dieRoll, damage;   
        // String description;
        // dieRoll = rollDie(Die.D20);
    
        // if (dieRoll == 20) {
        //     System.out.println(character.getName() + " got critically hit!");
        //     damage = rollDie(damageDie) + rollDie(damageDie) + 4; //rolled d6
        //     //character.setHitPoints(character.getHitPoints() - damage);
        //     character.takeDamage(damage);
        //     description = monsterName + "hit for " + damage + ".";
        // } else if (dieRoll + attackBonus >= character.getArmorClass()) { //Arru just got hit
        //     damage = rollDie(damageDie) + 4; //rolled d6
        //     //character.setHitPoints(character.getHitPoints() - damage);
        //     character.takeDamage(damage);
        //     description = monsterName + " hit for " + damage + ".";  
        // } else { //Troll missed Arru
        //         description = ("The troll missed " + character.getName() + ".");
                
        // }
        // System.out.println(description);
    }

    public static void monsterAttack(Character character, Monster monster) {
        int dieRoll, damage;   
        String description;
        dieRoll = rollDie(Die.D20);
    
        if (dieRoll == 20) {
            System.out.println(character.getName() + " got critically hit!");
            damage = rollDie(monster.getDamageDie()) + rollDie(monster.getDamageDie()) + 4; //rolled d6
            //character.setHitPoints(character.getHitPoints() - damage);
            character.takeDamage(damage);
            description = monster.getName() + "hit for " + damage + ".";
        } else if (dieRoll + monster.getAttackBonus() >= character.getArmorClass()) { //Arru just got hit
            damage = rollDie(monster.getDamageDie()) + 4; //rolled d6
            //character.setHitPoints(character.getHitPoints() - damage);
            character.takeDamage(damage);
            description = monster.getName() + " hit for " + damage + ".";  
        } else { //Troll missed Arru
                description = ("The troll missed " + character.getName() + ".");
                
        }
        System.out.println(description);
    }

    public static int rollDie(Die dieToRoll){
        Random gen = new Random();
        int numberFaces;

        switch(dieToRoll) {
            case D2:
            numberFaces = 2;
            break;
            case D4:
            numberFaces = 4;
            break;
            case D6:
            numberFaces = 6;
            break;
            case D8:
            numberFaces = 8;
            break;
            case D10:
            numberFaces = 10;
            break;
            case D12:
            numberFaces = 12;
            break;
            case D20:
            numberFaces = 20;
            break;
            case D100:
            numberFaces = 100;
            break;
            default:
            numberFaces = 1;
        }

    return gen.nextInt(numberFaces) + 1;

    }
}