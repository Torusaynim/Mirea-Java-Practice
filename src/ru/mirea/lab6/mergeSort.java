package ru.mirea.lab6;

import java.util.Scanner;

public class mergeSort {
    Scanner in=new Scanner(System.in);
    private int size1, size2;

    public void merge(Student[] arr, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i].getId() <= R[j].getId())
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public void sortArr(Student[] arr, int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sortArr(arr, l, m);
            sortArr(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public mergeSort()
    {
        System.out.println("First mas");
        size1=in.nextInt();
        Student[] obj1=new Student[size1];
        for (int i=0; i<size1; i++)
        {
            int id=in.nextInt();
            obj1[i]=new Student(id);
        }

        System.out.println("Second mas");
        size2=in.nextInt();
        Student[] obj2=new Student[size2];
        for (int i=0; i<size2; i++)
        {
            int id = in.nextInt();
            obj2[i] = new Student(id);
        }

        int count=0;
        Student[] res=new Student[obj1.length+ obj2.length];
        for (int i=0; i< obj1.length; i++)
        {
            res[i]=obj1[i];
            count++;
        }
        for (int i=0; i< obj2.length; i++)
            res[count++]=obj2[i];

        sortArr(res, 0, res.length-1);

        for (int i=0; i<res.length; i++)
            System.out.print(res[i].getId()+" ");
    }
}
