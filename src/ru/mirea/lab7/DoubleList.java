package ru.mirea.lab7;

public class DoubleList {
    int size, i=-1;
    int DoubleList[];

    DoubleList(int size)
    {
        this.size=size;
        DoubleList =new int[size];
        for (int j=0; j<size; j++)
            DoubleList[i]=-1;
    }

    public void addRight(int num)
    {
        i++;
        if (i>=size)
        {
            System.out.print("Stack overflow");
            return;
        }
        DoubleList[i]=num;
    }

    public void addLeft(int num)
    {
        i++;
        if (i>=size)
        {
            System.out.print("Stack overflow");
            return;
        }
        for (int j=i-1; j>0; j++)
        {
            DoubleList[j-1]=DoubleList[j];
        }
        DoubleList[0]=num;
    }

    public void delete(int num)
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return;
        }

        int temp=-1;
        for (int j=0; j<size; j++)
        {
            if (DoubleList[j]==num)
                temp=j;
        }
        if (temp==-1)
        {
            System.out.print("Element not found");
            return;
        }
        else
        {
            for (int j=temp; j<i; j++)
                DoubleList[j]=DoubleList[j+1];
        }
        DoubleList[i]=-1;
        i--;
    }

    public int getRight()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return -1;
        }
        return DoubleList[i];
    }

    public int getLeft()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return -1;
        }
        return DoubleList[0];
    }
}
