package ru.mirea.lab10;

public class FunctionalChair implements Chair{

    @Override
    public String toString() {
        return "functional chair. Use my functions";
    }

    int sum(int a, int b)
    {
        return a+b;
    }
}
