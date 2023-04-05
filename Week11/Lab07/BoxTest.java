package Lab07;

import java.util.ArrayList;
import java.util.Random;

public class BoxTest {
    public static void main(String[] args) {
        Box smallBox;
        smallBox = new Box(4, 5, 2);
        Random gen = new Random();

        System.out.println(smallBox);
        System.out.println("smallBox's width: " + smallBox.getWidth());
        System.out.println("smallBox's height: " + smallBox.getHeight());
        System.out.println("smallBox's depth: " + smallBox.getDepth());
        System.out.println("smallBox's full status: " + smallBox.getFull());
        System.out.println("smallBox's volume: " + smallBox.volume());
        System.out.println("smallBox's surface Area: " + smallBox.surfaceArea());

        System.out.println("\n=== Change smallBox using setters ===\n");
        
        smallBox.setFull(true);
        smallBox.setWidth(2);
        smallBox.setHeight(3);
        smallBox.setDepth(1);

        System.out.println(smallBox);
        System.out.println("smallBox's width: " + smallBox.getWidth());
        System.out.println("smallBox's height: " + smallBox.getHeight());
        System.out.println("smallBox's depth: " + smallBox.getDepth());
        System.out.println("smallBox's full status: " + smallBox.getFull());
        System.out.println("smallBox's volume: " + smallBox.volume());
        System.out.println("smallBox's surface Area: " + smallBox.surfaceArea());

        System.out.println("\n=== Create 5 boxes ===\n");

         ArrayList<Box> listOfBoxes;
         listOfBoxes = new ArrayList<Box>();


        for(int count = 1 ; count <= 5 ; count++){
            Box box = new Box(gen.nextInt(5) + 1, gen.nextInt(5) + 1, gen.nextInt(5) + 1);
            box.setFull(gen.nextBoolean());
            listOfBoxes.add(box);
            System.out.println("Box " + count + ": " + box);
        }
        System.out.println("\n=== Find the Largest Box ===\n");

        Box largest = new Box(0, 0, 0);

        for (Box box : listOfBoxes) {
            if (box.volume() > largest.volume()){
                largest = box;
            }
        }

        System.out.println("Largest Box: " + largest + " with volume " + largest.volume() + " and surface area " + largest.surfaceArea());
        
    }
}
