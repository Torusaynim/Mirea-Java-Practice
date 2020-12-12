package ru.mirea.lab3;

public class Circle extends Shape {
    protected  double radius;

    public Circle(){};
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public String toString()
    {
        if(filled) return "This filled circle is "+color;
        else return "This empty circle is "+color;
    }
}