package ru.mirea.lab12;

import java.util.StringTokenizer;

public class Adress {
    String country, region, city, street, house, corps, apartment;
    Adress(String adress)
    {
        StringTokenizer tokenZ=new StringTokenizer(adress, ",.;- ");
        if (tokenZ.hasMoreElements()==true)
        {
            country=tokenZ.nextToken();
            region=tokenZ.nextToken();
            city=tokenZ.nextToken();
            street=tokenZ.nextToken();
            house=tokenZ.nextToken();
            corps=tokenZ.nextToken();
            apartment=tokenZ.nextToken();
        }

        System.out.println(country+" "+region+" "+city+" "+street+" "+house+" "+corps+" "+apartment);
    }
}
