package ru.mirea.lab16;

import java.util.HashMap;

public class OrderManager {
    HashMap<String, InternetOrder> int_order = new HashMap<>();
    RestaurantOrder[] orders = new RestaurantOrder[10];
    OrderManager(){
        for (int i = 0;i<10;i++)
            orders[i] = null;
    }
    public void add(RestaurantOrder order, int tableNumber) throws OrderAlreadyAddedException{
        try {
            if(tableNumber > 9) throw new IllegalTableNumber();
            try {
                if (orders[tableNumber] == null)
                    orders[tableNumber] = order;
                else throw new OrderAlreadyAddedException();
            }
            catch(OrderAlreadyAddedException e){
                System.out.println(e.Error(order));
            }
        }
        catch(IllegalTableNumber e){
            System.out.println(e.Error());
        }
    }
    public RestaurantOrder getOrder(int tableNumber){
        try {
            if (tableNumber > 9) throw new IllegalTableNumber();
            return orders[tableNumber];
        }
        catch(IllegalTableNumber e){
            System.out.println(e.Error());
        }
        return null;
    }
    public void addDish(Item dish, int tableNumber){
        try {
            if (tableNumber > 9) throw new IllegalTableNumber();
            orders[tableNumber].add(dish);
        }
        catch(IllegalTableNumber e){
            System.out.println(e.Error());
        }
    }
    public void removeOrder(int tableNumber){
        try {
            if (tableNumber > 9) throw new IllegalTableNumber();
            if(orders[tableNumber] != null)
                orders[tableNumber] = null;
        }
        catch(IllegalTableNumber e) {
            System.out.println(e.Error());
        }
    }
    public int freeTableNumber(){
        for(int i =0;i<10;i++)
            if(orders[i] == null)
                return i;
        return 0;
    }
    public int[] freeTableNumbers(){
        int i = 0, j = 0;
        for(RestaurantOrder ord: orders)
            if(ord == null)
                i++;
        int[] mas = new int[i];
        for(int k = 0;k<10;k++)
            if(orders[k] == null) {
                mas[j] = k;
                j++;
            }
        return mas;
    }
    public RestaurantOrder[] getOrders(){
        int a = 0, j = 0;
        for(RestaurantOrder ord: orders)
            if(ord != null)
                a++;
        RestaurantOrder[] mas = new RestaurantOrder[a];
        for(RestaurantOrder ord: orders)
            if(ord != null) {
                mas[j] = ord;
                j++;
            }
        return mas;
    }
    public double orderCostSummary(){
        double sum = 0;
        for(RestaurantOrder ord: orders){
            if(ord != null)
                sum += ord.costTotal();
        }
        return sum;
    }
    public int dishQuantity(String dishName){
        int q = 0;
        for(RestaurantOrder ord: orders){
            if(ord != null)
                q += ord.itemQuantity(dishName);
        }
        return q;
    }
    public void add(String adress, InternetOrder ord){
        try {
            if(!int_order.containsKey(adress))
                int_order.put(adress, ord);
            else throw new OrderAlreadyAddedException();
        }
        catch(OrderAlreadyAddedException e){
            System.out.println(e.Error(ord));
        }
    }
    public InternetOrder getOrder(String adress){
        for(String str: int_order.keySet())
            if(str.equals(adress))
                return int_order.get(str);
        return null;
    }
    public void removeOrder(String adress){
        int_order.remove(adress);
    }
    public void addDish(String adress, Item item){
        for(String str: int_order.keySet())
            if(str.equals(adress))
                int_order.get(str).add(item);
    }
    public InternetOrder[] get_int_ord(){
        return int_order.values().toArray(new InternetOrder[0]);
    }
    public double int_ord_sum(){
        double d = 0;
        for(String str: int_order.keySet())
            d += int_order.get(str).costTotal();
        return d;
    }
    public int func(String itemName){
        int a = 0;
        for(InternetOrder ord: int_order.values())
            a+=ord.itemQuantity(itemName);
        return a;
    }
}
