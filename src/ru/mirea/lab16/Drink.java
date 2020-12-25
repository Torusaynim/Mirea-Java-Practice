package ru.mirea.lab16;

public final class Drink implements Item{
    protected String name;
    protected String description;
    protected Integer cost;
    public Drink(String n, String d, int c){
        if(!n.equals("") && !d.equals("") && c >= 0) {
            name = n;
            description = d;
            cost = c;
        }
        else throw new IllegalArgumentException();
    }
    public Drink(String n, String d, double av){
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