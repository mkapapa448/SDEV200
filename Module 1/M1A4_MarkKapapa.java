/** 
 * Module 1 Assignment 4
 * SDEV 200 - Software Development with Java
 * Mark Kapapa
 * Due: 11/3/2025 - Completed 11/4/2025
*/

import java.lang.Math;
public class M1A4_MarkKapapa {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Polygon 1:\nPerimeter: " + String.valueOf(polygon1.getPerimeter()) + "\nArea: " + String.valueOf(polygon1.getArea()));
        System.out.println("\nPolygon 2:\nPerimeter: " + String.valueOf(polygon2.getPerimeter()) + "\nArea: " + String.valueOf(polygon2.getArea()));
        System.out.println("\nPolygon 3:\nPerimeter: " + String.valueOf(polygon3.getPerimeter()) + "\nArea: " + String.valueOf(polygon3.getArea()));
    }
}

class RegularPolygon {
    private int n = 3;
    private int side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    public RegularPolygon(int N, int SIDE) {
        n = N;
        side = SIDE;
        x = 0;
        y = 0;
    }
    public RegularPolygon(int N, int SIDE, double X, double Y) {
        n = N;
        side = SIDE;
        x = X;
        y = Y;
    }
    public int numberOfSides() {
        return n;
    }
    public int lengthOfSides() {
        return side;
    }
    public double xCoordinate() {
        return x;
    }
    public double yCoordinate() {
        return y;
    }
    public void setNumberOfSides(int sidesNum) {
        n = sidesNum;
    }
    public void setLengthOfSides(int sideLength) {
        side = sideLength;
    }
    public void setXCoordinate(double newXCoordinate) {
        x = newXCoordinate;
    }
    public void setYCoordinate(double newYCoordinate) {
        y = newYCoordinate;
    }
    public double getPerimeter() {
        return side * n;
    }
    public double getArea() {
        return (n * Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
    }

} 