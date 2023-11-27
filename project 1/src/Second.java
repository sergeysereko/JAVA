
/*Задание 2
Пользователь вводит с клавиатуры два числа. Первое
число — это значение, второе число процент, который
необходимо посчитать. Например, мы ввели с клавиатуры
50 и 10. Требуется вывести на экран 10 процентов от 50.
Результат: 5*/

import java.util.Scanner;
public class Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        System.out.print("Введите процент: ");
        double percent = scanner.nextDouble();

         double result = 0.0;
         result = (percent * number)/100;

         System.out.println(percent+ "%"+ " от "+ number + " составляет " + result);

         scanner.close();

    }
}
