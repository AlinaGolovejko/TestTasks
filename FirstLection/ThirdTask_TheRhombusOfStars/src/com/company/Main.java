package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер стороны ромба: ");
        Integer size_of_rhombus = in.nextInt();
        String[][] matrix = new String [size_of_rhombus*2 - 1][size_of_rhombus*2 - 1];
        int k = size_of_rhombus*2;
        System.out.println(k);
        int center = size_of_rhombus;
        for(int i=0; i < k; i++) {
            if (i == (k/2)) { continue;}
            for (int j = 0; j < k; j++) {
                if (i < center) {
                    if (j == center - i)
                        System.out.print("*");
                        else if (j == center + i)
                            System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                    if (j == (center + i - (size_of_rhombus * 2) + 1))
                        System.out.print("*");
                        else if (j == ((center - i) + (size_of_rhombus * 2) - 1))
                            System.out.print("*");
                    else
                        System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
