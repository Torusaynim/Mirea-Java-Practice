package ru.mirea.lab8;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        try(FileWriter writer = new FileWriter("text.txt", false))
        {
            String text = in.nextLine();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("text.txt"))
        {
            int c;
            while((c=reader.read())!=-1)
                System.out.print((char)c);
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("");

        try(FileWriter writer = new FileWriter("text.txt", false))
        {
            String text = in.nextLine();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("text.txt", true))
        {
            String text = in.nextLine();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
