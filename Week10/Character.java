public class Character {
    private String name;
    private int hitPoints, armorClass;

    public Character(String newName, int newHitPoints, int newArmorClass) {
        name = newName;
        setHitPoints(newHitPoints);
        setArmorClass(newArmorClass);
    } 

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setHitPoints(int newHitPoints) {
        if (newHitPoints < 0) {
            hitPoints = 0;
        } else { 
            hitPoints = newHitPoints;
        }
        hitPoints = newHitPoints;

    }

    public void setArmorClass(int newArmorClass) {
        if (newArmorClass < 10) {
            armorClass = 10;
        } else {
            armorClass = newArmorClass;
        }
        armorClass = newArmorClass;
    }

    public String toString() {
      return "My name is " + getName() + " and I have " + getHitPoints() + 
        " hp and I have an armor class of " + getArmorClass();
    }
}
