package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Дана последовательность целых чисел, оканчивающаяся нулем.
        // Найти сумму положительных чисел, после которых следует отрицательное число.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number1 = sc.nextInt();
        System.out.println("Введите число: ");
        int number2 = sc.nextInt();
        int sum = 0;
        while (number2 != 0) {
            if (number1 > 0 && number2 < 0) {
                sum += number1;
            }
            number1 = number2;
            System.out.println("Введите число: ");
            number2 = sc.nextInt();

        }
        System.out.println("Сумма чисел равна: " + sum);

    }
}
