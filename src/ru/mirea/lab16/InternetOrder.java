package ru.mirea.lab16;

import java.util.HashMap;

public class InternetOrder implements Order{
    private final Node head;
    private int size;
    public InternetOrder(){
        this.head = new Node(null, null, null, 0);
        this.head.next = this.head.prev = this.head;
    }
    public InternetOrder(Item[] mas){
        this();
        for (Item ma : mas) add(ma);
    }
    public boolean add(Item d){
        if (d.getName() != null) {
            Node last = new Node(this.head, this.head.prev, d.getName(), d.getCost());
            this.head.prev = this.head.prev.next = last;
            this.size++;
        }
        return true;
    }

    public void remove(String ItemName) {
        boolean result;
        if (result = ItemName != null && size != 0) {
            Node delete = null;
            for (Node node = this.head.next; node != this.head; node = node.next) {
                if (node.value.equals(ItemName)) {
                    delete = node;
                }
            }
            if (result = delete != null) {
                delete.prev.next = delete.next;
                delete.next.prev = delete.prev;
                this.size--;
            }
        }
    }

    public int removeAll(String ItemName) {
        int a = 0;
        for (Node node = this.head.next; node != this.head; node = node.next) {
            if (node.value.equals(ItemName)) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                this.size--;
                a++;
            }
        }
        return a;
    }

    public String[] itemsNames(){
        String[] mas = new String[size];
        for(int i = 0; i<size; i++){
            mas[i] = getNodeByIndex(i).value;
        }
        return mas;
    }

    public int itemQuantity() {//число блюд
        return size;
    }

    public int itemQuantity(String itemName){
        int a = 0;
        for(int i = 0;i<size;i++){
            if(itemName.equals(getNodeByIndex(i).value))
                a++;
        }
        return a;
    }

    @Override
    public Item[] getItems() {
        return new Item[0];
    }
    public double costTotal(){
        int a = 0;
        for(int i = 0; i < size;i++){
            a += getNodeByIndex(i).price;
        }
        return a;
    }

    public Node getNodeByIndex(int index) {
        Node resultNode = null;
        int half = this.size / 2;
        int count = half > index ? index : this.size - index - 1;
        for (Node node = (half > index ? this.head.next : this.head.prev); node != this.head; node = (half > index ? node.next : node.prev)) {
            if (count-- == 0) {
                resultNode = node;
                break;
            }
        }
        return resultNode;
    }

    public Object[] names_without_equals(){
        HashMap<Integer, String> h = new HashMap<>();
        for(int i = 0; i<size; i++){
            if(!h.containsValue(getNodeByIndex(i).value))
                h.put(i, getNodeByIndex(i).value);
        }
        return h.values().toArray();
    }

    public Object[] sort_by_price(){
        HashMap<Integer, String> h = new HashMap<>();
        for(int i = 0; i<size; i++)
            if(!h.containsValue(getNodeByIndex(i).value))
                h.put(getNodeByIndex(i).price, getNodeByIndex(i).value);
        Object[] mas = h.entrySet()
                .stream()
                .sorted(HashMap.Entry.<Integer, String>comparingByKey().reversed()).toArray();
        for(int i = 0;i < mas.length;i++){
            mas[i] = mas[i].toString().split("=")[1];
        }
        return mas;
    }

    public static class Node {
        private Node next;
        private Node prev;
        public String value;
        public int price;
        Node(Node next, Node prev, String value, Integer price) {
            this.next = next;
            this.prev = prev;
            this.value = value;
            this.price = price;
        }
    }
}
