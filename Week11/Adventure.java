

public class Adventure {
    public static void main(String[] args) {
        //final int MAX_HIT_POINTS;
        int healing, round;
        double healthBar;

        Character arru, vesper, dovak;

        System.out.println("Number created value: " + Character.getNumberCreated());
        
        arru = new Character("Arru", 17, 10);
        dovak = new Character("Dovakhin", 22, 22);
        vesper = new Character("Vesper", 12, 13);

        System.out.println("Number created value: " + Character.getNumberCreated());

        System.out.println(arru);
        System.out.println(dovak);
        System.out.println(vesper);


        round = 1;
        do {
            System.out.println("\nRound " + round);
            //Arru.setHitPoints(AdventureUtils.monsterAttack(Arru));
            AdventureUtils.monsterAttack(arru, 4, "Dracula", AdventureUtils.Die.D20);
            System.out.println(arru);
            round++;
        } while (arru.getHitPoints() > 0);

        System.out.println();
        // Chug healing potion
        arru.takePotion();
        // if (Arru.getHitPoints() < Arru.getMaxHitPoints()) {
        //     healing = AdventureUtils.rollDie(AdventureUtils.Die.D4);
        //     Arru.setHitPoints(Arru.getHitPoints() + healing);
        //     if (Arru.getHitPoints() > Arru.getMaxHitPoints()) {
        //         Arru.setHitPoints(Arru.getMaxHitPoints());
        //     }
        //     System.out.println(Arru.getName() + " chugs a potion for " + healing + " points of healing!");
        // } else {
        //     System.out.println("No healing required!");
        // }

        // Calculate percent health
        healthBar = (double)arru.getHitPoints() / arru.getMaxHitPoints();

        System.out.println("Health Bar Percent: " + healthBar);

        System.out.println(arru);
    }

  
}
