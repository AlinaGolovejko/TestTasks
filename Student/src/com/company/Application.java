package com.company;
import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;


public class Application {
    public static final int STUDENTS_SIZE = 5;
    public static final int ALL_TICKETS = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Group firstGroup = new Group();
        Group secondGroup = new Group();
        List<Group> groups = new ArrayList<Group>();
        groups.add(firstGroup);
        groups.add(secondGroup);
        List<Ticket> tickets = new ArrayList<Ticket>(ALL_TICKETS);

        for (int i = 0; i <= ALL_TICKETS - 1; i++){
            Ticket newTicket = new Ticket();
            newTicket.id = i;
            newTicket.question = "Question " + (i + 1);
            tickets.add(newTicket);
        }
        for (int j = 0; j <= groups.size() - 1; j++){
            out.println("Group " + (j + 1) + ":");
            Group currentGroup = groups.get(j);
            currentGroup.students = new ArrayList<Student>(STUDENTS_SIZE);
            currentGroup.results = new int[STUDENTS_SIZE];
            for (int i = 0; i <= STUDENTS_SIZE - 1; i++ ){
                Student newStudent = new Student();
                System.out.print("Input name: ");
                newStudent.name = in.nextLine();
                System.out.print("Input lastName: ");
                newStudent.lastName = in.nextLine();
                newStudent.ticket = tickets.get((int) (Math.random() * ALL_TICKETS));
                currentGroup.students.add(newStudent);
                currentGroup.results[i] = (int) (Math.random() * STUDENTS_SIZE + 1);
                out.println("Student - " + newStudent.name + " " + newStudent.lastName + ", ticket - " + newStudent.ticket.question + ", marks of exam - " + currentGroup.results[i]);
            }
            out.println();
            out.println("Average of all students marks: " + getAverageValue(currentGroup.results));
            int betterStudentIndex = getMaxValueIndex(currentGroup.results);
            out.println("Better student: " + currentGroup.students.get(betterStudentIndex).name + " " + currentGroup.students.get(betterStudentIndex).lastName + " " + currentGroup.results[betterStudentIndex]);
            int badlyStudentIndex = getMinValueIndex(currentGroup.results);
            out.println("Badly student: " + currentGroup.students.get(badlyStudentIndex).name + " " + currentGroup.students.get(badlyStudentIndex).lastName + " " + currentGroup.results[badlyStudentIndex]);
            out.println();
        }
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

private static int getMaxValueIndex(int[] results){
        int max = results[0], index = 0;
        if (results.length > 0)
        {
            for (int j = 0; j < results.length; j++) {
                if (max <= results[j]) {
                    max = results[j];
                    index = j;
                }
            }
        }
        return index;
    }

private static int getMinValueIndex(int[] results){
        int min = results[0], index = 0;
        if (results.length > 0)
        {
            for (int j = 0; j < results.length; j++) {
                if (min >= results[j]) {
                    min = results[j];
                    index = j;
                }
            }
        }
        return index;
    }
}
