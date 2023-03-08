package ClassDemos;
public class SwitchDemo {

    public enum Season {SPRING, SUMMER, FALL, WINTER}
    public static void main(String[] args) {

        char yourGrade;
        Season currentSeason;

        currentSeason = Season.WINTER;

        switch (currentSeason) {
            case SPRING:
                System.out.println("Finally able to plant some flowers");
                break;
            case SUMMER:
                System.out.println("Time to show that summer bod");
                break;
            case FALL:
                System.out.println("You can smell the pumpkin spice in the air");
                break;
            case WINTER:
                System.out.println("Time to break out the warm blankets");
                break;
        }

        yourGrade = 'A';

        switch (yourGrade) {
            case 'A': 
                System.out.println("Way to go!!");
                break;
            case 'B':
                System.out.println("Very Good!!!");
                break;
            case 'C':
                System.out.println("Not doing too hot but you can do better!");
                break;
            case 'D':
                System.out.println("It could have been better");
                break;
            case 'F':
                System.out.println("Yikes mate, you doing ok?");
                break;
            default:
                System.out.println("That is not a grade I recognize!"); 
        }

        // if (yourGrade == 'A') {
        //     System.out.println("Way to go!!");
        // } else if (yourGrade == 'B') {
        //     System.out.println("Very Good!!!");
        // } else if (yourGrade =='C') {
        //     System.out.println("Not doing too hot but you can do better!");
        // } else if (yourGrade == 'D') {
        //     System.out.println("It could have been better");
        // } else if (yourGrade == 'F') {
        //     System.out.println("Yikes mate, you doing ok?");
        // } else {
        //     System.out.println("That is not a grade I recognize!");
        // }
    }
}
