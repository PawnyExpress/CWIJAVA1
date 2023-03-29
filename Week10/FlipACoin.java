public class FlipACoin {
    public static void main(String[] args) {
        int result;
        System.out.println("I am going to flip a coin...");
        result = AdventureUtils.rollDie(AdventureUtils.Die.D2);
        System.out.println("It came up " + (result == 1 ? "Heads" : "Tails"));
    }
}
