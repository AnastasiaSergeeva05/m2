package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        System.out.println(" ");
        int[] arr = new int[30];
        int pay = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_000) + 100_000;
            pay += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

            sum = pay / 30;
        }


        System.out.println(Arrays.toString(arr));
        System.out.println("«Сумма трат за месяц составила " + pay + " рублей»");

        System.out.println("Домашнее задание 2");
        System.out.println(" ");
        System.out.println("«Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей»");

        System.out.println("Домашнее задание 3");
        System.out.println(" ");
        System.out.println("«Средняя сумма трат за месяц составила " + sum + " рублей»");


        System.out.println("Домашнее задание 4");
        System.out.println(" ");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; reverseFullName.length / 2 > i; i++) {
            char tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = tmp;
        }
        System.out.println(reverseFullName);

    }
}
