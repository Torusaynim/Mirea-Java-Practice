package ru.mirea.lab16;

public interface Order {
    boolean add(Item d);
    void remove(String ItemName);
    int removeAll(String ItemName);
    int itemQuantity();
    int itemQuantity(String itemName);
    Item[] getItems();
    double costTotal();
    String[] itemsNames();
}