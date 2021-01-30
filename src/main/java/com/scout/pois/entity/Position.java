package com.scout.pois.entity;

/**
 * @author:Scout
 * @data:2021/1/25
 * @description:
 */
public class Position {
    private double x;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double y;


    public void setPositon(double x,double y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
