package com.kirget.javacore.chapter07;

// Использовать массив для предачи методу переменного количества аргументов

public class PassArray {
    static void vaTest (int v[]) {
        System.out.print(" Количество аргументов : " + v.length + " Содержимое ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на порядок создание массива
        // для хранения аргументов

        int n1 [] = {10};
        int n2 [] = {1,2,3};
        int n3 [] = {};
        vaTest(n1); // 1 аргумент
        vaTest(n2); // 2 аргумент
        vaTest(n3); // без аргумента

    }
}
