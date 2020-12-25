package ru.mirea.lab16;

public class MenuItem {
    protected String name;
    protected String description;
    protected Integer cost;
    public int getCost() {
        return cost;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
}