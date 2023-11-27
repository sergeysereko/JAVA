
/*Показать на экран таблицу умножения в диапазоне,
указанном пользователем. Например, если пользователь
указал 3 и 5, таблица может выглядеть так:
3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
……………………………………………………
5*1 = 5 5 *2 = 10 5 *3 = 15 ………….*/

import java.util.Scanner;

public class Eighth {

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

            for(int j = 1; j < 11; j++){

                int result = i * j;
                System.out.println(i + " * " + j + " = " + result );
            }

        }

        scanner.close();
    }
}
