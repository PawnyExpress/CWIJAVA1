package Lab07;

import java.text.DecimalFormat;

public class Box {
    private double width;
    private double height;
    private double depth;
    private boolean full;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.full = false;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public boolean getFull() {
        return full;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth; 
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public double volume() {
        volume = getDepth() * getHeight() * getWidth();
        return volume;
    }

    public double surfaceArea() {
        //surfaceArea = (getWidth() * getHeight() * 2) + ((getHeight() * getDepth() * 2) + (getWidth() * getDepth() * 2));
        //return surfaceArea;
        return 2 * height * width + 2 * height * depth + 2 * width * depth;
    }

    public String toString () {
        DecimalFormat format = new DecimalFormat("#.00");
        String result = (full) ? "A full " : "An empty ";
        //if full then "A full "
        //otherwise "An empty "
        result += format.format(width) + " x ";
        result += format.format(height) + " x ";
        result += format.format(depth) + " box.";

        return result;
    }
}

