package org.example;

public class Point {
    private int coordinateX;
    private int coordinateY;

    Point(int x, int y) {
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public int getX() {
        return coordinateX;
    }

    public int getY() {
        return coordinateY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}