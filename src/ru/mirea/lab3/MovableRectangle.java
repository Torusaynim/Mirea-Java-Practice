package ru.mirea.lab3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft.x=x1;
        topLeft.y=y1;
        topLeft.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.x=x2;
        bottomRight.y=y2;
        bottomRight.xSpeed=xSpeed;
        bottomRight.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "This is movable rectangle!";
    }

    @Override
    public void moveUp() {
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }
}
