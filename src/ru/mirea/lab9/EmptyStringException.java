package ru.mirea.lab9;

public class EmptyStringException extends Exception {
    EmptyStringException(String errorMessage){
        super(errorMessage);
    }
}
