/*Задание 9
В одномерном массиве, заполненном случайными
числами, определить минимальный и максимальный
элементы, посчитать количество отрицательных элементов, посчитать
количество положительных элементов, посчитать количество нулей. Результаты вывести
на экран. */
import java.util.Random;
public class Ninth {

    public static void main(String[] args) {

        int arraySize = 20;


        Random random = new Random();


        int[] randomArray = new int[arraySize];


        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(21) - 10;
        }


        System.out.print("Случайный массив: ");
        for (int number : randomArray) {
            System.out.print(number + " ");
        }


        int min = randomArray[0];
        int max = randomArray[0];


        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        for (int number : randomArray) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < 0) {
                countNegative++;
            } else if (number > 0) {
                countPositive++;
            } else {
                countZero++;
            }
        }


        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + countNegative);
        System.out.println("Количество положительных элементов: " + countPositive);
        System.out.println("Количество нулей: " + countZero);
    }
}
