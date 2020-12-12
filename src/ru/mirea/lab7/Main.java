package ru.mirea.lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int size;

        System.out.println("Введите размер стека");
        size=in.nextInt();
        myStack st=new myStack(size);

        System.out.println("Ввыберите действие:");
        System.out.println("1. Вставить элемент");
        System.out.println("2. Удалить элемент");
        System.out.println("3. Получить значение элемента");
        System.out.println("4. Вывести все элементы");
        System.out.println("0. Остановить программу");

        int temp=-1;
        while (temp!=0)
        {
            temp=in.nextInt();

            if (temp==1)
            {
                if (st.isFull()==false)
                {
                    System.out.println("Введите значение");
                    int num = in.nextInt();
                    st.add(num);
                }
            }
            if (temp==2)
            {
                if (st.isEmpty()==false)
                {
                    st.delete();
                    System.out.println("Элемент удален");
                }
            }
            if (temp==3)
            {
                if (st.isEmpty()==false)
                {
                    System.out.println("Получен элемент "+st.get());
                }
            }
            if (temp==4)
            {
                if (st.isEmpty()==false)
                {
                    System.out.print("Стек: ");
                    st.printAll();
                    System.out.println("");
                }
            }
        }

    }
}
