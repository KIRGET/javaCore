package com.kirget.javacore.chapter07;

// Демонстрация некоторых методов из класса string

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "первая сторка";
        String strOb2 = "вторая сторка";
        String strOb3 = strOb1;

        System.out.println("Длина строки str0b1 : " + strOb1.length() );

        System.out.println(" Символ по индексу 3 в сторке strOb1 : " + strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println(strOb1 == strOb2);

        else
            System.out.println(strOb1 != strOb2);

        if (strOb1.equals(strOb3))
            System.out.println(strOb1 == strOb3);

        else
            System.out.println(strOb1 != strOb3);
    }
}
