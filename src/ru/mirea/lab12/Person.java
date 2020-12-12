package ru.mirea.lab12;

import java.util.Scanner;

public class Person {
    Scanner in= new Scanner(System.in);
    String surname, name, middlename;

    Person(String fullname)
    {
        int indexSpace=fullname.indexOf(' ');
        if (indexSpace==-1)
        {
            System.out.println(fullname);
            return;
        }
        else
            surname=fullname.substring(0, indexSpace);

        fullname=fullname.substring(indexSpace+1);
        name=fullname.substring(0,1);

        indexSpace=fullname.indexOf(' ');
        if (indexSpace==-1)
        {
            System.out.println(surname+" "+name+".");
            return;
        }
        else
            middlename=fullname.substring(indexSpace+1, indexSpace+2);

        System.out.println(surname+" "+name+"."+middlename+".");
    }
}
