package ru.mirea.lab10;

public class Client {
    public Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit(){
        System.out.println("I am sitting on "+chair);
    }
}
