public class WhiteBoard {
    public static void main(String[] args) {
        final double MAX_TEMP, MIN_TEMP;
        final int MAX;
        boolean gameOver, filled, isCloudy, isSunny, areEqual;
        boolean inShape, isHealthy, isAvailable, canMarathon;
        boolean isWeekend, isHoliday, isSeasonalBreak, canGoToMountains;
        int total, sum, count, numOne, numTwo, larger, numberOfDimes;
        double bodyTemp;
        char letter;
        String unitText;

        numOne = 13;
        numTwo = 42;

        larger = ((numOne > numTwo)  ? numOne : numTwo);

        System.out.println(larger);

        numberOfDimes = 3;
        
        unitText = (numberOfDimes == 1) ? "dime" : "dimes";
        System.out.println("I have " + numberOfDimes + " " + unitText);



        

        MAX = 2;

        total = 6;
        count = 2;

        if (count != 0 && total/count > MAX) {
            System.out.println("Ready to go!");
        }

        MAX_TEMP = 99.6;
        MIN_TEMP = 95.0;

        bodyTemp = 98.6;

        // Is our temperature in a healthy range?

        if (bodyTemp <= MAX_TEMP && bodyTemp > MIN_TEMP) {
            System.out.println("You appear to have a healthy temperature");
        }
        //if (bodyTemp > MAX_TEMP || bodyTemp <= MIN_TEMP) {
        if (!(bodyTemp <= MAX_TEMP && bodyTemp > MIN_TEMP)) {
            System.out.println("Please seek medical attention");
        }

        //total = 42;
        sum = 42;
        //count = 50;
        letter = 'v';

        inShape = true;
        isHealthy = true;
        isAvailable = true;

        isWeekend = true;
        isHoliday = true;
        isSeasonalBreak = false;
        //areEqual = total == sum;

        if (total == sum) {
            System.out.println("Total equals the sum");
        }

        if (count > 50) {
            System.out.println("Count is more than 50");
        }

        if (letter != 'x') {
            System.out.println("The letter is not 'x'");
        }

        //canMarathon = inShape && isHealthy && isAvailable;
        canMarathon = inShape && isHealthy && (isWeekend || isHoliday || isSeasonalBreak);

        if (canMarathon) {
            System.out.println("Yay! I'm running a marathon!");
            System.out.println("I made it in second place!");
        } else {
            System.out.println("I can't go run a marathon!");
        }  

        //if (!canMarathon) {
        //    System.out.println("I can't go run a marathon!");
        //}

        

        canGoToMountains = isWeekend || isHoliday || isSeasonalBreak;
        if (canGoToMountains) {
            System.out.println("I'm enjoying the fresh mountain air!");
        }
        
        gameOver = false;
        isCloudy = false;
        isSunny = !isCloudy;
        filled = true;

        if (gameOver) {
            System.out.println("Guess it is time to go home!");
        }

        if (!isCloudy) {
            System.out.println("Time to soak up some rays!!");
        }

        if (filled) {
            System.out.println("Stop putting things in");
        }

        System.out.println("Are you still playing? " + gameOver);
        System.out.println("Is it cloudy? " + isCloudy);
        System.out.println("Is it sunny? " + isSunny);
    }
}
