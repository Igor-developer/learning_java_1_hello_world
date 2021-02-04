package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задание 1.
        //Вывести в консоль сообщение "Hello world!".
        System.out.println("Hello world!");

        //Задание 2.
        //Возьмите листик в клеточку и выделите квадрат 10х10. Нарисуйте в нём несложную фигуру.
        //Отметьте точками клетки, в которые попала ваша линия.
        //Совет: для большей точности лучше отмечать только те, в которые линия попала больше, чем на ±20%.
        //Выведите это в консоль, записывая пустые клетки как пробелы, а закрашенные, как звёздочки (знак умножения).
        //Команду для вывода вы уже знаете из прошлого урока.
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**      **");
        System.out.println("**      **");
        System.out.println("**      **");
        System.out.println("**      **");
        System.out.println("**      **");
        System.out.println("**      **");
        System.out.println("**********");
        System.out.println("**********");

        //Задание 3.
        //Написать программу, которая будет считывать из консоли слово и выводить его потом на экран.
        System.out.println("Введите слово, которое нужно вывести на экран, и нажмите Enter:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы ввели \"" + scanner.nextLine() + "\".");

        //Задание 4.
        //Написать программу, которая будет считывать из консоли число, и выводить его потом на экран.
        System.out.println("Введите число, которое нужно вывести на экран," +
                " и нажмите Enter (разделитель целой и дробной части точка):");
        System.out.println("Вы ввели " + Double.parseDouble(scanner.nextLine()));

        //Задание 5.
        //Написать программу, которая будет считывать из консоли 2 числа и выводить их сумму.
        System.out.println("Введите первое число, которое требуется сложить" +
                " (разделитель целой и дробной части точка):");
        double d1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите второе число, которое требуется сложить" +
                " (разделитель целой и дробной части точка):");
        double d2 = Double.parseDouble(scanner.nextLine());
        System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));

        scanner.close();
    }
}