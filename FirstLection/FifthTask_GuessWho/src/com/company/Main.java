package com.company;

import java.util.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frazes = "Алина Головейко";
        char[] new_frazes = frazes.toCharArray();
        String userInputs = "";
        boolean first_in = true;
        System.out.println("Настольный Поле Чудес - Угадай кто?!");
        while (true) {
            System.out.println("Введите букву: ");
            String userInput = in.nextLine();
            if (userInput.length() > 1){
                if (userInput.equalsIgnoreCase(frazes)) {
                    System.out.println("Ура! Вы угадали загаданное слово!");
                    break;
                }
                else {
                    System.out.println("Упс! Вы не угадали загаданное слово!");
                    continue;
                }
            } else if (!first_in && userInputs.toLowerCase().contains(userInput.toLowerCase())){
                System.out.println("Вы вводили уже такую букву! Попробуйте другую");
                continue;
            }
            userInputs = userInputs + userInput;
            for (int i = 0; i <= new_frazes.length - 1; i++) {
                char symbol = Character.toLowerCase(userInput.charAt(0));
                char frazesSymbol = Character.toLowerCase(frazes.charAt(i));
                if (!first_in && new_frazes[i] == '*' && symbol == frazesSymbol){
                    new_frazes[i] = frazes.charAt(i);
                }
                if (first_in && symbol != frazesSymbol && frazesSymbol != ' ') {
                    new_frazes[i] = '*';
                }
            }
            first_in = false;
            System.out.println(String.valueOf(new_frazes));
            if (String.valueOf(new_frazes).equals(frazes)){
                System.out.println("Ура! Вы угадали загаданное слово!");

                break;
            }
        }
    }
}
