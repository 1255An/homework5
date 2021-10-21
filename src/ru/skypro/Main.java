package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// homework 5

        //task1
        int [] payment = generateRandomArray ();
        int sum = 0;
        for (int element: payment) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        //task2
        int maxPayment = -1;
        int minPayment = payment [0];
        for (int i = 0 ; i < payment.length; i ++) {
            if (payment [i] > maxPayment) {
                maxPayment = payment [i];
            }
            if (payment [i] < minPayment) {
                minPayment = payment [i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " рублей");

        //task3
        float avgPayment = 0f;
        float summ =0f;
        for (int i = 0 ; i < payment.length ; i ++) {
            summ += payment [i];
            avgPayment = summ / payment.length ;
        }
        System.out.println("Средняя сумма трат за месяц составила " + avgPayment + " рублей");

        //task4
        char [] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I' };
        for ( int i = reverseFullName.length -1 ; i >= 0 ; i-- ) {
            System.out.print(reverseFullName [i]);
        }
        System.out.println();

        //task6
        int [] a = {5,4,3,2,1};
        for (int i = 0; i < a.length; i ++) {
            System.out.print(a[i]);
        }
        System.out.println();
            Arrays.sort(a);
            for (int i = 0; i < a.length; i ++) {
            System.out.print(a[i]);
        }

    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random ();
        int [] payment = new int [30];
        for (int i = 0; i < payment.length; i++) {
            payment [i] = random.nextInt (100_000) + 100_000;
        }
        return payment;
    }
}
