package ru.mirea.lab7;

public class myStack {

    int size, i = -1;
    int stack[];

    myStack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public boolean isFull() {
        if (i >= size-1)
        {
            System.out.println("Stack overflow");
            return true;
        } else return false;
    }

    public boolean isEmpty() {
        if (i == -1) {
            System.out.println("Stack underflow");
            return true;
        } else return false;
    }

    public void add(int num) {
        i++;
        stack[i] = num;
    }

    public void delete() {
        stack[i] = -1;
        i--;
    }

    public int get() {
        return stack[i];
    }

    public void printAll()
    {
        for (int j=i; j>-1; j--)
            System.out.print(stack[j]+" ");
    }
}
