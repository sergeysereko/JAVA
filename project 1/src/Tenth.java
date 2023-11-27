/*Задание 10
Есть одномерный массив, заполненный случайными
числами. На основании данных этого массива нужно:
■ Создать одномерный массив, содержащий только
четные числа из первого массива;
■ Создать одномерный массив, содержащий только
нечетные числа из первого массива;
■ Создать одномерный массив, содержащий только
отрицательные числа из первого массива;
■ Создать одномерный массив, содержащий только
положительные числа из первого массива.*/

import java.util.Random;
public class Tenth {

        public static void main(String[] args) {

            int arraySize = 20;


            Random random = new Random();


            int[] randomArray = new int[arraySize];


            for (int i = 0; i < arraySize; i++) {
                randomArray[i] = random.nextInt(21) - 10;
            }


            System.out.print("Исходный массив: ");
            for (int number : randomArray) {
                System.out.print(number + " ");
            }


            int[] evenArray = new int[arraySize];
            int[] oddArray = new int[arraySize];
            int[] negativeArray = new int[arraySize];
            int[] positiveArray = new int[arraySize];

            // Счетчики для новых массивов
            int evenCount = 0;
            int oddCount = 0;
            int negativeCount = 0;
            int positiveCount = 0;

            // Фильтрация чисел
            for (int number : randomArray) {
                if (number % 2 == 0) {
                    evenArray[evenCount++] = number;
                } else {
                    oddArray[oddCount++] = number;
                }

                if (number < 0) {
                    negativeArray[negativeCount++] = number;
                } else if (number > 0) {
                    positiveArray[positiveCount++] = number;
                }
            }

            // Выводим результаты
            printArray("Массив четных чисел: ", evenArray, evenCount);
            printArray("Массив нечетных чисел: ", oddArray, oddCount);
            printArray("Массив отрицательных чисел: ", negativeArray, negativeCount);
            printArray("Массив положительных чисел: ", positiveArray, positiveCount);
        }

        // Метод для вывода массива
        private static void printArray(String label, int[] array, int count) {
            System.out.print("\n" + label);
            for (int i = 0; i < count; i++) {
                System.out.print(array[i] + " ");
            }
        }
}
