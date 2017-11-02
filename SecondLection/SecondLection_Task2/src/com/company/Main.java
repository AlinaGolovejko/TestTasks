package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] id = {1, 200, 32, 467, 590, 66, 709, 86, 99, 103};
        String[] firstName = {"Alina", "Elena", "Pavel", "Sergey", "Natalia", "Ivan", "Liza", "Dima", "Viktor", "Anna"};
        String[] lastName = {"Gol", "Mic", "Put", "Trip", "Zal", "Rep", "Glad", "Kov", "Yrt", "Mat"};
        int[] age = {21, 22, 23, 24, 26, 20, 19, 28, 27, 18};
        List<Student> students = new ArrayList<>();
        System.out.println("List of students: ");
        for (int i = 0; i < lastName.length; i++){
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
        students.sort(new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.age == o2.age) {
                return 0;
            }
            return o1.age < o2.age ? -1 : 1;
        }
        });
        System.out.println("List of students sorted by age: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).id + " " + students.get(i).firstName + " " + students.get(i).lastName + " " + students.get(i).age);
        }
        System.out.println();

        /*2. Реализовать метод, который выберет (отфильтрует) всех студентов, чья фамилия начинается на определенную букву (метод возращает лист подходящих объетов)*/
        System.out.print("Input the first letter of Last Name: ");
        String letter = in.nextLine();
        int flag = 0;
        for (int i = 0; i < students.size(); i++){
            if (Character.toString(letter.charAt(0)).equalsIgnoreCase(Character.toString(students.get(i).lastName.charAt(0)))){
                System.out.println(students.get(i).id + " " + students.get(i).firstName + " " + students.get(i).lastName + " " + students.get(i).age);
                flag++;
            }
        }
        if (flag == 0){
            System.out.println("Students whose last name begins with a specified letter, not detected.");
        }
        System.out.println();

        /*3. Реализовать метод, который посчитает среднее арифметическое по возрасту студентов (метод возращает средний арифметический возраст студентов)*/
        int totalAge = 0;
        int count = 0;
        for (int i = 0; i < students.size(); i++){
            totalAge += age[i];
            count++;
        }
        totalAge = totalAge/count;
        System.out.println("Total age of all students: " + totalAge);
        System.out.println();

        /*4. Реализовать метод, который преобразует лист студентов в мапу <id студента - студент> (метод возвращает Map) */
        Map<Integer, Student> students2 = new HashMap<>();
        for (int i = 0; i < id.length; i++){
            students2.put(id[i], students.get(i));
        }
        for (Map.Entry entry : students2.entrySet()) {
            Student st = (Student) entry.getValue();
            System.out.println("ID - " + entry.getKey() + ", Student - " + st.firstName + " " + st.lastName);
        }
        System.out.println();

        /*5. Из Map предыдущего пункта отобрать (отфильтровать) студентов, id которых больше 100 (метод возвращает Map) */
        for (Map.Entry entry : students2.entrySet()) {
            Student st = (Student) entry.getValue();
            if ((int) entry.getKey() > 100) {
                System.out.println("ID - " + entry.getKey() + ", Student - " + st.firstName + " " + st.lastName);
            }
        }
    }
}
