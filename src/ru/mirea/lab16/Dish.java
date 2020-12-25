package ru.mirea.lab16;

public class Dish implements Item{
    protected String name;
    protected String description;
    protected Integer cost;
    public Dish(String n, String d, int c){
        if(!n.equals("") && !d.equals("") && c >= 0) {
            name = n;
            description = d;
            cost = c;
        }
        else throw new IllegalArgumentException();
    }
    public Dish(String n, String d){
        if(!n.equals("") && !d.equals("")) {
            name = n;
            description = d;
            cost = 0;
        }
        else throw new IllegalArgumentException();
    }
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