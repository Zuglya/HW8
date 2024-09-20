//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        //todo код программы писать тут
//        int[] people = new int[10];
//        for(int i = 0; i < people.length; i++) {
//            people[i] = new Random().nextInt(40, 100);
//        }
//        for(int i = 0; i < people.length; i++) {
//            System.out.print(people[i] + " ");;
//        }
//        System.out.println();
//
//        double summ = 0;
//        int peopleCount = 0;
//        for(int i = 0; i < people.length; i++) {
//            summ = summ + people[i];
//            if (people[i] >= 60 && people[i] <= 80) {
//                peopleCount++;
//            }
//        }
//        System.out.println("Средний вес всех людей = " + summ / people.length);
//        System.out.println("Количество людей у которых вес от 60 до 80 кг = " + peopleCount);
//    }
//}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] people = new double[10];
        double summ = 0;
        int peopleCount = 0;

        for(int i = 0; i < people.length; i++) {
            people[i] = new Random().nextDouble(40, 100);
            summ = summ + people[i];
            if (people[i] >= 60 && people[i] <= 80) {
                peopleCount++;
            }
        }

        for(int i = 0; i < people.length; i++) {
            System.out.print(people[i] + " ");;
        }
        System.out.println();
        System.out.println("Средний вес всех людей = " + summ / people.length);
        System.out.println("Количество людей у которых вес от 60 до 80 кг = " + peopleCount);
    }
}