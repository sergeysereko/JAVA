
/*Задание 11
Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
Метод принимает в качестве параметра: длину линии,
направление, символ.*/
import java.util.Scanner;
public class Eleventh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите длину линии: ");
        int length = scanner.nextInt();

        System.out.print("Введите направление \n" +
                "horizontal - кнопка 1\n" +
                "vertical - кнопка 2): ");
        int direction = scanner.nextInt();

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);


        drawLine(length, direction, symbol);


        scanner.close();
    }

    static void drawLine(int length, int direction, char symbol) {
        if (direction == 1) {
            drawHorizontalLine(length, symbol);
        } else if (direction == 2) {
            drawVerticalLine(length, symbol);
        } else {
            System.out.println("Некорректное направление. Используйте 1 или 2");
        }
    }

    static void drawHorizontalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol); // на одной строке
        }
    }

    static void drawVerticalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.println(symbol); // на новой строке
        }
    }
}
