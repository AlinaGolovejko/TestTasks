package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] id = {1, 200, 32, 467, 590, 66, 709, 86, 99, 103};
        String[] firstName = {"Alina", "Elena", "Pavel", "Sergey", "Natalia", "Ivan", "Liza", "Dima", "Viktor", "Anna"};
        String[] lastName = {"Gol", "Mic", "Put", "Trip", "Zal", "Rep", "Glad", "Kov", "Yrt", "Mat"};
        int[] age = {21, 22, 23, 24, 26, 20, 19, 28, 27, 18};
        List<Student> students = new ArrayList<>();
        System.out.println("List of students: ");
        for (int i = 0; i < lastName.length; i++) {
            Student newStudent = new Student();
            newStudent.id = id[i];
            newStudent.firstName = firstName[i];
            newStudent.lastName = lastName[i];
            newStudent.age = age[i];
            students.add(newStudent);
            System.out.println(students.get(i).id + " " + students.get(i).firstName + " " + students.get(i).lastName + " " + students.get(i).age);
        }
        System.out.println();

        /*1. Реализовать метод сортировки коллекции по одному из полей (например, возраст)*/

        Comparator<Student> byStudentAge = (a1, a2) -> Integer.compare(a1.getAge(), a2.getAge());
        System.out.println("Sorted the group of students by AGE: ");
        students
                .stream()
                .sorted(byStudentAge)
                .forEach(e -> System.out.println(e.age + " " + e.firstName + " " + e.lastName + " " + e.id));
        System.out.println();

        /*2. Реализовать метод, который выберет (отфильтрует) всех студентов, чья фамилия начинается на определенную букву (метод возращает лист подходящих объетов)*/

        System.out.print("Input the letter: ");
        String letter = in.nextLine().toUpperCase();
        students
                .stream()
                .filter(p -> (Character.toString(p.getLastName().charAt(0)).equalsIgnoreCase(Character.toString(letter.charAt(0)))))
                .forEach(e -> System.out.println(e.age + " " + e.firstName + " " + e.lastName + " " + e.id));
        System.out.println();

        /*3. Реализовать метод, который посчитает среднее арифметическое по возрасту студентов (метод возращает средний арифметический возраст студентов)*/

        System.out.print("Average of students age: ");
        double average = students
                .stream()
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();
        System.out.println(average);
        System.out.println();

        /*4. Реализовать метод, который преобразует лист студентов в мапу <id студента - студент> (метод возвращает Map) */

        Map<Integer, String> map =
                students
                        .stream()
                        .collect(Collectors.toMap(p -> p.getId(), p -> p.getFirstName()));
        System.out.println("Map: " + map);
        System.out.println();

          /*5. Из Map предыдущего пункта отобрать (отфильтровать) студентов, id которых больше 100 (метод возвращает Map) */

        System.out.print("The students whose id more than 100: ");
        map.entrySet()
                .stream()
                .filter(p -> p.getKey() > 100)
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
