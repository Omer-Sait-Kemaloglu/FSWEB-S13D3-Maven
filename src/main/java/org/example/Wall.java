package org.example;

public class Wall {

    // Instance Variables
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        this.width = Math.max(width, 0); // Negatif değerler için 0
        this.height = Math.max(height, 0); // Negatif değerler için 0
    }

    // Getter Methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter Methods
    public void setWidth(double width) {
        this.width = Math.max(width, 0); // Negatif değerler için 0
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0); // Negatif değerler için 0
    }

    // Method - getArea
    public double getArea() {
        return width * height;
    }
}
