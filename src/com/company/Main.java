package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Number> box1 = new Box<>(2.0, 3);
        Box<Float> box2 = new Box<>(2.0F, 1.5F);
        System.out.println(box1.getNumber1() + " ; " + box1.getNumber2());
        System.out.println(box2.getNumber1() + " ; " + box2.getNumber2());
        additon(box1, box2);
        multiplication(box1, box2);
    }

    private static void additon(Box<? extends Number> box1, Box<? extends Number> box2) {
        Number n1 = box1.getNumber1();
        Number n2 = box1.getNumber2();
        Number n3 = box2.getNumber1();
        Number n4 = box2.getNumber2();
        Number resultAdd = n1.doubleValue() + n2.doubleValue() + n3.doubleValue() + n4.doubleValue();
        System.out.println("Сумма чисел "+ n1 + " + " + n2 + " + " + n3 + " + " + n4 + " равна = " +resultAdd);

    }

    private static void multiplication(Box<? extends Number> box1, Box<? extends Number> box2) {
        Number n1 = box1.getNumber1();
        Number n2 = box1.getNumber2();
        Number n3 = box2.getNumber1();
        Number n4 = box2.getNumber2();
        Number resultMultiplicaiton = n1.doubleValue() * n2.doubleValue() * n3.doubleValue() * n4.doubleValue();
        System.out.println("Произведение чисел "+ n1 + " х " + n2 + " х " + n3 + " х " + n4 + " равна = " +resultMultiplicaiton);
    }
}
