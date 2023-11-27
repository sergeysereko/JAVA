/*Задание 5
Пользователь вводит с клавиатуры номер месяца (от
1 до 12). В зависимости от полученного номера месяца
программа выводит на экран надпись: Winter (если введено
значение 1,2 или 12), Spring (если введено значение от 3
до 5), Summer (если введено значение от 6 до 8), Autumn
(если введено значение от 9 до 11).
Если пользователь ввел значение не в диапазоне от 1
до 12 требуется вывести сообщение об ошибке.*/


import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int numberMonth = scanner.nextInt();

        if(numberMonth >= 1 && numberMonth <= 2 || numberMonth == 12) {
            System.out.println("Winter");
        }
        else if(numberMonth >= 3 && numberMonth <= 5){
            System.out.println("Spring");
        }
        else if (numberMonth >= 6 && numberMonth <= 8) {
            System.out.println("Summer");
        }
        else if (numberMonth >= 9 && numberMonth <= 11) {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Error");
        }

        scanner.close();
    }

}
