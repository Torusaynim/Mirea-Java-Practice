package ru.mirea.lab16;

public class RestaurantOrder implements Order{
    private int size;
    Item[] dishes = new Item[50];
    RestaurantOrder(){
        for(Item it:dishes)
            it = null;
    }
    public boolean add(Item d){
        for(int i = 0;i<50;i++)
            if(dishes[i] == null) {
                dishes[i] = d;
                break;
            }
        return true;
    }
    public void remove(String ItemName){
        for(int i = 0;i<50;i++) {
            System.out.println(dishes[i].getName());
            if(dishes[i].getName().equals(ItemName)) {
                System.out.println(dishes[i].getName());
                dishes[i] = null;
                break;
            }
        }
    }
    public int removeAll(String ItemName){
        for(int i = 0;i<50;i++)
            if(dishes[i]!=null)
                if(dishes[i].getName().equals(ItemName))
                    dishes[i] = null;
        return 0;
    }
    public int itemQuantity(){
        int q=0;
        for(Item it: dishes)
            if(it != null)
                q++;
        return q;
    }
    public int itemQuantity(String itemName){
        int q=0;
        for(Item it: dishes)
            if(it != null)
                if(it.getName().equals(itemName))
                    q++;
        return q;
    }
    public Item[] getItems(){
        int j = 0;
        Item[] d = new Item[itemQuantity()];
        for(Item it:dishes)
            if (it != null) {
                d[j] = it;
                j++;
            }
        return d;
    }
    public double costTotal(){
        double price = 0;
        for(int i = 0;i<50;i++)
            if(dishes[i] != null)
                price += dishes[i].getCost();
        return price;
    }
    public String[] itemsNames(){
        int i = 0;
        String[] mas = new String[itemQuantity()];
        for(Item it: dishes)
            if(it != null) {
                mas[i] = it.getName();
                i++;
            }
        return mas;
    }
    public Item[] sort_by_price(){
        int j = 0;
        Item[] d = new Item[itemQuantity()];
        for(Item it:dishes)
            if (it != null) {
                d[j] = it;
                j++;
            }
        boolean isSorted = false;
        Item buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < d.length-1; i++) {
                if(d[i].getCost() < d[i+1].getCost()){
                    isSorted = false;
                    buf = d[i];
                    d[i] = d[i+1];
                    d[i+1] = buf;
                }
            }
        }
        return d;
    }
}
