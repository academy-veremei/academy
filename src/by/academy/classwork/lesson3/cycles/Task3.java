/*
 * Lesson 3 Циклы Задание 3
 *
 * 01.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson3.cycles;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int amount = 1;
        for (int i =1; i < number+1;i++){
            amount = amount * i;
        }
        System.out.println(amount);
    }
}
