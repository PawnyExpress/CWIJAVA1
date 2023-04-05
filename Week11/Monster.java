public class Monster {
    private String name;
    private int attackBonus;
    private AdventureUtils.Die damageDie;

    public Monster(String name, int attackBonus, AdventureUtils.Die damagaDie) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.damageDie = damagaDie;
    }

    public String getName(){
        return name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public AdventureUtils.Die getDamageDie() {
        return damageDie;
    }
}
