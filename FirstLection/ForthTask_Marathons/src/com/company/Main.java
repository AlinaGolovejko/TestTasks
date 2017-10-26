package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        List<Runner> runners = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            Runner newRunner = new Runner();
            newRunner.time = times[i];
            newRunner.name = names[i];
            runners.add(newRunner);
        }
        runners.sort(new Comparator<Runner>() {
            @Override
            public int compare(Runner r1, Runner r2) {
                if (r1.time == r2.time) {
                    return 0;
                }
                return r1.time < r2.time ? -1 : 1;
            }
        });
        for (int i = 0; i < runners.size(); i++) {
            System.out.println(runners.get(i).name + " - " + runners.get(i).time);
        }

        while (true) {
            System.out.println();
            System.out.print("Введите место бегуна: ");
            Integer number_place = in.nextInt();
            if (number_place == 1) {
                    System.out.print("Победитель марафона: ");
            } else if (number_place == 2) {
                System.out.print("Прибежал вторым: ");
            }  else if (number_place < 0 || number_place > runners.size()){
                System.out.print("Такого бегуна в марафоне нет :) Попробуйте снова.");
                continue;
            }  else {
                System.out.print("Занял " + number_place + " место в марафоне: ");
            }
            System.out.println(place(number_place, runners));
        }
}
    private static String place(int number_place, List<Runner> runners) {
        Runner runner = runners.get(number_place - 1);
        return runner.name + " - " + runner.time;
    }
}
