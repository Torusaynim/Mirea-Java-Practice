package ru.mirea.lab12;

public class PhoneNumber {

    PhoneNumber(String number)
    {
        String answer="";
        int size=number.length();
        if (number.charAt(0)=='+')
        {
            size--;
            number=number.substring(1);
            answer+="+";
        }

        String code=number.substring(0,number.length()-10);

        number=number.substring(code.length());

        answer+=code;
        answer+=number.substring(0,3)+"-"+number.substring(3,6)+"-"+number.substring(6,10);

        System.out.println(answer);
    }
}
