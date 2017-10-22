package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean exit_required = false;
        while (!exit_required) {
            System.out.print("Введите номер дня недели: ");
            String number_of_day = in.nextLine();
            switch (number_of_day) {
                case "1":
                    System.out.println("Понедельник");
                    break;
                case "2":
                    System.out.println("Вторник");
                    break;
                case "3":
                    System.out.println("Среда");
                    break;
                case "4":
                    System.out.println("Четверг");
                    break;
                case "5":
                    System.out.println("Пятница");
                    break;
                case "6":
                    System.out.println("Суббота");
                    break;
                case "7":
                    System.out.println("Воскресенье");
                    break;
                case "exit":
                    exit_required = true;
                    break;
                default:
                    System.out.println("Вы ввели некорректные данные, попробуйте снова!");
                    break;
            }
        }
    }
}
