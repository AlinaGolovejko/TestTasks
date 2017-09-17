package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter first argument: ");
                float arg1 = Float.parseFloat(checkValue(in.nextLine()));
                System.out.print("Enter second argument: ");
                float arg2 = Float.parseFloat(checkValue(in.nextLine()));
                System.out.print("Enter operator: ");
                String operator = checkValue(in.nextLine());
                Float result = Application.calculate(arg1, arg2, operator);
                if (result != null) System.out.println("Result: " + result);
            }
            catch (NumberFormatException e){
                System.out.println("Please enter number!");
            }
            catch (Exception e){
                System.out.println("Error. Try again!");
          }
        }
    }


    private static String checkValue(String value){
        if(value.equals("quit")) {
            System.exit(0);
        }
        return value;
    }
}
