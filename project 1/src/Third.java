/*Задание 3
Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.*/

import java.util.Scanner;
public class Third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String firstNumber = scanner.next();
        String trimFirstNumber = firstNumber.trim();

        System.out.print("Введите второе число: ");
        String secondNumber = scanner.next();
        String trimSecondNumber = secondNumber.trim();

        System.out.print("Введите третье число: ");
        String thirdNumber = scanner.next();
        String trimThirdNumber = thirdNumber.trim();

        String union = trimFirstNumber + trimSecondNumber + trimThirdNumber;

        int result = Integer.parseInt(union);

        System.out.println("Ваше число - "+ result);

        scanner.close();
    }
}
