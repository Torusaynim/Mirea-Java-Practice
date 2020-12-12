package ru.mirea.lab9;

import java.util.Scanner;

public class LabClassDriver {

    private int size;
    Scanner in=new Scanner(System.in);
    Student[] obj;

    LabClassDriver()
    {
        System.out.println("Введите количество студентов");
        size=in.nextInt();
        obj=new Student[size];

        for (int i=0; i<size; i++)
        {
            System.out.println("Введите ФИО и id студента");
            String FIO="";
            FIO+=in.next()+" ";
            FIO+=in.next()+" ";
            FIO+=in.next();
            int id=in.nextInt();
            obj[i]=new Student(id, FIO);
        }
    }

    public void insertSort()
    {
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

    public boolean findStudent(String FIO)
    {
        for (int i=0; i<size; i++)
        {
            if (obj[i].getFIO().equals(FIO))
                return true;
        }
        return false;
    }

    public int getId(String FIO)
    {
        for (int i=0; i<size; i++)
        {
            if (obj[i].getFIO().equals(FIO))
                return obj[i].getId();
        }
        return 0;
    }
}
