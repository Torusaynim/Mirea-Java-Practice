package ru.mirea.lab6;

import java.util.Scanner;

public class SortingByGPA implements Comparable <SortingByGPA>
{
    Scanner in=new Scanner(System.in);
    private int GPA;

    SortingByGPA(int GPA)
    {
        this.GPA=GPA;
    }

    int getGPA()
    {
        return GPA;
    }

    @Override
    public int compareTo(SortingByGPA o)
    {
        if (this.GPA>o.GPA)
            return 1;
        else
            return -1;
    }
}