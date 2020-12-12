package ru.mirea.lab3;

public class Square extends Rectangle {
    public Square(){};
    public Square(double side)
    {
        this.width=side;
        this.length=side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.width=side;
        this.length=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        this.width=side;
        this.length=side;
    }

    @Override
    public void setWidth(double width) {
        this.width=width;
        this.length=width;
    }

    @Override
    public void setLength(double length) {
        this.length=length;
        this.width=length;
    }

    public String toString()
    {
        if(filled) return "This filled square is "+color;
        else return "This empty square is "+color;
    }
}
