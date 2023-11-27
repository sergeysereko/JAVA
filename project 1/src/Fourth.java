/*Задание 4
Пользователь вводит шестизначное число. Необходимо
поменять в этом числе первую и шестую цифры, а также
вторую и пятую цифры.
Например, 723895 должно превратиться в 593827.
Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке.*/

import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначное число :");

        String number = scanner.next().trim();

        if (number.length() != 6) {
            System.out.println("Ошибка! Введите шестизначное число.");
            scanner.close();
            return;
        }

        char[] charArray = number.toCharArray();
        // Создание массива цифр
        int[] digits = new int[6];

        for (int i = 0; i < 6; i++) {
            digits[i] = Character.getNumericValue(charArray[i]);
        }

        { // меняем цифры
            int temp = digits[0];
            digits[0] = digits[5];
            digits[5] = temp;
            int temp2 = digits[1];
            digits[1] = digits[4];
            digits[4] = temp2;
        }

        // Вывод массива цифр
        int combinedNumber = 0;
        for (int digit : digits) {
            combinedNumber = combinedNumber * 10 + digit;
        }


        System.out.println("Модифицированное число - " + combinedNumber);

        scanner.close();

    }
}