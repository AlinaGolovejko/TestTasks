package com.company;
import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;


public class Application {
    public static final int STUDENTS_SIZE =5;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] results = new int[STUDENTS_SIZE];
        List<Student> students = new ArrayList<Student>(STUDENTS_SIZE);
        for( int i = 0; i <= 4; i++ ){
            Student newStudent = new Student();
            System.out.print("Input name: ");
            newStudent.name = in.nextLine();
            System.out.print("Input lastName: ");
            newStudent.lastName = in.nextLine();
            students.add(newStudent);
            out.println("Student " + (i + 1) + ": " + newStudent.name + " " + newStudent.lastName);
            }

        int b = 6;
        for (int i = 0; i <= students.size() - 1; i++ ){
            Student st = students.get(i);
            results[i] = (int) (Math.random() * b);
            out.println(st.name + " " + st.lastName + ": " + results[i]);
        }
        out.println("Average of all students marks:" + getAverageValue(results));
     }

private static float getAverageValue(int[] results){
    float average = 0;
    if (results.length > 0)
    {
        float sum = 0;
        for (int j = 0; j < results.length; j++) {
            sum += results[j];
        }
        average = sum / results.length;
    }
    return average;
}
}
