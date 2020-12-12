package ru.mirea.lab7;

public class myDequeue {
    int size, i=-1;
    int dequeue[];

    myDequeue(int size)
    {
        this.size=size;
        dequeue =new int[size];
        for (int j=0; j<size; j++)
            dequeue[i]=-1;
    }

    public void addRight(int num)
    {
        i++;
        if (i>=size)
        {
            System.out.print("Stack overflow");
            return;
        }
        dequeue[i]=num;
    }

    public void addLeft(int num)
    {
        i++;
        if (i>=size)
        {
            System.out.print("Stack overflow");
            return;
        }
        for (int j=i-1; j>0; j--)
        {
            dequeue[j-1]=dequeue[j];
        }
        dequeue[0]=num;
    }

    public void deleteRight()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return;
        }
        dequeue[i]=-1;
        i--;
    }

    public void deleteLeft()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return;
        }
        for (int j=0; j<i; j++)
        {
            dequeue[j]=dequeue[j+1];
        }
        dequeue[i]=-1;
        i--;
    }

    public int getRight()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return -1;
        }
        return dequeue[i];
    }

    public int getLeft()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return -1;
        }
        return dequeue[0];
    }
}
