package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final int NUMBERS = 1000000;
        final int ADD_DELETE_SEARCH = 1000;
        Scanner in = new Scanner(System.in);
        final Random random = new Random();

        //Генерация ArrayList и LinkedList
        long startAdd = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < NUMBERS; i++) {
            arrayList.add(random.nextInt(NUMBERS));
        }
        long timeWorkCode = System.currentTimeMillis() - startAdd;
        System.out.println("Скорость заполнения ArrayList: " + timeWorkCode + " миллисекунд");
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startAdd1 = System.currentTimeMillis();
        for (int i = 0; i < NUMBERS; i++) {
            linkedList.add(random.nextInt(NUMBERS));
        }
        long timeWorkCode1 = System.currentTimeMillis() - startAdd1;
        System.out.println("Скорость заполнения LinkedList: " + timeWorkCode1 + " миллисекунд");

        long addTime = timeWorkCode - timeWorkCode1;
        System.out.println("Разница во времени заполнения ArrayList и LinkedList: " + addTime + " миллисекунд");
        System.out.println();

        //Добавление 1000 элементов
        long startAddElements = System.currentTimeMillis();
        for (int i = 0; i < ADD_DELETE_SEARCH; i++) {
            arrayList.add(random.nextInt(NUMBERS));
        }
        long timeWorkAddElements = System.currentTimeMillis() - startAddElements;
        System.out.println("Скорость добавления элементов в ArrayList: " + timeWorkAddElements + " миллисекунд");

        long startAddElements1 = System.currentTimeMillis();
        for (int i = 0; i < ADD_DELETE_SEARCH; i++) {
            linkedList.add(random.nextInt(NUMBERS));
        }
        long timeWorkAddElements1 = System.currentTimeMillis() - startAddElements1;
        System.out.println("Скорость добавления элементов в LinkedList: " + timeWorkAddElements1 + " миллисекунд");

        long addElementsTime = timeWorkAddElements - timeWorkAddElements1;
        System.out.println("Разница во времени добавления элементов в ArrayList и LinkedList: " + addElementsTime + " миллисекунд");
        System.out.println();

        //Удаление 1000 элементов
        long startDeleteElements = System.currentTimeMillis();
        for (int i = 0; i < ADD_DELETE_SEARCH; i++) {
            int index = random.nextInt(arrayList.size());
            arrayList.remove(index);
        }
        long timeWorkDeleteElements = System.currentTimeMillis() - startDeleteElements;
        System.out.println("Скорость удаления элементов из ArrayList: " + timeWorkDeleteElements + " миллисекунд");

        long startDeleteElements1 = System.currentTimeMillis();
        for (int i = 0; i < ADD_DELETE_SEARCH; i++) {
            int index = random.nextInt(linkedList.size());
            linkedList.remove(index);
        }
        long timeWorkDeleteElements1 = System.currentTimeMillis() - startDeleteElements1;
        System.out.println("Скорость удаления элементов из LinkedList: " + timeWorkDeleteElements1 + " миллисекунд");

        long deleteElementsTime = timeWorkDeleteElements - timeWorkDeleteElements1;
        System.out.println("Разница во времени удаления элементов в ArrayList и LinkedList: " + deleteElementsTime + " миллисекунд");
        System.out.println();

        //Поиск 1000 элементов
        long startSearchElements = System.currentTimeMillis();
        for (int i = 0; i < ADD_DELETE_SEARCH; i++) {
            int search = random.nextInt(arrayList.size());
            arrayList.contains(search);
        }

        long timeWorkSearchElements = System.currentTimeMillis() - startSearchElements;
        System.out.println("Скорость поиска элементов в ArrayList: " + timeWorkSearchElements + " миллисекунд");

        long startSearchElements1 = System.currentTimeMillis();
        for (int i = 0; i < ADD_DELETE_SEARCH; i++) {
            int search = random.nextInt(linkedList.size());
            linkedList.contains(search);
        }
        long timeWorkSearchElements1 = System.currentTimeMillis() - startSearchElements1;
        System.out.println("Скорость поиска элементов в LinkedList: " + timeWorkSearchElements1 + " миллисекунд");

        long searchElementsTime = timeWorkSearchElements - timeWorkSearchElements1;
        System.out.println("Разница во времени поиска элементов в ArrayList и LinkedList: " + searchElementsTime + " миллисекунд");
    }
}


