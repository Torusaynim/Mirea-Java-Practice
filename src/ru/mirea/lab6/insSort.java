package ru.mirea.lab6;

import java.util.Scanner;

public class insSort {
    Scanner in=new Scanner(System.in);
    private int size;

    public insSort()
    {
        size=in.nextInt();
        Student[] obj=new Student[size];
        for (int i=0; i<size; i++)
        {
            int id=in.nextInt();
            obj[i]=new Student(id);
        }

        for (int i=1; i<size; i++)
        {
            Student t=obj[i];
            int key=obj[i].getId();
            int j=i-1;
            while ((j>=0) && (obj[j].getId()>key))
            {
                obj[j+1]=obj[j];
                j--;
            }
            obj[j+1]=t;
        }
    }
}
