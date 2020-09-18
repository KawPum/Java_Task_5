package ru.mirea.diro.ikbo1919;

public class CircleMovable extends Circle implements Movable{
    public CircleMovable(Point center, int radius){
        super(center,radius);
    }

    @Override
    public void move(int x, int y) {
        this.getCenter().setX(getCenter().getX() + x);
        this.getCenter().setY(getCenter().getY() + y);
    }
}
