/*Задание 7
Пользователь вводит с клавиатуры два числа. Нужно
показать все нечетные числа в указанном диапазоне. Если
границы диапазона указаны неправильно требуется произвести нормализацию границ. Например, пользователь
ввел 20 и 11, требуется нормализация, после которой
начало диапазона станет равно 11, а конец 20. */

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввдеите первое число диапазона: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число диапазона: ");
        int lastNumber = scanner.nextInt();

        if(firstNumber > lastNumber)
        {
            int temp = firstNumber;
            firstNumber = lastNumber;
            lastNumber = temp;
        }

        for(int i = firstNumber; i <= lastNumber; i++){

            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }

        scanner.close();

    }
}
