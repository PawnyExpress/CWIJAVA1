

public class PairOfDice {
    private final int MAX;
    private int faceValueOne, faceValueTwo,total;
    
    Die dieOne, dieTwo;

    
    public PairOfDice(){
        
        dieOne = new Die();
        dieTwo = new Die();
        MAX = 6;
    }

    public PairOfDice(int numSides) {      
        MAX = numSides;
        dieOne = new Die(numSides);
        dieTwo = new Die(numSides);
        
    }

    public int getFaceValue1() {
        faceValueOne = dieOne.getFaceValue();
        return faceValueOne;
    }

    public int getFaceValue2() {
        faceValueTwo = dieTwo.getFaceValue();
        return faceValueTwo;
    }

    public int getTotal() {
        total = getFaceValue1() + getFaceValue2();
        return total;
    }

    public void roll() {
        dieOne.roll();
        dieTwo.roll();
    }

    public String toString() {
        String result = getTotal() + " ("+ getFaceValue1() + " + " + getFaceValue2() + ")";
        return result;
    }
}
