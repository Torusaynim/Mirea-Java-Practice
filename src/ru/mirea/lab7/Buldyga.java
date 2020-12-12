package ru.mirea.lab7;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Buldyga {

    Buldyga()
    {
        Scanner in= new Scanner(System.in);
        Queue<Integer> first= new LinkedList<>();
        Queue<Integer> second= new LinkedList<>();

        int temp;
        for (int i = 0; i < 5; i++)
        {
            temp=in.nextInt();
            first.add(temp);
        }
        for (int i = 0; i < 5; i++)
        {
            temp=in.nextInt();
            second.add(temp);
        }

        int num1, num2;
        for (int i=1; i<107; i++)
        {
            num1=first.remove();
            num2=second.remove();
            if (num1==0 && num2==9)
            {
                first.add(num1);
                first.add(num2);
            }
            else
            if (num1==9 && num2==0)
            {
                second.add(num1);
                second.add(num2);
            }
            else if (num1>num2)
            {
                first.add(num1);
                first.add(num2);
            }
            else
            {
                second.add(num1);
                second.add(num2);
            }
            if (first.size()==10)
            {
                System.out.print("first "+i);
                return;
            }
            if (second.size()==10)
            {
                System.out.print("second " + i);
                return;
            }
        }
        System.out.print("botva");
    }

}
