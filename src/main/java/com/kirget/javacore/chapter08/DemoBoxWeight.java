package com.kirget.javacore.chapter08;

// применяем  наследование для рассширения класса Box

class Box {
    double width;
    double height;
    double depth;

    // делаем клон объекта
    Box(Box ob) { // передаем объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор применяемый при отсутствии параметров
    Box() {
        width = -1; // значение -1 служит для обозначения
        height = -1; // неицианилизированного
        depth = -1;  // параллелепипида
    }

    // конструктор применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

    // расширить класс Box включив  в него поле веса
    class BoxWeight extends Box {
        double weight; // вес параллелепипида


        // конструктор BoxWeight();
        BoxWeight(double w, double h, double d, double m) {
            width = w;
            height = h;
            depth = d;
            weight = m;
        }

    }

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);

    }
}
