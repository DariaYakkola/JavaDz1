package HomeWork;

import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
//        Перевернуть строку
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String proposition = sc.nextLine();
        String[] words = proposition.split(" ");
        String[] result = new String[words.length];
        int j = words.length - 1;
        for (int i = 0; i < words.length; i++) {
            result[i] = words[j];
            j--;
        }
        System.out.println("Перевернутая строка: ");
        System.out.println(Arrays.toString(result));
    }
}