package ru.mirea.diro.ikbo1919;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(10, 15);
	    CircleMovable circleMovable = new CircleMovable(point, 5);
	    circleMovable.move(-2, 3);
	    System.out.println(circleMovable);
    }
}
