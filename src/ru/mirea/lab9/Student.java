package ru.mirea.lab9;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Student {

    Scanner in=new Scanner(System.in);
    private int id, size;
    private String FIO;

    Student(int id, String FIO)
    {
        this.FIO=FIO;
        this.id=id;
    }

    public int getId()
    {
        return id;
    }

    public String getFIO()
    {
        return FIO;
    }
}
