public class Character {
    //Class Variables: aka - immortals
    private static int numberCreated;

    //Defining properties aka - planewalkers... independent of methods
    private final int MAX_HIT_POINTS;
    private String name;
    private int hitPoints, armorClass;

    public Character(String name) {
        this(name, 1);
    }

    public Character(String name, int hitpoints) {
        this(name, hitpoints, 10);
        // this.name = name;
        // MAX_HIT_POINTS = hitPoints;
        // setHitPoints(hitPoints);
        // setArmorClass(10);
    }

    public Character(String name, int hitPoints, int armorClass) {
        this.name = name;
        MAX_HIT_POINTS = hitPoints;
        setHitPoints(hitPoints);
        setArmorClass(armorClass);
        numberCreated++;
    } 

    public String getName() {
        return this.name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getArmorClass() {
        return this.armorClass;
    }

    public int getMaxHitPoints() {
        return MAX_HIT_POINTS;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0) {
            this.hitPoints = 0;
        } else if(hitPoints > MAX_HIT_POINTS) {
            hitPoints = MAX_HIT_POINTS;
        } else { 
            this.hitPoints = hitPoints;
        }
    }

    public void setArmorClass(int armorClass) {
        if (armorClass < 10) {
            this.armorClass = 10;
        } else {
            this.armorClass = armorClass;
        }
        this.armorClass = armorClass;
    }

    public void takePotion() {
        //local variables - aka: inhbitants
        int healing;
        if (hitPoints < MAX_HIT_POINTS) {
            healing = AdventureUtils.rollDie(AdventureUtils.Die.D4);
            setHitPoints(hitPoints + healing);

        }

    }

    public void takeDamage (int damage) {
        setHitPoints( hitPoints - damage);
    }

    public String toString() {
      return "My name is " + getName() + " and I have " + getHitPoints() + 
        " hp and I have an armor class of " + getArmorClass();
    }

    public static int getNumberCreated() {
        return numberCreated;
    }
}
