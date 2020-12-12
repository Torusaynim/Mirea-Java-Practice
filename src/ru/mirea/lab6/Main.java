package ru.mirea.lab6;

import java.util.Scanner;

public class Main {

    public static void quickSSort(SortingByGPA[] array, int low, int high)
    {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        SortingByGPA opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;

        while (i <= j)
        {
            while (array[i].compareTo(opora)==-1)
                i++;

            while (array[j].compareTo(opora)==1)
                j--;

            if (i <= j)
            {
                SortingByGPA temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSSort(array, low, j);

        if (high > i)
            quickSSort(array, i, high);
    }

    public static void main(String[] args)
    {
        //insSort temp=new insSort();

        //Scanner in=new Scanner(System.in);
        //int size=in.nextInt();
        //SortingByGPA[] obj=new SortingByGPA[size];

        //for (int i=0; i<size;i++)
        //{
        //int GPA=in.nextInt();
        //obj[i]=new SortingByGPA(GPA);
        //}

        //quickSSort(obj, 0, size-1);

        //for (int i=0; i<size; i++)
        //System.out.print(obj[i].getGPA()+" ");


        //mergeSort fu = new mergeSort();
    }
}