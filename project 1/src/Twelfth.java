/*Напишите метод, сортирующий массив по убыванию
или возрастанию в зависимости от выбора пользователя.*/
import java.util.Arrays;
import java.util.Scanner;
public class Twelfth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }


        System.out.println("Исходный массив: ");
        for(int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ",");
        }



        System.out.print("\nВыберите направление сортировки\n возрастание - кнопка 1\n убывание - кнопка 2: ");
        int direction = scanner.nextInt();


        sortArray(array, direction);

        System.out.println("Отсортированный массив: ");
        for(int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ",");
        }

        scanner.close();
    }


    static void sortArray(int[] array, int direction) {
        if (direction == 1) {
            Arrays.sort(array);
        } else if (direction == 2) {
            Arrays.sort(array);
            // инвертируем массив
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Некорректное направление сортировки. Используйте 1 или 2.");
            return;
        }
    }
}
