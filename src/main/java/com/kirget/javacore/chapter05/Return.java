package com.kirget.javacore.chapter05;

// Продемонстрировать применение оператора return

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата");

        if (t) return; // возврат в вызывающий код
        System.out.println(" Этот оператор выполнятся не будет. ");

    }
}
