package ru.mirea.lab10;

public class Main {

    public static void main(String[] args) {

        ChairFactory chairFactory = new ChairFactory();

        Client client = new Client();

        client.setChair(chairFactory.createFunctionalChair());

        client.sit();

        client.setChair(chairFactory.createMagicChair());

        client.sit();

        client.setChair(chairFactory.createVictorianChair());

        client.sit();
    }
}
