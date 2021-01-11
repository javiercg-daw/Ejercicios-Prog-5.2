package com.javisoft.ejercicios52.ej56;

public class Rectangle {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return this.base *this.height;
    }

    public double getPerimeter() {
        return (this.base + this.height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                '}';
    }
}
