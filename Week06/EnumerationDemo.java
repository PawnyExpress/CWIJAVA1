public class EnumerationDemo {

    public enum Season { SPRING, SUMMER, FALL, WINTER }

    public static void main(String[] args) {
        // spring summer fall winter
        //sunday, monday, tuesday, wednesday, thursday, friday, saturday
        //months...

        Season currentSeason;
        currentSeason = Season.WINTER;

        System.out.println(currentSeason); 

    }
}