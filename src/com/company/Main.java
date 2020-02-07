package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую цифру");
    double x1, x2, y;
    int v;
    x1 = in.nextDouble();
        System.out.println("Введите вторую цифру");
    x2 = in.nextDouble();
        System.out.println("Что необходимо сделать?\n1)Сложить\n2)Отнятьc ПИДОР\n");
    v = in.nextInt();
    if (v == 1) {y = x1+x2; System.out.println("Результат сложения = "+ y);}
    if (v == 2) {y = x1-x2; System.out.println("Результат вычитания = "+ y);}
    in.close();
    }
}
