package ru.mirea.diro.ikbo1919;

public class Circle {
    private Point center;
    private double radius;

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{center = " + center + ", radius = " + radius +'}';
    }
}
