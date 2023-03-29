import java.util.Random;

public class AdventureUtils {

    public enum Die {D2, D4, D6, D8, D10, D12, D20, D100}

    // public static void printDescription(Character character){
    //     System.out.println("My name is " + character.getName() + " and I have " + character.getHitPoints() + 
    //     " hp and I have an armor class of " + character.getArmorClass() );
    // }

    public static int monsterAttack(Character character){
        Random generator = new Random();
        int dieRoll, damage;
        String description;
        dieRoll = generator.nextInt(20) + 1;
    
        if (dieRoll == 20) {
            System.out.println(character.getName() + " got critically hit!");
            damage = generator.nextInt(6) + 5 + generator.nextInt(6) + 5; //rolled d6
            character.setHitPoints(character.getHitPoints() - damage);
            description = "Troll hit for ";
            description += damage;
            description += ". ";
            description += character.getName();
            description += " now has ";
            description += character.getHitPoints();
            description += " hp left.";
            
            
        } else if (dieRoll >= character.getArmorClass()) { //Arru just got hit
            damage = generator.nextInt(6) + 5; //rolled d6
            character.setHitPoints(character.getHitPoints() - damage);
            description = "Troll hit for ";
            description += damage;
            description += ". ";
            description += character.getName();
            description += " now has ";
            description += character.getHitPoints();
            description += " hp left.";
            
        } else { //Troll missed Arru
                System.out.println("The troll missed " + character.getName() + ".");
                
        }
        //System.out.println(description);

        // if (character.getHitPoints() < 0){
        //     character.setHitPoints(0);
        // }

        return character.getHitPoints();
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