package ru.mirea.lab12;

public class Shirt {

    String S, type, color, size;

    Shirt(String element)
    {
        int indexSpace=element.indexOf(',');
        S=element.substring(0, indexSpace);
        element=element.substring(indexSpace+2);

        indexSpace=element.indexOf(',');
        type=element.substring(0, indexSpace);
        element=element.substring(indexSpace+2);

        indexSpace=element.indexOf(',');
        color=element.substring(0, indexSpace);
        element=element.substring(indexSpace+2);

        size=element;
    }

    @Override
    public String toString()
    {
        return "Index: "+this.S+"\ntype: "+this.type+"\ncolor: "+this.color+"\nsize: "+this.size+"\n\n";
    }
}
