package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше предложение: ");
        String proposal = in.nextLine();
        System.out.println("Строка в обратном порядке: ");
        for (int i = proposal.length() - 1; i >= 0; i--) {
            char[] newProposal = proposal.toCharArray();
            System.out.print(newProposal[i]);
        }
        System.out.println("Каждое слово предложения с новой строки: ");
        for (String retval : proposal.split(" ")) {
            System.out.println(retval);
        }
        System.out.println("Замена пробелов на *: ");
        System.out.println(proposal.replace(' ', '*'));
        System.out.println("Предложение в верхнем регистре: ");
        System.out.println(proposal.toUpperCase());
        System.out.println("Вывод подстроки: ");
        System.out.println(proposal.substring(4, 9));
    }
}
