package ru.mirea.lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class INNCheck {

    Scanner in= new Scanner(System.in);
    ArrayList<String> FIODB= new ArrayList<String>();
    ArrayList<Integer> INNDB= new ArrayList<Integer>();
    String FIO="";
    int INN;

    INNCheck()
    {
        System.out.println("Введите базу данных в формате: ФИО и ИНН. Введите 0, если закончили");

        FIO+=in.next()+" ";
        if (FIO.equals("0 "))
        {
            return;
        }
        FIO+=in.next()+" ";
        FIO+=in.next();

        while(true)
        {
            FIODB.add(FIO);
            INN=in.nextInt();
            INNDB.add(INN);

            FIO="";
            FIO+=in.next()+" ";
            if (FIO.equals("0 "))
                break;
            FIO+=in.next()+" ";
            FIO+=in.next();
        }

        try{
            checking();
        }
        catch (BadINNException e)
        {
            System.out.println(e.getMessage());
        }
    }

    void checking() throws BadINNException
    {
        System.out.println("Введите ФИО и ИНН");

        FIO="";
        FIO+=in.next()+" ";
        FIO+=in.next()+" ";
        FIO+=in.next();
        INN=in.nextInt();
        for (int i=0; i<FIODB.size(); i++) {
            if (FIODB.get(i).equals(FIO)) {
                if (INNDB.get(i) == INN)
                {
                    System.out.println("Все верно");
                    return;
                }
                else throw new BadINNException("Неверный ИНН");
            }
        }
        throw new BadINNException("ФИО не найдено");
    }
}
