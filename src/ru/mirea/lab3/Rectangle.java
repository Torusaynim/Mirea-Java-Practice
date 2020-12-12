package ru.mirea.lab3;

public class Rectangle extends Shape{
    protected double width;
    protected  double length;

    public Rectangle(){};
    public Rectangle(double width, double length)
    {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    public String toString()
    {
        if(filled) return "This filled rectangle is "+color;
        else return "This empty rectangle is "+color;
    }
}
